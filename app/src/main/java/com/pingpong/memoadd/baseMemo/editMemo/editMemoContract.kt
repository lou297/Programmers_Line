package com.pingpong.memoadd.baseMemo.editMemo

import android.app.Activity
import android.content.Context
import com.pingpong.memoadd.data.MemoInfo
import com.pingpong.memoadd.data.MemoInfoDao

interface editMemoContract {

    interface View {
        fun init(view : android.view.View)

        fun scrapeMemoInfo()

        fun showToast(contents: String)
    }

    interface Presenter {

        var view : View

        //메모 내용 확인, 아무것도 입력되지 않았다면 null 반환

        fun addMemo(title: String?, contents : String?, activity: Activity)
    }
}