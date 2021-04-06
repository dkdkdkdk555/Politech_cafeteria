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

public class jeonla extends AppCompatActivity {
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void onButton26Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/gwangju/content.do?menu=4636"));
        startActivity(intent);
    }

    public void onButton27Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/gimje/content.do?menu=4464"));
        startActivity(intent);
    }

    public void onButton28Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/mokpo/content.do?menu=3958"));
        startActivity(intent);
    }

    public void onButton29Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/iksan/content.do?menu=3163"));
        startActivity(intent);
    }

    public void onButton30Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/suncheon/content.do?menu=3583"));
        startActivity(intent);
    }

    public void onButton25Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/int/content.do?menu=2520"));
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