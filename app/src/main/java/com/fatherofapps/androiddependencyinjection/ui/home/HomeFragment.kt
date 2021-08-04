package com.fatherofapps.androiddependencyinjection.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.fatherofapps.androiddependencyinjection.MainActivity
import com.fatherofapps.androiddependencyinjection.R
import com.fatherofapps.androiddependencyinjection.ui.cart.CartFragment
import com.fatherofapps.androiddependencyinjection.ui.product.ProductFragment

class HomeFragment: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView =  inflater.inflate(R.layout.fragment_home,null,false)

        rootView.findViewById<Button>(R.id.btnOpenProduct).setOnClickListener {
            (requireActivity() as MainActivity).openFragment(ProductFragment())
        }

        rootView.findViewById<Button>(R.id.btnOpenCart).setOnClickListener {
            (requireActivity() as MainActivity).openFragment(CartFragment())
        }

        return rootView
    }

}