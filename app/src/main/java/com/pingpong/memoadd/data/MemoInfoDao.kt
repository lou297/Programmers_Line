package com.pingpong.memoadd.data

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.pingpong.memoadd.data.MemoInfo

@Dao
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