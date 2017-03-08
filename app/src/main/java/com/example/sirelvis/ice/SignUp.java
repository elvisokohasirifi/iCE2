package com.example.sirelvis.ice;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

/**
 * Created by Sir Elvis on 3/7/2017.
 */

public class SignUp extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActionBar actionBar = getActionBar();
        actionBar.hide();
        setContentView(R.layout.signup);
        //final Button logIn = (Button) findViewById(R.id.logInBut);
    }

    public void signUp(View v){
        Toast myToast = Toast.makeText(getApplicationContext(), "You will be able to sign up soon", Toast.LENGTH_LONG);
        myToast.show();
    }
}
