package com.mynus01.unikotest.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mynus01.uniko.extension.observe
import com.mynus01.unikotest.uniko.UnikoSingleton
import com.mynus01.unikotest.uniko.action.output.ChangeImageOutput

class ContentViewModel: ViewModel() {
    private val _imageOutput = MutableLiveData<String>()
    val imageOutput: LiveData<String> = _imageOutput

    init {
        UnikoSingleton.receiver.observe(ChangeImageOutput::class) { output ->
            _imageOutput.value = output.imageUrl
        }
    }
}