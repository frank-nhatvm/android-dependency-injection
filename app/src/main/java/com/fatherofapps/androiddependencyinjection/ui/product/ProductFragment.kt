package com.fatherofapps.androiddependencyinjection.ui.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.fatherofapps.androiddependencyinjection.MyApplication
import com.fatherofapps.androiddependencyinjection.R
import com.fatherofapps.androiddependencyinjection.di.ViewModelFactory

class ProductFragment : Fragment() {

    lateinit var viewModelFactory: ViewModelFactory

    lateinit var productViewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        productViewModel.getProductDetail()
    }

    private fun  initViewModel(){
        viewModelFactory = (requireActivity().application as MyApplication).appContainer.viewModelFactory
        productViewModel = ViewModelProvider(this,viewModelFactory).get(ProductViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_product,null,false)

        return rootView
    }

}