package ru.slatinin.firstkotlinproject

import android.content.Context
import android.widget.Toast

class Mag: BaseHero(), Hero {
    override fun doMagic(context: Context) {
        Toast.makeText(context, "Mag deals magic damage", Toast.LENGTH_LONG).show()
    }

    override fun doFighting(context:Context) {
        Toast.makeText(context, "Mag can't make physical damage", Toast.LENGTH_LONG).show()
    }

    override fun doTrading(context:Context) {
        Toast.makeText(context, "Mag made good deal", Toast.LENGTH_LONG).show()
    }

    override fun createHero(): Hero {
        return Mag()
    }
}