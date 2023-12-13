package com.example.pillarmachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView: WebView = findViewById(R.id.webView)

        // enable java script
        webView.settings.javaScriptEnabled = true


        //set up WebViewClient to handle redirects within the webview
        webView.webViewClient = object  : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
            ): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }
        }
        //load a website url
        val websiteUrl = "https://pillarmachine.com"
        webView.loadUrl(websiteUrl)
    }
}