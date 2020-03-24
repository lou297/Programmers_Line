package com.pingpong.memoadd.main.memoList

import com.pingpong.memoadd.data.MemoInfo

interface MemoListContract {
    interface View {

        fun notifyAdapter()
    }

    interface Model {
        fun addItems(memos: ArrayList<MemoInfo>);

        fun clearItems();
    }

}