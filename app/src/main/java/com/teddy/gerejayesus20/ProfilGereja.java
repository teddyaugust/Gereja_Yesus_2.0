package com.teddy.gerejayesus20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ProfilGereja extends AppCompatActivity {

    //Inisialiasi Variabel
    DrawerLayout drawerLayout;
    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_gereja);

        //buka webnya
        webView = (WebView) findViewById(R.id.profil_gereja_webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://gereja.yuk-simak.info/category/profil/");

        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.supportZoom();
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);

        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);

        webView.setWebChromeClient(new WebChromeClient());

        webView.setWebViewClient(new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading(WebView wv, String url) {
                if(url.startsWith("tel:") || url.startsWith("whatsapp:") || url.startsWith("tg:") || url.startsWith("facebook:") ) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                    return true;
                }
                return false;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }
        });

        //Assign variabel
        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu (View view){
        //Open drawer
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo (View view){
        //Close drawer
        MainActivity.closeDrawer(drawerLayout);
    }

    public void ClickHome (View view){
        //Redirect Activity to home
        MainActivity.redirectActivity(this,MainActivity.class);
    }

    public void ClickRenungan (View view){
        //Redirect Activity to home
        MainActivity.redirectActivity(this,Renungan.class);
    }

    public void ClickIbadahOnline (View view){
        //Redirect activity ke Ibadah Online
        MainActivity.redirectActivity(this,IbadahOnline.class);
    }

    public void ClickWartaJemaat (View view){
        //Redirect activity ke Warta Jemaat
        MainActivity.redirectActivity(this,WartaJemaat.class);
    }

    public void ClickWartaPengurus (View view){
        //Redirect activity ke Warta Pengurus Komisi
        MainActivity.redirectActivity(this,WartaPengurus.class);
    }

    public void ClickProfilGereja (View view){
        //Recreate Activity
        recreate();
    }

    public void ClickJemaat (View view){
        //Redirect activity ke Cara Menjadi Jemaat
        MainActivity.redirectActivity(this,MenjadiJemaat.class);
    }

    public void ClickKontak (View view){
        //Redirect activity ke Kontak Gereja
        MainActivity.redirectActivity(this,KontakGereja.class);
    }

    public void ClickBukuTamu (View view){
        //Redirect activity ke BukuTamu
        MainActivity.redirectActivity(this,BukuTamu.class);
    }

    public void ClickChatBotWA (View view){
        //Redirect activity ke ChatBotWA
        MainActivity.redirectActivity(this,ChatBotWA.class);
    }

    public void ClickAlkitabOnline (View view){
        //Redirect activity ke Alkitab Online
        MainActivity.redirectActivity(this,AlkitabOnline.class);
    }

    public void ClickKidungOnline (View view){
        //Redirect activity ke Kidung Online
        MainActivity.redirectActivity(this,KidungOnline.class);
    }

    public void ClickTentang (View view){
        //Redirect activity ke Tentang Aplikasi
        MainActivity.redirectActivity(this,TentangAplikasi.class);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Close drawer
        MainActivity.closeDrawer(drawerLayout);
    }

}