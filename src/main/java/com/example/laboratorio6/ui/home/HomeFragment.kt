package com.example.laboratorio6.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.laboratorio6.R
import com.example.myapplication.ui.HomeViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        val boton: Button = root.findViewById(R.id.button2)
        homeViewModel.text.observe(this, Observer {
            textView.text = it
        })
        //listener para empezar la encuesta
        boton.setOnClickListener(){
            it.findNavController().navigate(R.id.action_nav_home_to_questionFragment)
        }
        //listener para el boton de añadir una pregunta
        val floting: FloatingActionButton = root.findViewById(R.id.floatingActionButton)
        floting.setOnClickListener(){
            it.findNavController().navigate(R.id.action_nav_home_to_addQuestionFragment)
        }
        return root
    }

    fun add(view: View){
        Navigation.findNavController(view).navigate(R.id.action_nav_home_to_addQuestionFragment)
    }

}