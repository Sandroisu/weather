package ru.slatinin.firstkotlinproject.abstractfactory

import android.view.ViewGroup
import android.widget.Spinner

class SpinnerEditable: EditableField {
    override fun paintEditableField(parent: ViewGroup) {
        val spinner = Spinner(parent.context)
        parent.addView(spinner)
    }
}