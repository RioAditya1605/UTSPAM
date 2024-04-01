package com.example.utspam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.utspam.databinding.ActivityMainBinding
import com.example.utspam.fragment.HomeFragment
import com.example.utspam.fragment.UserFragment
import com.example.utspam.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    lateinit var binding :ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupTab()
    }

    private fun setupTab() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeFragment(),"Home")
        adapter.addFragment(UserFragment(),"Profile")

        binding.viewPager.adapter = adapter
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.tabs.getTabAt(0)!!.setIcon(R.drawable.baseline_home_24)
        binding.tabs.getTabAt(1)!!.setIcon(R.drawable.baseline_people_24)
    }
}