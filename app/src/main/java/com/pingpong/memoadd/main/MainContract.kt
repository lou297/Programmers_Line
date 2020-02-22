package com.pingpong.memoadd.main

import com.pingpong.memoadd.data.MemoInfo

interface MainContract {
    interface View {
        //view 설정
        fun init()
        //오름차순, 즐겨찾기 우선이 기본 설정.
        fun updateMemos(memoList : List<MemoInfo>)

        fun showToast(contents : String)
    }


    interface Presenter {
        var view : View
        //Local 저장소에서 메모 정보 불러오기
        fun loadMemoFromLocal()
        //특정 메모 제거
        fun removeMemo(checkedMemo : List<MemoInfo>)
        //메모 상세보기 화면으로 이동
        fun onClickMemoItem(memoInfo : MemoInfo)
        //메모 작성하기 화면으로 이동
        fun onClickWriteFab()
    }
}