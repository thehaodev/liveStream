package com.example.livestreamproject.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.appbase.base.fragment.BaseFragment
import com.example.livestreamproject.databinding.FragmentHomeBinding
import com.example.livestreamproject.enum.NavigationId
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment() {

    private lateinit var dataBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dataBinding = FragmentHomeBinding.inflate(inflater)
        dataBinding.lifecycleOwner = viewLifecycleOwner
        return dataBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataBinding.btnNewCustomer.setOnClickListener {
            openRegisterFragment()
        }
    }

    private fun openRegisterFragment() {
        val action =
            HomeFragmentDirections.actionHomeFragmentToRegisterFragment(
                id = NavigationId.REGISTER_FRAGMENT_ID.value
            )

        findNavController().navigate(action)

    }

}