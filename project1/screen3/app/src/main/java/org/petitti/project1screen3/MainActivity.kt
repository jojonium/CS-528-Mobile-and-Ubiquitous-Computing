package org.petitti.project1screen3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    var webView: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.webView = findViewById<WebView>(R.id.webView)
    }

    fun onClickGoogle(view: View) {
        webView?.loadUrl("https://www.google.com/")
    }

    fun onClickWikipedia(view: View) {
        webView?.loadUrl("https://www.wikipedia.org/")
    }

    fun onClickJosephPetitti(view: View) {
        webView?.loadUrl("https://josephpetitti.com/")
    }
}