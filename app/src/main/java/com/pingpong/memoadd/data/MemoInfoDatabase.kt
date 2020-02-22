package com.pingpong.memoadd.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [MemoInfo::class], version = 1)

public abstract class MemoInfoDB : RoomDatabase() {
    abstract fun getMemoInfoDao() : MemoInfoDao

    companion object {
        private var instance : MemoInfoDB? = null

        fun getInstance(context: Context) : MemoInfoDB? {
            if(instance == null) {
                synchronized(MemoInfoDB) {
                    instance = Room.databaseBuilder(context.applicationContext,
                        MemoInfoDB::class.java, "memo.db")
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }

            return instance
        }

    }
}