package ru.slatinin.firstkotlinproject.abstractfactory

import android.view.ViewGroup

class RestrictionDocumentFactory: DocumentFactory {
    override fun paintFields(parent: ViewGroup) {
        TextNonEditable().paintNonEditableField(parent)
        TextEditable().paintEditableField(parent)
        SpinnerEditable().paintEditableField(parent)
        SpinnerEditable().paintEditableField(parent)
        TextEditable().paintEditableField(parent)
    }

    override fun getDocName(): String {
        TODO("Not yet implemented")
    }
}