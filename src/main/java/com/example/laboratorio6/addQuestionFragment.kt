package com.example.laboratorio6


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.myapplication.ui.MainviewModel

/**
 * A simple [Fragment] subclass.
 */
class addQuestionFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val model: MainviewModel
        val root = inflater.inflate(R.layout.fragment_add_question, container, false)
        val boton: Button = root.findViewById(R.id.button)
        val text: EditText = root.findViewById(R.id.addQuestion)
        boton.setOnClickListener(){
            //model.addQuestion(text.text.toString())
        }
        return root
    }


}
