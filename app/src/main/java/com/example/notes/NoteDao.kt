package com.example.notesapp

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.notes.Note

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("Select *from notes_table order by id ASC")
    fun getAllNotes():LiveData<List<Note>>



}