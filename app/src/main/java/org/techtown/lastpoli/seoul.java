package org.techtown.lastpoli;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class seoul extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
    public void onButton7Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/jungsu/content.do?menu=247"));
        startActivity(intent);
    }

    public void onButton8Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/kangseo/content.do?menu=262"));
        startActivity(intent);
    }

    public void onButton9Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/seongnam/content.do?menu=4304"));
        startActivity(intent);
    }

    public void onButton10Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/incheon/content.do?menu=6893"));
        startActivity(intent);
    }

    public void onButton11Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/namincheon/content.do?menu=6982"));
        startActivity(intent);
    }

    public void onButton12Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/hwaseong/content.do?menu=7071"));
        startActivity(intent);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            showToast("맛있게드세요 오늘도 화이팅!");
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT ) {
            showToast("3번째 업데이트입니다.");
        }

    }
    public void showToast(String data) {
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

}