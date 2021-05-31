package ru.slatinin.firstkotlinproject.composite

import android.widget.LinearLayout

class Division(armyUnit: Array<BaseArmyUnit>, movementMethod: String) : BaseArmyUnit(movementMethod) {
    private val armyUnit:List<ArmyUnit> = armyUnit.asList()



    override fun attack(linearLayout: LinearLayout) {
        for (item in armyUnit){
            item.attack(linearLayout)
        }
    }

    override fun defend(linearLayout: LinearLayout) {
        for (item in armyUnit){
            item.defend(linearLayout)
        }
    }
}