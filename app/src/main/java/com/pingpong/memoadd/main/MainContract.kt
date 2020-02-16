package com.pingpong.memoadd.main

import com.pingpong.memoadd.MemoInfo

interface MainContract {
    interface View {
        //메모 목록 날짜순, 제목순 정렬
        //오름차순, 즐겨찾기 우선이 기본 설정.
        fun showMemoOrderByDate(asc : Boolean = true, bookMark : Boolean = true)
        fun showMemoOrderByTitle(asc : Boolean = true, bookMark: Boolean = true)
    }

    interface Model {
        //로컬에서 불러온 메모 정보담기
        fun setAllMemo(memoList : List<MemoInfo>)
        //특정 메모 정보를 키 정보로 불러오기
        fun getMemoInfo(key: Int) : MemoInfo
    }

    interface Presenter {
        //Local 저장소에서 메모 정보 불러오기
        fun loadMemoFromLocal()
        //특정 메모 제거
        fun removeMemo(checkedMemo : List<MemoInfo>)
        //메모 상세보기 화면으로 이동
        fun goToMemoDetail(memoInfo : MemoInfo)
        //메모 작성하기 화면으로 이동
        fun goToMemoWrite()
    }
}