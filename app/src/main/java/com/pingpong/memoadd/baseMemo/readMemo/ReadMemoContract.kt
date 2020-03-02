package com.pingpong.memoadd.baseMemo.readMemo

import android.content.Intent
import android.os.Bundle
import com.pingpong.memoadd.data.MemoInfo

interface ReadMemoContract {

    interface View {
        fun showSavedMemo(memo : MemoInfo)
    }

    interface Presenter {

        val view : View

        fun loadBundle(bundle: Bundle?)
    }
}