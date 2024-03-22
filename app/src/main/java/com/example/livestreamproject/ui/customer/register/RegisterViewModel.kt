package com.example.livestreamproject.ui.customer.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.appbase.base.viewmodel.BaseViewModel
import com.example.baseprojectxml.common.Event
import com.example.livestreamproject.data.models.Customer
import com.example.livestreamproject.enum.NavigationId
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor() : BaseViewModel() {

    private var _addCustomerSuccess = MutableLiveData<Event<Boolean>>()
    val addCustomerSuccess : LiveData<Event<Boolean>>
        get() = _addCustomerSuccess

    private var _currentCustomer = MutableLiveData<Customer?>()
    val currentCustomer: LiveData<Customer?>
        get() = _currentCustomer

    fun fetchData(id: String) {
        if (id == NavigationId.REGISTER_FRAGMENT_ID.value) {

        }
    }

    private fun addNewCustomer(customer: Customer) {

    }

    fun registerAction() {
        currentCustomer.value?.let { customer ->
            addNewCustomer(customer)
        }
    }

    fun onFirstnameChanged(
        text: CharSequence?,
        start: Int,
        before: Int,
        count: Int
    ) {

    }

    fun onLastnameChanged(
        text: CharSequence?,
        start: Int,
        before: Int,
        count: Int
    ) {

    }

    fun onShortDescriptionChanged(
        text: CharSequence?,
        start: Int,
        before: Int,
        count: Int
    ) {

    }

}
