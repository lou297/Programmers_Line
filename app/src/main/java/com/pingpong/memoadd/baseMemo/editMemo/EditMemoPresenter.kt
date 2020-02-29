package com.pingpong.memoadd.baseMemo.editMemo

import android.app.Activity
import com.pingpong.memoadd.baseMemo.editMemo.EditMemoContract
import com.pingpong.memoadd.data.MemoInfo
import com.pingpong.memoadd.data.MemoInfoDB

class EditMemoPresenter() : EditMemoContract.Presenter {

    lateinit override var view: EditMemoContract.View

    override fun addMemo(title: String?, contents : String?, activity: Activity) {
        if(title == null && contents == null) {
            view.showToast("추가할 내용이 없습니다.")
            return
        }

        val memoInfo = MemoInfo(0, title, contents, 0, null)

        val r = Runnable {
            val memoInfoDao = MemoInfoDB.getInstance(activity.applicationContext)!!.getMemoInfoDao()
            memoInfoDao.insertMemo(memoInfo)
            activity.finish()
        }

        val thread = Thread(r)

        thread.start()

    }

}