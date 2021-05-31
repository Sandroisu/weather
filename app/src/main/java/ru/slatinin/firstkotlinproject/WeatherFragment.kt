package ru.slatinin.firstkotlinproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import ru.slatinin.firstkotlinproject.composite.Division
import ru.slatinin.firstkotlinproject.composite.General
import ru.slatinin.firstkotlinproject.composite.Officer
import ru.slatinin.firstkotlinproject.composite.Soldier

class WeatherFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.weather_fragment, container, false);
        return v
    }


}