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

public class gyeongsang extends AppCompatActivity {
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void onButton20Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/daegu/content.do?menu=4175"));
        startActivity(intent);
    }

    public void onButton24Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/gumi/content.do?menu=4941"));
        startActivity(intent);
    }

    public void onButton31Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/dalseong/content.do?menu=5752"));
        startActivity(intent);
    }

    public void onButton32Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/pohang/content.do?menu=6012"));
        startActivity(intent);
    }

    public void onButton33Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/yeongju/content.do?menu=6229"));
        startActivity(intent);
    }

    public void onButton34Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/yct/content.do?menu=6362"));
        startActivity(intent);
    }

    public void onButton35Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/changwon/content.do?menu=3396"));
        startActivity(intent);
    }

    public void onButton36Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/busan/content.do?menu=5609"));
        startActivity(intent);
    }

    public void onButton37Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/ulsan/content.do?menu=3707"));
        startActivity(intent);
    }

    public void onButton38Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/dongbusan/content.do?menu=6502"));
        startActivity(intent);
    }

    public void onButton39Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/jinju/content.do?menu=6767"));
        startActivity(intent);
    }

    public void onButton40Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kopo.ac.kr/kapc/content.do?menu=3821"));
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

