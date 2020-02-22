package com.pingpong.memoadd.baseMemo.editMemo

import com.pingpong.memoadd.data.MemoInfo

class editMemoPresenter() : editMemoContract.Presenter {

    lateinit override var view: editMemoContract.View

    override fun checkMemo(title: String?, contents : String?) : MemoInfo? {
        if(title == null && contents == null)
            return null

        val memoInfo : MemoInfo =
            MemoInfo(0, title, contents, 0, null)

        return memoInfo
    }

}