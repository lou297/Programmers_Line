package com.pingpong.memoadd.baseMemo.readMemo

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pingpong.memoadd.R
import com.pingpong.memoadd.data.MemoInfo
import kotlinx.android.synthetic.main.fragment_read_memo.*

public class ReadMemoFragment : Fragment(), ReadMemoContract.View {

    private lateinit var presenter: ReadMemoPresenter
    private var mActivity: Activity? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if(context is Activity)
            mActivity = context as Activity
    }

    override fun onDetach() {
        mActivity = null
        super.onDetach()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_read_memo, container, false)

        initFragment(view)
        return view
    }

    fun initFragment(v: View) {
        presenter = ReadMemoPresenter().apply {
            view = this@ReadMemoFragment
        }
        presenter.loadBundle(arguments)

    }

    override fun showSavedMemo(memo: MemoInfo) {
        val title = memo.title

        val contents = memo.contents

        tv_memo_title.text = title

        tv_memo_contents.text = contents
    }
}