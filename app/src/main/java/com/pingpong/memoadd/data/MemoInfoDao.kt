package com.pingpong.memoadd.data

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Update
import com.pingpong.memoadd.data.MemoInfo

interface MemoInfoDao {

    @Query("SELECT * FROM memo")
    fun getAll() : List<MemoInfo>

    @Insert(onConflict = REPLACE)
    fun insert(memoInfo : MemoInfo)

    @Delete
    fun delete(memoInfo : MemoInfo)

    @Update
    fun update(memoInfo: MemoInfo)

}