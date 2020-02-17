package com.pingpong.memoadd.baseMemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pingpong.memoadd.R

class BaseMemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_memo)
    }
}
