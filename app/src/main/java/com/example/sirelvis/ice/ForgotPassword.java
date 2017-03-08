package com.example.sirelvis.ice;

import android.os.Bundle;
import android.app.Activity;

public class ForgotPassword extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
