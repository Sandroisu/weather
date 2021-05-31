package ru.slatinin.firstkotlinproject.composite

abstract class BaseArmyUnit(movementMethod: String) :ArmyUnit {
    private val moveMethod: String = movementMethod

    fun getMoveMethod():String{
        return moveMethod
    }

}