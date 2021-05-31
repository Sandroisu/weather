package ru.slatinin.firstkotlinproject.abstractfactory

import android.view.ViewGroup
import android.widget.TextView

class TextNonEditable: NonEditableField{
    override fun paintNonEditableField(parent: ViewGroup) {
        val textView = TextView(parent.context)
        textView.text = "Not editable"
        parent.addView(textView)
    }
}