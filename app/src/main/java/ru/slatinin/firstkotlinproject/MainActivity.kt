package ru.slatinin.firstkotlinproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONObject
import ru.slatinin.firstkotlinproject.database.AppDatabase
import java.net.URL
import java.util.*
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {

    lateinit var appDatabase: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appDatabase = Room.databaseBuilder(this, AppDatabase::class.java, "first_kotlin_project").allowMainThreadQueries().build()
        appDatabase.userDao().getAll()
        CoroutineScope(Dispatchers.IO).launch { getWeatherJson() }
        val f = WeatherFragment();
        supportFragmentManager.beginTransaction().add(R.id.main_container, f).commit()

    }


    fun getWeatherJson() {
        val url =
            URL("https://api.openweathermap.org/data/2.5/onecall?lat=56.131472&lon=47.247462&exclude=hourly&units=metric&appid=" + BuildConfig.WAPK)
        with(url.openConnection() as HttpsURLConnection) {
            requestMethod = "GET"
            inputStream.bufferedReader().use {
                val resp = it.readText()
                val weatherJSON = JSONObject(resp)
                val current = weatherJSON.getJSONObject("current")
                val dt = current.getLong("dt")
                val cl = Calendar.getInstance()
                cl.timeInMillis = dt*1000
                runOnUiThread {  Toast.makeText(baseContext, cl.time.toString(), Toast.LENGTH_LONG).show() }
            }
        }
    }
}

