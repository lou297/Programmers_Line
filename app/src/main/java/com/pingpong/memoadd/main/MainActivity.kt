package com.pingpong.memoadd.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.pingpong.memoadd.data.MemoInfo
import com.pingpong.memoadd.R
import com.pingpong.memoadd.baseMemo.BaseMemoActivity
import com.pingpong.memoadd.main.memoList.MemoListAdapter
import com.pingpong.memoadd.main.memoList.MemoListPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),  MainContract.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }


    override fun init() {
        presenter = MainPresenter().apply {
            view = this@MainActivity
        }

        val adapter = MemoListAdapter()
        rv_memo_list.adapter = adapter
//        Log.d("test", "size : " + adapter.itemCount)
        adapter.notifyDataSetChanged()

        fab_write_memo.setOnClickListener {
            val intent = Intent(this, BaseMemoActivity::class.java)
            startActivity(intent)
        }
    }

    override fun updateMemos(memoList: List<MemoInfo>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showToast(contents: String) {
        Toast.makeText(this, contents, Toast.LENGTH_LONG)
    }


}
