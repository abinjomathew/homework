
package com.example.work1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button b1;
    String s1,s2,s3,s4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.cname);
        e2=(EditText)findViewById(R.id.cd) ;
        e3=(EditText)findViewById(R.id.cduration);
        e4=(EditText)findViewById(R.id.trainer);
        b1=(Button)findViewById(R.id.submit);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                Toast.makeText(getApplicationContext(),s1+" "+s2+" "+s3+" "+s4,Toast.LENGTH_LONG).show();


            }
        });

    }
}
