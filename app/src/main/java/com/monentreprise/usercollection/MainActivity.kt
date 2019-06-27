package com.monentreprise.usercollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.monentreprise.usercollection.bdd.entities.User
import com.monentreprise.usercollection.bdd.getDatabase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userDao = getDatabase(applicationContext)?.userDao()
        val john = User("John", 42)
        userDao?.insert(john)

        userDao?.getAll()?.get(0).let {
            Log.d("myDebug", "id : " + (it?.id ?: ""))
            Log.d("myDebug", "name : " + (it?.name ?: ""))
            Log.d("myDebug", "age : " + (it?.age ?: ""))
            ""
        }
    }
    
}



