package com.fatherofapps.androiddependencyinjection.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.fatherofapps.androiddependencyinjection.MainActivity
import com.fatherofapps.androiddependencyinjection.MyApplication
import com.fatherofapps.androiddependencyinjection.R
import com.fatherofapps.androiddependencyinjection.ui.cart.CartFragment
import com.fatherofapps.androiddependencyinjection.ui.product.ProductFragment
import javax.inject.Inject

class HomeFragment: Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var homeViewModel: HomeViewModel

    private var data: String = ""

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as MyApplication).appComponent.inject(this)
        homeViewModel = ViewModelProvider(this,viewModelFactory).get(HomeViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        data = homeViewModel.getHomeData()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView =  inflater.inflate(R.layout.fragment_home,null,false)

        val tvData = rootView.findViewById<TextView>(R.id.tvData)
        tvData.text = data

        rootView.findViewById<Button>(R.id.btnOpenProduct).setOnClickListener {
            (requireActivity() as MainActivity).openFragment(ProductFragment())
        }

        rootView.findViewById<Button>(R.id.btnOpenCart).setOnClickListener {
            (requireActivity() as MainActivity).openFragment(CartFragment())
        }

        return rootView
    }

}