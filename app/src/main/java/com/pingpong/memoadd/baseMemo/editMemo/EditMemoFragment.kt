package com.pingpong.memoadd.baseMemo.editMemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.pingpong.memoadd.R
import com.pingpong.memoadd.baseMemo.editMemo.EditMemoContract
import com.pingpong.memoadd.baseMemo.editMemo.EditMemoPresenter
import kotlinx.android.synthetic.main.fragment_edit_memo.*
import kotlinx.android.synthetic.main.fragment_edit_memo.view.*

public class EditMemoFragment() : Fragment(), EditMemoContract.View {

    private lateinit var presenter: EditMemoPresenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_edit_memo, container, false)
        init(view)
        return view
    }

    override fun init(v : View) {
        presenter = EditMemoPresenter().apply {
            view = this@EditMemoFragment
        }

        v.btn_save_memo.setOnClickListener {
            scrapeMemoInfo()
        }
    }

    override fun scrapeMemoInfo() {
        var title : String? = et_memo_title.text.toString()

        var contents : String? = et_memo_contents.text.toString()

        if(title!!.length == 0)
            title = null

        if(contents!!.length == 0)
            contents = null

        presenter.addMemo(title, contents, activity!!)

    }

    override fun showToast(contents : String) {
        Toast.makeText(context, contents,Toast.LENGTH_LONG).show()
    }
}