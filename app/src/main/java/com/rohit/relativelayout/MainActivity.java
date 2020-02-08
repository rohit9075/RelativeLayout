package com.rohit.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //intiView method call
        initView();
    }


    //initView method initialization
    private void initView(){
        editText1 = findViewById(R.id.edittext);
        editText2 = findViewById(R.id.edittext1);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = String.valueOf(editText1.getText());
                String email = String.valueOf(editText2.getText());

                Toast.makeText(MainActivity.this, "Name is : " + name + "Email is : " + email, Toast.LENGTH_SHORT).show();
                Log.d("MyLog", "Name is : " + name);
                Log.d("MyLog", "Email is : " + email);

            }
        });
    }



}
