package com.monentreprise.usercollection.bdd

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.monentreprise.usercollection.bdd.entities.User

@Dao
interface UserDao {

    @Query("SELECT * FROM User")
    fun getAll() : List<User>

    @Query("SELECT * FROM User WHERE id = :id")
    fun getUserById(id: Int) : User

    @Insert
    fun insert(userEntity: User)

    @Delete
    fun deleteUser(user: User)

    @Query("DELETE FROM User")
    fun deleteAll()

}