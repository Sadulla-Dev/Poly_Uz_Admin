package com.example.polyuzadmin.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.polyuzadmin.R
import com.example.polyuzadmin.screen.adapter.MainPagerAdapter
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {


    private val adapter by lazy { MainPagerAdapter(childFragmentManager) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewPagerAdapter()
        setBottomNavigation()
    }

    private fun setViewPagerAdapter() {
        viewPager.adapter = adapter

    }
    private fun setBottomNavigation() {
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.homeMenuId -> {
                    viewPager.currentItem = 0
                }
                R.id.kalendarMenuId -> {
                    viewPager.currentItem = 1

                }
                R.id.statistikaMenuId -> {
                    viewPager.currentItem = 2
                }
                R.id.akkauntMenuId -> {
                    viewPager.currentItem = 3
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }


}