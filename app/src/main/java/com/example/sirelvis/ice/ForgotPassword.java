package com.example.sirelvis.ice;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPassword extends Activity {
    EditText mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        mail = (EditText) findViewById(R.id.editText2);
    }

    public void sendMail(View v){
        Toast myToast = Toast.makeText(getApplicationContext(), "Password sent to " + mail.getText(), Toast.LENGTH_SHORT);
        myToast.show();
    }
}
