package com.example.livestreamproject.ui.customer.common

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.appbase.base.viewmodel.BaseViewModel
import com.example.livestreamproject.data.models.Customer
import com.example.livestreamproject.data.models.toCustomer
import com.example.livestreamproject.data.repositories.CustomerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class CustomerViewModel @Inject constructor(private val customerRepository: CustomerRepository) :
    BaseViewModel() {

    private var _allCustomers = MutableLiveData<List<Customer>>()
    private val allCustomers: LiveData<List<Customer>>
        get() = _allCustomers

    fun getAll() {
        showLoading(true)
        parentJob = viewModelScope.launch(handler) {
            val customersEntities = customerRepository.getAll()
            _allCustomers.postValue(customersEntities.map { it.toCustomer() })
        }
    }


}