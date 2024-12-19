package com.openwebinars.filmapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.openwebinars.filmapp.model.Film
import com.openwebinars.filmapp.model.NewsFilmsRepository
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {

    private val repository = NewsFilmsRepository()

    val newLifeData = MutableLiveData<List<Film>>()
    val isLoadingLifeData = MutableLiveData<Boolean>()

    fun onViewCreated() {
        viewModelScope.launch {
            isLoadingLifeData.postValue(true)
            val news = repository.get()
            newLifeData.postValue(news)
            isLoadingLifeData.postValue(false)
        }
    }

}