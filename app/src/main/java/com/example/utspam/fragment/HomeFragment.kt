package com.example.utspam.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.utspam.R
import com.example.utspam.adapter.SliderAdapter
import com.example.utspam.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var binding : FragmentHomeBinding? = null
    lateinit var vpSlider : ViewPager
    lateinit var rvBaju : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //<-- Slider -->
        vpSlider = view.findViewById(R.id.vp_slider)

        val arraySlider = ArrayList<Int>()

        arraySlider.add(R.drawable.carousel1)
        arraySlider.add(R.drawable.carousel1)
        arraySlider.add(R.drawable.carousel1)

        val sliderAdapter = SliderAdapter(arraySlider, activity)
        vpSlider.adapter = sliderAdapter

        return view
    }

}