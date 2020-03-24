package com.pingpong.memoadd.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pingpong.memoadd.R
import com.pingpong.memoadd.baseMemo.BaseMemoActivity
import com.pingpong.memoadd.main.memoList.MemoListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),  MainContract.View {

    private lateinit var presenter: MainPresenter

    private val adapter = MemoListAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }


    override fun init() {
        presenter = MainPresenter().apply {
            view = this@MainActivity
            memoAdapterView = adapter;
            memoAdapterModel = adapter;
        }

        rv_memo_list.layoutManager = LinearLayoutManager(this) as RecyclerView.LayoutManager?
        rv_memo_list.adapter = adapter
        adapter.notifyDataSetChanged()
        presenter.loadMemoFromLocal(this)

        fab_write_memo.setOnClickListener {
            val intent = Intent(this, BaseMemoActivity::class.java)
            startActivity(intent)
        }
    }

    override fun showToast(contents: String) {
        Toast.makeText(this, contents, Toast.LENGTH_LONG).show()
    }


}
