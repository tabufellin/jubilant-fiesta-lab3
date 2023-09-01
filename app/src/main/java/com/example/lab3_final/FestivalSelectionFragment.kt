package com.example.lab3_final

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FestivalSelectionFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_festival_selection, container, false)

        // Configurar la selección de festivales y navegación a los siguientes fragmentos

        return view
    }
}
