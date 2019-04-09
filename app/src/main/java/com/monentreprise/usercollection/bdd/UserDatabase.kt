package com.monentreprise.usercollection.bdd

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.monentreprise.usercollection.bdd.entities.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}

private var INSTANCE: UserDatabase? = null

fun getDatabase(context: Context): UserDatabase? {
    if (INSTANCE == null) {
        INSTANCE = Room.databaseBuilder(
            context,
            UserDatabase::class.java,
            "user_db")
            .allowMainThreadQueries()
            .build()
    }
    return INSTANCE
}