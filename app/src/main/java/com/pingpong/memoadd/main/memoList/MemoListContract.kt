package com.pingpong.memoadd.main.memoList

import com.pingpong.memoadd.data.MemoInfo

interface MemoListContract {
    interface View {
        fun setTitle(title : String)

        fun setContents(contents : String)

        fun setThumbNail(url : String)
    }

    interface Presenter {
        val memoList : ArrayList<MemoInfo>

        fun getListSize() : Int

        fun onBindViewApPosition(position : Int, holder : MemoListAdapter.MemoViewHolder)

        fun addMemo(memo : MemoInfo)
    }
}