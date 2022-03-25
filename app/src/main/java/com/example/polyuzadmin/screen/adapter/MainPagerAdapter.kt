package com.example.polyuzadmin.screen.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.polyuzadmin.screen.main.AkkauntFragment
import com.example.polyuzadmin.screen.main.HomeFragment
import com.example.polyuzadmin.screen.main.KalendarFragment
import com.example.polyuzadmin.screen.main.StatistikaFragment

class MainPagerAdapter(fm: FragmentManager): FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> HomeFragment.newInstance()
            1 -> KalendarFragment.newInstance()
            2 -> StatistikaFragment.newInstance()
            3 -> AkkauntFragment.newInstance()
            else -> HomeFragment.newInstance()
        }
    }
}