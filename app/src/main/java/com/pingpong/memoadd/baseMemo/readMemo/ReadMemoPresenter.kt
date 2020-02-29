package com.pingpong.memoadd.baseMemo.readMemo

import android.content.Intent
import com.pingpong.memoadd.baseMemo.readMemo.ReadMemoContract
import com.pingpong.memoadd.data.MemoInfo

class ReadMemoPresenter : ReadMemoContract.Presenter {

    lateinit override var view: ReadMemoContract.View

    override fun loadIntent(intent: Intent) {
        val memo : MemoInfo? = intent.getParcelableExtra<MemoInfo>("loadMemo")

        if(memo != null)
            view.showSavedMemo(memo)
    }

}