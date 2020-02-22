package com.pingpong.memoadd.baseMemo.editMemo

import com.pingpong.memoadd.data.MemoInfo

interface editMemoContract {

    interface View {
        fun init(view : android.view.View)

        fun scrapeMemoInfo()
    }

    interface Presenter {

        var view : View

        //메모 내용 확인, 아무것도 입력되지 않았다면 null 반환
        fun checkMemo(title: String?, contents : String?) : MemoInfo?
    }
}