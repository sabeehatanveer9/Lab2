package com.example.naveed.lab2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Button btn1;
    EditText eText1, eText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.b1);
        eText1 = (EditText) findViewById(R.id.et1);
        eText2 = (EditText) findViewById(R.id.et2);
        // btn1.setOnClickListener();
    }


    public void login(View view) {
        String name=eText1.getText().toString();
        String pass=eText2.getText().toString();
        switch (view.getId()) {
            case R.id.b1: {
                if (name.isEmpty() && pass.isEmpty()) {
                    Toast.makeText(getBaseContext(), "Fields are empty", Toast.LENGTH_LONG).show();
                } else if (!name.equals(pass)) {
                    Toast.makeText(getBaseContext(), "Login and password are not same", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getBaseContext(), "Login and password are same", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
}