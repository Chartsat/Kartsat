package com.example.charis.kartsat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ΕΙΡΗΝΗ on 8/11/2015.
 */
public class register extends AppCompatActivity implements View.OnClickListener {

    Button bRegister;
    EditText etName, etAge, etUsername,etPassword;


    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName= (EditText)findViewById(R.id.etName);
        etPassword = (EditText)findViewById(R.id.etPassword);
        etAge = (EditText)findViewById(R.id.etAge);
        bRegister =(Button)findViewById(R.id.bRegister);




        bRegister.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.bRegister:

                String name = etName.getText().toString();
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();
                int age = Integer.parseInt(etAge.getText().toString());


                user registeredData = new user(name, age, username, password);



                break;

        }



    }
}




