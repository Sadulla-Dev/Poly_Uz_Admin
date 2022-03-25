package com.example.polyuzadmin.screen.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.polyuzadmin.R

class KalendarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kalendar, container, false)
    }

    companion object {
        fun newInstance() :KalendarFragment{
            return KalendarFragment()
        }

    }
}