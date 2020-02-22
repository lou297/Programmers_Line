package com.pingpong.memoadd.main

import com.pingpong.memoadd.data.MemoInfo

class MainPresenter() : MainContract.Presenter {

    lateinit override var view: MainContract.View


    override fun loadMemoFromLocal() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeMemo(checkedMemo: List<MemoInfo>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onClickMemoItem(memoInfo: MemoInfo) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onClickWriteFab() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}