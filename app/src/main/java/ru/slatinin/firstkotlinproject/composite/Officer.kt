package ru.slatinin.firstkotlinproject.composite

import android.widget.LinearLayout
import android.widget.TextView

class Officer(movementMethod: String) : BaseArmyUnit(movementMethod) {
    override fun attack(linearLayout: LinearLayout) {
        val textView = TextView(linearLayout.context)
        textView.text = "Officer sending order to attack to Soldiers\n He standing on"+getMoveMethod()
        linearLayout.addView(textView)
    }

    override fun defend(linearLayout: LinearLayout) {
        val textView = TextView(linearLayout.context)
        textView.text = "Officer sending order to defend to Soldiers\n He standing on"+getMoveMethod()
        linearLayout.addView(textView)
    }
}