package com.pingpong.memoadd.data

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.pingpong.memoadd.data.MemoInfo

@Dao
interface MemoInfoDao {

    @Query("SELECT * FROM memo")
    fun getAllMemos() : ArrayList<MemoInfo>

    @Insert(onConflict = REPLACE)
    fun insertMemo(memoInfo : MemoInfo)

    @Delete
    fun deleteMemo(memoInfo : MemoInfo)

    @Update
    fun updateMemo(memoInfo: MemoInfo)

}