package com.example.lab3_final

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext

class CardCustomizationFragment : Fragment() {

    private lateinit var editTextName: EditText
    private lateinit var editTextLastName: EditText
    private lateinit var editTextMessage: EditText
    private lateinit var buttonCreateCard: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_card_customization, container, false)

        editTextName = view.findViewById(R.id.editTextName)

        editTextLastName = view.findViewById(R.id.editTextLastName)
        editTextMessage = view.findViewById(R.id.editTextMessage)
        buttonCreateCard = view.findViewById(R.id.buttonCreateCard)

        buttonCreateCard.setOnClickListener {
            val name = editTextName.text.toString()
            val lastName = editTextLastName.text.toString()
            val message = editTextMessage.text.toString()

            // Aquí puedes hacer algo con los datos ingresados, como crear la tarjeta

            // Por ejemplo, mostrar una notificación con los datos ingresados
            val cardText = "¡Feliz cumpleaños, $name $lastName!\n$message"
            Toast.makeText(context, cardText, Toast.LENGTH_LONG).show()
        }

        return view
    }

}
