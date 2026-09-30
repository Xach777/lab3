package com.example.studentprofile

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class HelpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_help)

        val webView = findViewById<WebView>(R.id.webView)

        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://developer.android.com")
    }
}