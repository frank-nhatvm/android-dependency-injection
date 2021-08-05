package com.fatherofapps.androiddependencyinjection.ui.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.fatherofapps.androiddependencyinjection.MyApplication
import com.fatherofapps.androiddependencyinjection.R

class ProductFragment : Fragment() {

    lateinit var productViewModel: ProductViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        productViewModel.getProductDetail()
    }

    private fun  initViewModel(){
        val productRepository = (requireActivity().application as MyApplication).appContainer.productRepository
        productViewModel = ProductViewModel(productRepository)
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