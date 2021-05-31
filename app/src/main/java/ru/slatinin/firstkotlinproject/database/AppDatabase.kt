package ru.slatinin.firstkotlinproject.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.slatinin.firstkotlinproject.database.methods.UserDao
import ru.slatinin.firstkotlinproject.database.models.User

@Database(entities = arrayOf(User::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}