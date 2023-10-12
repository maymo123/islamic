package com.example.domin.UseCase

import com.example.domin.repository.QuranRepository

class ReadQuranUseCase(private val repository: QuranRepository) {
   suspend operator fun invoke (PageNumber: Int)= repository.getQuranPage(PageNumber)
}