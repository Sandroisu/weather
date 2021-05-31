package ru.slatinin.firstkotlinproject

import android.content.Context

abstract class BaseHero {
    abstract fun createHero() : Hero
    fun fight(context:Context){
        createHero().doFighting(context)
    }
    fun conjure(context:Context){
        createHero().doMagic(context)
    }
    fun trade(context:Context){
        createHero().doTrading(context)
    }
}