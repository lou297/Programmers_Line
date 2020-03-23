package com.pingpong.memoadd.main

import android.content.Context
import com.pingpong.memoadd.data.MemoInfo
import com.pingpong.memoadd.main.memoList.MemoListContract

interface MainContract {
    interface View {
        //view 설정
        fun init()

        fun showToast(contents : String)
    }


    interface Presenter {
        var view : View

        var memoAdapterView : MemoListContract.View

        var memoAdapterModel : MemoListContract.Model
        //Local 저장소에서 메모 정보 불러오기
        fun loadMemoFromLocal(context: Context)
        //특정 메모 제거
        fun removeMemo(checkedMemo : List<MemoInfo>)
        //메모 상세보기 화면으로 이동
        fun onClickMemoItem(memoInfo : MemoInfo)
        //메모 작성하기 화면으로 이동
        fun onClickWriteFab()
    }
}