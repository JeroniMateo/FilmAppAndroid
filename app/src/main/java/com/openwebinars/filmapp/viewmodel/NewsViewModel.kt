package com.openwebinars.filmapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import com.openwebinars.filmapp.model.Film
import com.openwebinars.filmapp.model.FilmsProvider
import com.openwebinars.filmapp.model.NewsFilmsRepository

class NewsViewModel: ViewModel() {

    private val repository = NewsFilmsRepository()

    val newLifeData = MutableLiveData<List<Film>>()

    fun onViewCreated(){
        newLifeData.postValue(repository.get())
    }

}