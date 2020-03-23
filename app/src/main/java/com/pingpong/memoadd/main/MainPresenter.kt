package com.pingpong.memoadd.main

import android.content.Context
import com.pingpong.memoadd.data.MemoInfo
import com.pingpong.memoadd.data.MemoInfoDB
import com.pingpong.memoadd.data.MemoInfoDao
import com.pingpong.memoadd.main.memoList.MemoListContract

class MainPresenter() : MainContract.Presenter {

    lateinit override var view: MainContract.View;

    lateinit override var memoAdapterModel : MemoListContract.Model;

    lateinit override var memoAdapterView : MemoListContract.View;

    override fun loadMemoFromLocal(context: Context) {
        val memoInfoDao : MemoInfoDao? = MemoInfoDB.getInstance(context)!!.getMemoInfoDao()
        val r = Runnable {
            val memoList = memoInfoDao!!.getAllMemos()

            memoAdapterModel.addItems(memoList);
            memoAdapterView.notifyAdapter();
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