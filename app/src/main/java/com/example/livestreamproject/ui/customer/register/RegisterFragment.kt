package com.example.livestreamproject.ui.customer.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.appbase.base.fragment.BaseFragment
import com.example.livestreamproject.databinding.FragmentRegisterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterFragment: BaseFragment() {

    private lateinit var dataBinding: FragmentRegisterBinding
    private val viewModel by viewModels<RegisterViewModel>()
    private val args by navArgs<RegisterFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.fetchData(args.id)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dataBinding = FragmentRegisterBinding.inflate(inflater, container, false)
        dataBinding.lifecycleOwner = viewLifecycleOwner
        dataBinding.registerViewModel = viewModel
        return dataBinding.root
    }

}

