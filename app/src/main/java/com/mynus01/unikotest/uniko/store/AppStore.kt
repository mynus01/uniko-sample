package com.mynus01.unikotest.uniko.store

import com.mynus01.uniko.action.InputAction
import com.mynus01.uniko.action.OutputAction
import com.mynus01.uniko.store.BaseStore
import com.mynus01.unikotest.uniko.action.input.ChangeImageInput
import com.mynus01.unikotest.uniko.reducer.ChangeImageReducer

class AppStore: BaseStore<InputAction, OutputAction>() {
    override fun reduce(action: InputAction): OutputAction {
        return when (action) {
            is ChangeImageInput -> ChangeImageReducer().reduce(action)
            else -> throw IllegalArgumentException("Unhandled action!")
        }
    }
}