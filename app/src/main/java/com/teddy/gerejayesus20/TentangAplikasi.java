package com.teddy.gerejayesus20;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TentangAplikasi extends AppCompatActivity {

    //Inisialiasi Variabel
    DrawerLayout drawerLayout;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_aplikasi);

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
        //Redirect activity ke ProfilGereja
        MainActivity.redirectActivity(this,ProfilGereja.class);
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
        //Recreate Activity
        recreate();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Close drawer
        MainActivity.closeDrawer(drawerLayout);
    }

}