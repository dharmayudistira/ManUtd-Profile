package com.pandecode.manutdprofile.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pandecode.manutdprofile.R
import com.pandecode.manutdprofile.util.setupWithNavController

class MainActivity : AppCompatActivity() {

    private var currentNavController: LiveData<NavController>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        }

    }

    private fun setupBottomNavigationBar() {
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        //customise start selected item
        bottomNavigationView.selectedItemId = R.id.nav_home

        val navGraphIds = listOf(R.navigation.nav_home, R.navigation.nav_about)

        //setup the bottom navigation view with a list of navigation graphs
        val controller = bottomNavigationView.setupWithNavController(
            navGraphIds = navGraphIds,
            fragmentManager = supportFragmentManager,
            containerId = R.id.nav_host_container,
            intent = intent
        )

        //whenever the selected controller changes, setup the action bar.
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        controller.observe(this, { navController ->
            NavigationUI.setupWithNavController(toolbar, navController)
        })

        currentNavController = controller

        toolbar.title = resources.getString(R.string.home)
        setSupportActionBar(toolbar)
    }

    override fun onSupportNavigateUp(): Boolean {
        return currentNavController?.value?.navigateUp() ?: false || super.onSupportNavigateUp()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        // now that BottomNavigationBar has restored its intance state
        setupBottomNavigationBar()
    }
}