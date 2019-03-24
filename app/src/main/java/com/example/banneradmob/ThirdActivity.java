package com.example.banneradmob;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class ThirdActivity extends AppCompatActivity {
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/8691691433");
        interstitialAd.loadAd(new AdRequest.Builder().build());
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                startActivity( new Intent(ThirdActivity.this,MainActivity.class));
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });

        Button btn = (Button) findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(interstitialAd.isLoaded()){
                    interstitialAd.show();
                }else{
                    startActivity( new Intent(ThirdActivity.this,MainActivity.class));
                }
            }
        });
    }
}
