package ru.slatinin.firstkotlinproject.abstractfactory

import android.view.ViewGroup
import android.widget.EditText

class TextEditable:EditableField {
    override fun paintEditableField(parent: ViewGroup) {
        val editText =  EditText(parent.context)
        parent.addView(editText)
    }
}