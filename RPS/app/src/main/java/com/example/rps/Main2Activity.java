package com.example.rps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button Human ,Computer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Human=(Button)findViewById(R.id.b_Human) ;
        Computer = (Button)findViewById(R.id.b_computer);

        Computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openComputerActivity();

            }
        });
    }
    public void openComputerActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
