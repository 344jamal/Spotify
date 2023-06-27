package com.jamal.spotify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val webview = WebView(this)
        webview.settings.javaScriptEnabled
        setContentView(webview)
        webview.loadUrl("https://www.spotify.com")
    }
}