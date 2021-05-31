package ru.slatinin.firstkotlinproject.abstractfactory

import android.view.ViewGroup

class FailureDocumentFactory: DocumentFactory {
    override fun paintFields(parent: ViewGroup) {
        TextEditable().paintEditableField(parent)
        SpinnerEditable().paintEditableField(parent)
        TextNonEditable().paintNonEditableField(parent)
        TextNonEditable().paintNonEditableField(parent)
        TextNonEditable().paintNonEditableField(parent)
    }

    override fun getDocName(): String {
        TODO("Not yet implemented")
    }
}