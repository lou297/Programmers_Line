package com.pingpong.memoadd

data class MemoInfo(val key : Int, var title : String?, var contents : String, var imageNum : Int, var firstImagePath : String?)

/*
 key : DB indexing을 위한 key
 title : 메모의 제목, null 값이 올 수 있다.
 contents : 메모의 내용, null 값이 올 수 없다.
 imageNum : 첨부된 이미지 수
 썸네일을 위한 첫 번째 이미지 경로, 첨부된 이미지 수가 0일 경우 null이 올 수 있다.
 */


