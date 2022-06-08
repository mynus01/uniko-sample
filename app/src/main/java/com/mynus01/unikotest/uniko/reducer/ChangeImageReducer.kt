package com.mynus01.unikotest.uniko.reducer

import com.mynus01.uniko.reducer.Reducer
import com.mynus01.unikotest.uniko.action.input.ChangeImageInput
import com.mynus01.unikotest.uniko.action.output.ChangeImageOutput

class ChangeImageReducer : Reducer<ChangeImageInput, ChangeImageOutput> {
    override fun reduce(action: ChangeImageInput): ChangeImageOutput {
        val imageToDisplay = if (action.isShrekImage) {
            "https://pbs.twimg.com/media/FMpXjb1WUAYRcHx.png"
        } else {
            "https://cdn.vox-cdn.com/thumbor/qCfHPH_9Mw78vivDlVDMu7xYc78=/715x248:1689x721/920x613/filters:focal(972x299:1278x605):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/69305239/shrek4_disneyscreencaps.com_675.0.jpg"
        }
        return ChangeImageOutput(imageToDisplay)
    }
}