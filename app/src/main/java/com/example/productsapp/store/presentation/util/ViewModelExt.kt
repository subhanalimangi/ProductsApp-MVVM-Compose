package com.example.productsapp.store.presentation.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.productsapp.util.EventBus
import kotlinx.coroutines.launch

fun ViewModel.sendEvent(event: Any) {
    // send event
    viewModelScope.launch {
        EventBus.sendEvent(event)
    }
}