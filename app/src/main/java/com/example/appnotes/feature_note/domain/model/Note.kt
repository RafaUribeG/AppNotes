package com.example.appnotes.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.appnotes.ui.BabyBlue
import com.example.appnotes.ui.LightGreen
import com.example.appnotes.ui.RedOrange
import com.example.appnotes.ui.RedPink
import com.example.appnotes.ui.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object{
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message:String):Exception(message)
