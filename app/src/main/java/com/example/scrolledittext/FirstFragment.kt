package com.example.scrolledittext

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    private lateinit var edt: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        edt = view.findViewById(R.id.edt1)

        view.findViewById<Button>(R.id.btn1).setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_plusOneFragment)
        }
        val coordinator : CoordinatorLayout = view.findViewById(R.id.coordinator)
        ViewCompat.requestApplyInsets(coordinator)
    }
}
