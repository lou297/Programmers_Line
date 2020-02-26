package com.pingpong.memoadd.main

import android.content.Context
import com.pingpong.memoadd.data.MemoInfo
import com.pingpong.memoadd.data.MemoInfoDB
import com.pingpong.memoadd.data.MemoInfoDao

class MainPresenter() : MainContract.Presenter {

    lateinit override var view: MainContract.View


    override fun loadMemoFromLocal(context: Context) {
//        val memoInfoDao : MemoInfoDao? = MemoInfoDB.getInstance(context)!!.getMemoInfoDao()

        val r = Runnable {
            val memoInfoDB = MemoInfoDB.getInstance(context)
//            val memoList = memoInfoDao!!.getAll()

//            view.updateMemos(memoList)
        }

        val thread = Thread(r)

        thread.start()
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