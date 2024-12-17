package com.openwebinars.filmapp.model

class NewsFilmsRepository {
    fun get(): List<Film> = FilmsProvider.get()
}