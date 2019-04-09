package com.monentreprise.usercollection.bdd.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey (autoGenerate = true) val id: Int,
    val name: String,
    val age: Int
){
    constructor(name: String, age: Int) : this(0, name, age)
}