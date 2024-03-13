package com.doaamosallam.splitifyapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.doaamosallam.splitifyapp.R
import com.doaamosallam.splitifyapp.databinding.FragmentHomeBinding

class HomeFragment :Fragment() {
    private lateinit var bindingHome: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingHome = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        bindingHome.fab.setOnClickListener { view ->
            // go to HistoryFragment
            val action = HomeFragmentDirections.actionHomeFragmentToHistoryFragment()
            view.findNavController().navigate(action)
        }

        return bindingHome.root
    }
}