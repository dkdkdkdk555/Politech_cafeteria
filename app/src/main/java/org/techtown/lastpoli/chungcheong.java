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


public class chungcheong extends AppCompatActivity {
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
    public void onButton13Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/daejeon/content.do?menu=5417"));
        startActivity(intent);
    }

    public void onButton14Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/cheongju/content.do?menu=6120"));
        startActivity(intent);
    }

    public void onButton15Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/asan/content.do?menu=6604"));
        startActivity(intent);
    }

    public void onButton16Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/hongseong/content.do?menu=2922"));
        startActivity(intent);
    }

    public void onButton17Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/chungju/content.do?menu=2830"));
        startActivity(intent);
    }

    public void onButton18Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/bio/content.do?menu=5892"));
        startActivity(intent);
    }

    public void onButton19Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/dasom/content.do?menu=2450"));
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
