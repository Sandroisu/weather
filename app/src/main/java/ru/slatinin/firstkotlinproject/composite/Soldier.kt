package ru.slatinin.firstkotlinproject.composite

import android.widget.LinearLayout
import android.widget.TextView

class Soldier(movementMethod: String) : BaseArmyUnit(movementMethod) {

    override fun attack(linearLayout: LinearLayout) {
        val textView = TextView(linearLayout.context)
        textView.text = "Soldiers move forward and fire at will\n They using"+getMoveMethod()
        linearLayout.addView(textView)
    }

    override fun defend(linearLayout: LinearLayout) {
        val textView = TextView(linearLayout.context)
        textView.text = "Soldiers move back to positions and hold it\n They using"+getMoveMethod()
        linearLayout.addView(textView)
    }
}