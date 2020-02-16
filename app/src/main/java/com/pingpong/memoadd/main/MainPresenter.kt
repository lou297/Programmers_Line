package com.pingpong.memoadd.main

import android.content.Context
import com.pingpong.memoadd.MemoInfo

class MainPresenter(private val view : MainContract.View, private val context : Context) : MainContract.Presenter {
    override fun loadMemoFromLocal() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeMemo(checkedMemo: List<MemoInfo>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun goToMemoDetail(memoInfo: MemoInfo) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun goToMemoWrite() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}