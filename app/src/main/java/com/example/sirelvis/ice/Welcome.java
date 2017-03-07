package com.example.sirelvis.ice;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Handler;

public class Welcome extends Activity {
    private static int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent welcome = new Intent(Welcome.this, LogIn.class);
                startActivity(welcome);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }

}
