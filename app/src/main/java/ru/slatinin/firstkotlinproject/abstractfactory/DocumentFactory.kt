package ru.slatinin.firstkotlinproject.abstractfactory

import android.view.ViewGroup

interface DocumentFactory {
    fun paintFields(parent: ViewGroup)
    fun getDocName(): String
}