package com.example.sirelvis.ice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends Activity {

   // TextView showed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_log_in);
        //final Button logIn = (Button) findViewById(R.id.logInBut);

    }

    public void logIn(View v){
        if(((EditText) findViewById(R.id.editText3)).getText().equals("") &&
                ((EditText) findViewById(R.id.editText4)).getText().equals(""))
        {
            ((EditText) findViewById(R.id.editText3)).setText("Please enter something");
        }
        else
            onTap(v);
    }

    public void onTap(View v){
        Toast myToast = Toast.makeText(getApplicationContext(), "It worked", Toast.LENGTH_LONG);
        myToast.show();
    }

    public void signUp(View v){
        //super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }
}
