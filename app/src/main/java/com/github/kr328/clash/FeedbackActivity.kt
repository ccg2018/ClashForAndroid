package com.github.kr328.clash

import android.os.Bundle
import android.view.View
import androidx.annotation.Keep
import androidx.preference.PreferenceFragmentCompat
import kotlinx.android.synthetic.main.activity_feedback.*

class FeedbackActivity : ToolbarActivity() {
    @Keep
    class Fragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.feedback, rootKey)
        }
    }

    override fun initData(bundle: Bundle?) {
       
    }

    override fun bindLayout(): Int {
        return R.layout.activity_feedback
    }

    override fun initView(savedInstanceState: Bundle?, contentView: View?) {
       
    }

    override fun doBusiness() {
       
    }
}