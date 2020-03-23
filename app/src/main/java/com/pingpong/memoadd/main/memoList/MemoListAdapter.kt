package com.pingpong.memoadd.main.memoList

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pingpong.memoadd.R
import com.pingpong.memoadd.data.MemoInfo
import kotlinx.android.synthetic.main.item_memo.view.*

class MemoListAdapter(val context: Context) : RecyclerView.Adapter<MemoListAdapter.MemoViewHolder>(), MemoListContract.Model, MemoListContract.View {

    private lateinit var memos : ArrayList<MemoInfo>

    private val presenter = MemoListPresenter()

    override fun notifyAdapter() {
        notifyDataSetChanged();
    }

    override fun addItems(memos: ArrayList<MemoInfo>) {
        this.memos = memos;
    }

    override fun clearItems() {
        memos.clear()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemoViewHolder {
        return MemoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_memo, parent, false))
    }

    override fun getItemCount(): Int {
        return presenter.getListSize()
    }

    override fun onBindViewHolder(holder: MemoViewHolder, position: Int) {
        return presenter.onBindViewApPosition(position, holder)
    }

    inner class MemoViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

//        override fun setClickListener(listener: OnMemoItemClickListener) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }
//
//        override fun setTitle(title: String) {
//            itemView.tv_memo_list_title.text = title
//        }
//
//        override fun setContents(contents: String) {
//            itemView.tv_memo_list_contents.text = contents
//        }
//
//        override fun setThumbNail(url: String) {
//            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//        }


    }


}