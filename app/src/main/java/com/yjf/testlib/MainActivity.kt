package com.yjf.testlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yjf.library.testLog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testLog("测试测试")
    }
}