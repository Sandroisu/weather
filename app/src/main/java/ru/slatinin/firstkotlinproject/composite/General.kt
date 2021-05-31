package ru.slatinin.firstkotlinproject.composite

import android.widget.LinearLayout

class General() {
    private lateinit var armyUnits:List<ArmyUnit>

    fun loadArmy(vararg armyUnit: ArmyUnit){
        armyUnits = armyUnit.asList()
    }

    fun attack(linearLayout: LinearLayout){
        for (item in armyUnits){
            item.attack(linearLayout)
        }
    }

    fun defend(linearLayout: LinearLayout){
        for (item in armyUnits){
            item.defend(linearLayout)
        }
    }
}