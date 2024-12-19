package com.openwebinars.filmapp.model

class NewsFilmsRepository {

    private val api = FilmsService()

    suspend fun get(): List<Film> = api.get()
}