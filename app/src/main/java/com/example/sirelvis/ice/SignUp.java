package com.example.sirelvis.ice;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

/**
 * Created by Sir Elvis on 3/7/2017.
 */

public class SignUp extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.signup);
        //final Button logIn = (Button) findViewById(R.id.logInBut);

    }
}
