package com.andryux.quizapp.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

/**
 * Database access object to access the Countries database
 */
@Dao
interface CountryDao {

    @Query("SELECT * from country ORDER BY name ASC")
    fun getCountries(): Flow<List<Country>>

    @Query("SELECT * from country WHERE id = :id")
    fun getItem(id: Int): Flow<Country>

    //Specify the conflict strategy as IGNORE, when the user tries to add an
    //existing Country into the database
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(country: Country)

    @Update
    suspend fun update(country: Country)

    @Delete
    suspend fun delete(country: Country)
}