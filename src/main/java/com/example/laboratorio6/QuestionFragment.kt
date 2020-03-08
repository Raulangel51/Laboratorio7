package com.example.laboratorio6


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import androidx.navigation.findNavController

/**
 * A simple [Fragment] subclass.
 */
class QuestionFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_question, container, false)
        val rate: RatingBar = root.findViewById(R.id.ratingBar)
        rate.setOnClickListener(){

        }
        val boton: Button = root.findViewById(R.id.buttonResults)
        boton.setOnClickListener(){
            it.findNavController().navigate(R.id.action_questionFragment_to_resultsFragment)
        }
        return root
    }


}
