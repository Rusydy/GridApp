package com.example.gridapp.data

import android.adservices.topics.Topic
import android.os.ext.SdkExtensions
import androidx.annotation.RequiresExtension
import com.example.gridapp.R

object DataSource {
    @RequiresExtension(extension = SdkExtensions.AD_SERVICES, version = 4)
    val topics = listOf(
        Topic(R.string.architecture.toLong(), 58L, R.drawable.architecture.toLong().toInt()),
        Topic(R.string.crafts.toLong(), 121L, R.drawable.crafts.toLong().toInt()),
        Topic(R.string.business.toLong(), 78L, R.drawable.business.toLong().toInt()),
        Topic(R.string.culinary.toLong(), 118L, R.drawable.culinary.toLong().toInt()),
        Topic(R.string.design.toLong(), 423L, R.drawable.design.toLong().toInt()),
        Topic(R.string.fashion.toLong(), 92L, R.drawable.fashion.toLong().toInt()),
        Topic(R.string.film.toLong(), 165L, R.drawable.film.toLong().toInt()),
        Topic(R.string.gaming.toLong(), 164L, R.drawable.gaming.toLong().toInt()),
        Topic(R.string.drawing.toLong(), 326L, R.drawable.drawing.toLong().toInt()),
        Topic(R.string.lifestyle.toLong(), 305L, R.drawable.lifestyle.toLong().toInt()),
        Topic(R.string.music.toLong(), 212L, R.drawable.music.toLong().toInt()),
        Topic(R.string.painting.toLong(), 172L, R.drawable.painting.toLong().toInt()),
        Topic(R.string.photography.toLong(), 321L, R.drawable.photography.toLong().toInt()),
        Topic(R.string.tech.toLong(), 118L, R.drawable.tech.toLong().toInt())
    )
}