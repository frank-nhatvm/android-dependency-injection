package com.fatherofapps.androiddependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.fatherofapps.androiddependencyinjection.ui.home.HomeFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (null == savedInstanceState) {
            openFragment(HomeFragment())
        }
    }

    fun openFragment(fragment: Fragment) {
        val name = fragment.javaClass.name
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, fragment, name)
        transaction.addToBackStack(name)
        transaction.commit()
    }

}