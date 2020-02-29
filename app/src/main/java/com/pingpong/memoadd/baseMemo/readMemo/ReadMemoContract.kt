package com.pingpong.memoadd.baseMemo.readMemo

import android.content.Intent
import com.pingpong.memoadd.data.MemoInfo

interface ReadMemoContract {

    interface View {
        fun showSavedMemo(memo : MemoInfo)
    }

    interface Presenter {

        val view : View

        fun loadIntent(intent: Intent)
    }
}