package com.mynus01.unikotest.uniko

import com.mynus01.uniko.dispatcher.BaseDispatcher
import com.mynus01.uniko.receiver.BaseReceiver
import com.mynus01.unikotest.uniko.store.AppStore

object UnikoSingleton {
    val store = AppStore()
    val dispatcher = BaseDispatcher(store)
    val receiver = BaseReceiver(store)
}