package org.petitti.project1screen2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var pic1Clicks = 0
    private var pic2Clicks = 0
    private var pic3Clicks = 0
    private var textView1: TextView? = null
    private var textView2: TextView? = null
    private var textView3: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.textView1 = findViewById<TextView>(R.id.pic1Text)
        this.textView2 = findViewById<TextView>(R.id.pic2Text)
        this.textView3 = findViewById<TextView>(R.id.pic3Text)
        this.updateText()
    }

    private fun updateText() {
        val t1 = this.textView1
        if (t1 != null) {
            t1.text = resources.getQuantityString(R.plurals.text_display, this.pic1Clicks, 1, this.pic1Clicks)
        }
        val t2 = this.textView2
        if (t2 != null) {
            t2.text = resources.getQuantityString(R.plurals.text_display, this.pic2Clicks, 2, this.pic2Clicks)
        }
        val t3 = this.textView3
        if (t3 != null) {
            t3.text = resources.getQuantityString(R.plurals.text_display, this.pic3Clicks, 3, this.pic3Clicks)
        }
    }

    fun onClickPenguin(view: View) {
        this.pic1Clicks++
        this.updateText()
    }

    fun onClickSeal(view: View) {
        this.pic2Clicks++
        this.updateText()
    }

    fun onClickOrca(view: View) {
        this.pic3Clicks++
        this.updateText()
    }
}