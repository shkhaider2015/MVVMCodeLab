package com.example.mvvmcodelab

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class WordRepository (private val wordDAO: WordDAO)
{
    val allWords : Flow<List<Word>> = wordDAO.getAllAlphabetizedWords()


    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word)
    {
        wordDAO.insert(word)
    }

}