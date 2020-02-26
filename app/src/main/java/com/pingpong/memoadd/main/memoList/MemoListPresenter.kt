package com.pingpong.memoadd.main.memoList

import android.util.Log
import com.pingpong.memoadd.data.MemoInfo
import com.pingpong.memoadd.main.memoList.MemoListContract

class MemoListPresenter : MemoListContract.Presenter{

    override val memoList: ArrayList<MemoInfo> = ArrayList<MemoInfo>()

    override fun onBindViewApPosition(position : Int, holder : MemoListAdapter.MemoViewHolder) {
        val memo : MemoInfo = memoList.get(position)

        val title = memo.title
        val contents = memo.contents
        val thumbnail = memo.firstImagePath

        if(title != null)
            holder.setTitle(title)

        if(contents != null)
            holder.setContents(contents)
    }

    override fun addMemos(memos: List<MemoInfo>) {
        for(memo in memoList)
            memoList.add(memo)
    }

    override fun addMemo(memo: MemoInfo) {
        memoList.add(memo)
    }

    override fun getListSize() : Int {
        return memoList.size
    }
}