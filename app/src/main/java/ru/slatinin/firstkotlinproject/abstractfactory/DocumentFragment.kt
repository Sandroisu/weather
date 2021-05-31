package ru.slatinin.firstkotlinproject.abstractfactory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import ru.slatinin.firstkotlinproject.R

class DocumentFragment(private var documentFactory: DocumentFactory) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_document, container, false)
        val linLay = v.findViewById<LinearLayout>(R.id.document_parent_view)
        documentFactory.paintFields(linLay)
        return v
    }
}