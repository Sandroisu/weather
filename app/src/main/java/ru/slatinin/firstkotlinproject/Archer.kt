package ru.slatinin.firstkotlinproject

import android.content.Context
import android.widget.Toast

class Archer:BaseHero(), Hero {
    override fun doMagic(context: Context) {
        Toast.makeText(context, "Archer can't conjure", Toast.LENGTH_LONG).show()
    }

    override fun doFighting(context:Context) {
        Toast.makeText(context, "Archer deals ranged damage", Toast.LENGTH_LONG).show()
    }

    override fun doTrading(context:Context) {
        Toast.makeText(context, "Archer made bad deal", Toast.LENGTH_LONG).show()
    }

    override fun createHero(): Hero {
        return Archer()
    }
}