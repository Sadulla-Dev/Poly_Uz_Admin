package com.example.polyuzadmin.screen.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.polyuzadmin.R
import com.example.polyuzadmin.screen.adapter.ZakazListadapter
import com.example.polyuzadmin.screen.model.ZakazModel
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {


    val zakazList = listOf(
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
        ZakazModel(""),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerZakaz.layoutManager = LinearLayoutManager(requireActivity())
        recyclerZakaz.adapter = ZakazListadapter(zakazList)
    }

    companion object {
        fun newInstance() : HomeFragment{
          return HomeFragment()
        }
    }
}