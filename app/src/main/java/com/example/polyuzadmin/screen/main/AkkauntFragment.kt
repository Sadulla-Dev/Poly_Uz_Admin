package com.example.polyuzadmin.screen.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.polyuzadmin.R


class AkkauntFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_akkaunt, container, false)
    }
    companion object {
        fun newInstance() : AkkauntFragment{
           return AkkauntFragment()

        }

    }

}