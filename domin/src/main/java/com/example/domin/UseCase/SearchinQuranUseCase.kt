package com.example.domin.UseCase

import com.example.domin.repository.QuranRepository

class SearchinQuranUseCase(private val repository:QuranRepository ) {
    suspend operator fun invoke (searchkey:String)= repository.searchQuran(searchkey)
}

