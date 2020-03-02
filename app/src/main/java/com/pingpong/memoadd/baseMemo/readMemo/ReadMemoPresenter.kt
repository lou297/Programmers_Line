package com.pingpong.memoadd.baseMemo.readMemo

import android.content.Intent
import android.os.Bundle
import com.pingpong.memoadd.baseMemo.readMemo.ReadMemoContract
import com.pingpong.memoadd.data.MemoInfo

class ReadMemoPresenter : ReadMemoContract.Presenter {

    lateinit override var view: ReadMemoContract.View

    override fun loadBundle(bundle: Bundle?) {
        var memo :MemoInfo? = null

        if(bundle != null)
            memo = bundle.getParcelable<MemoInfo>("LOAD_MEMO")

        if(memo != null)
            view.showSavedMemo(memo)
    }

}