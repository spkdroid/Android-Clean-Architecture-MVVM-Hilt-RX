package com.android.artgallery.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Photo(
    @PrimaryKey var id: Long,
    var title: String,
    val url: String,
    val thumbnailUrl: String?
){
    fun setName(text:String){
        title = text
    }
}