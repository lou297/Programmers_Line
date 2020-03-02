package com.pingpong.memoadd.baseMemo

import com.pingpong.memoadd.data.MemoInfo

interface BaseMemoContract {
    interface View {
        var isEdit : Boolean
        var memo : MemoInfo?
        fun setFrameLayout(isEdit : Boolean, memo : MemoInfo?)
    }

    interface Presenter {

    }
}