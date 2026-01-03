package com.doubleduo.entryrunner
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val web = WebView(this)
    web.settings.javaScriptEnabled = true
    web.settings.allowFileAccess = true
    web.settings.domStorageEnabled = true
    web.webViewClient = WebViewClient()
    setContentView(web)
    web.loadUrl("file:///android_asset/entry/index.html")
  }
}
