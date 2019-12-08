package com.github.kr328.clash

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes

interface IBaseView {

    fun initData(bundle: Bundle?)

    fun bindLayout(): Int

    fun setRootLayout(@LayoutRes layoutId: Int)

    fun initView(savedInstanceState: Bundle?, contentView: View?)

    fun doBusiness()

}