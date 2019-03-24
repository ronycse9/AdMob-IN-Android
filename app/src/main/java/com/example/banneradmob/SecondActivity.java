package com.example.banneradmob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.NativeExpressAdView;

public class SecondActivity extends AppCompatActivity {
    private NativeExpressAdView nativeExpressAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nativeExpressAdView = (NativeExpressAdView) findViewById(R.id.mnativeAds);
        nativeExpressAdView.loadAd(new AdRequest.Builder().build());


        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_int = new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(btn_int);
            }
        });
    }
}
