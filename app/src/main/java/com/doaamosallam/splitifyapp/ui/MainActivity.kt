package com.doaamosallam.splitifyapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.doaamosallam.splitifyapp.BasicActivity
import com.doaamosallam.splitifyapp.R
import com.doaamosallam.splitifyapp.databinding.ActivityMainBinding

class MainActivity : BasicActivity<ActivityMainBinding> (){

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }

    override fun getLayoutId()= R.layout.activity_main

}