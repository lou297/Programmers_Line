package com.pingpong.memoadd.baseMemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pingpong.memoadd.R
import com.pingpong.memoadd.baseMemo.editMemo.EditMemoFragment

class BaseMemoActivity : AppCompatActivity(), BaseMemoContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_memo)
        setFragment()
    }

    override fun setFragment() {
        supportFragmentManager.beginTransaction().replace(R.id.fl_base_memo,
            EditMemoFragment()
        ).commit()
    }
}
