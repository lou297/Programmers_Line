package com.pingpong.memoadd.main.memoList

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pingpong.memoadd.R
import kotlinx.android.synthetic.main.item_memo.view.*

class MemoListAdapter() : RecyclerView.Adapter<MemoListAdapter.MemoViewHolder>() {

    private val presenter = MemoListPresenter()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemoViewHolder {
        Log.d("test4", "sized : " + presenter.getListSize())
        return MemoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_memo, parent, false))
    }

    override fun getItemCount(): Int {
        Log.d("testt", "??")
        return presenter.getListSize()
    }

    override fun onBindViewHolder(holder: MemoViewHolder, position: Int) {
        Log.d("test3","position : "+position)

        presenter.onBindViewApPosition(position, holder)
    }

    inner class MemoViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView),
        MemoListContract.View {

        override fun setTitle(title: String) {
            itemView.tv_memo_list_title.text = title
        }

        override fun setContents(contents: String) {
            itemView.tv_memo_list_contents.text = contents
        }

        override fun setThumbNail(url: String) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }


    }
}