package com.pingpong.memoadd.baseMemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.pingpong.memoadd.R
import com.pingpong.memoadd.baseMemo.editMemo.EditMemoFragment
import com.pingpong.memoadd.baseMemo.readMemo.ReadMemoFragment
import com.pingpong.memoadd.data.MemoInfo

class BaseMemoActivity : AppCompatActivity(), BaseMemoContract.View {
    override var isEdit: Boolean = false

    override var memo: MemoInfo? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_memo)
        loadIntent()
        setFrameLayout(isEdit, memo)
    }

    fun loadIntent() {
        val intent = intent

        isEdit = intent.getBooleanExtra("IS_EDIT", false)
        memo = intent.getParcelableExtra("LOAD_MEMO")
    }

    override fun setFrameLayout(isEdit : Boolean, memo : MemoInfo?) {
        lateinit var fragment : Fragment

        when(isEdit) {
            true -> fragment = EditMemoFragment()

            false -> {
                fragment = ReadMemoFragment()
                val bundle = Bundle()
                bundle.putParcelable("LOAD_MEMO", memo)
                fragment.arguments = bundle
            }
        }

        supportFragmentManager.beginTransaction().replace(R.id.fl_base_memo,
            fragment
        ).commit()
    }
}
