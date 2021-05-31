package ru.slatinin.firstkotlinproject.composite

import android.content.Context
import android.widget.LinearLayout

interface ArmyUnit {
    fun attack(linearLayout: LinearLayout)
    fun defend(linearLayout: LinearLayout)
}