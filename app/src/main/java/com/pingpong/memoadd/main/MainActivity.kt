package com.pingpong.memoadd.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pingpong.memoadd.R

class MainActivity : AppCompatActivity(),  MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun showMemoOrderByDate(asc: Boolean, bookMark: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showMemoOrderByTitle(asc: Boolean, bookMark: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
