package com.incorp.sevensegmentdisplay

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onActionPerform()
    }

    private fun onActionPerform() {
        etInput.addTextChangedListener(object:TextWatcher{
            override fun afterTextChanged(ed: Editable?) {

            }

            override fun beforeTextChanged(ch: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun onTextChanged(ch: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if(ch?.length==1) {
                    AppUtil.showDisplayWithNumber(0, llDisplay_1)
                    AppUtil.showDisplayWithNumber(ch.toString().toInt(), llDisplay_2)
                }
                if(ch?.length==2) {
                    AppUtil.showDisplayWithNumber(ch[0].toString().toInt(), llDisplay_1)
                    AppUtil.showDisplayWithNumber(ch[1].toString().toInt(), llDisplay_2)
                }
            }

        })

        llDisplay_1.setOnClickListener {v->
            AppUtil.getDisplayNumber(v as LinearLayout)
        }
    }

}
