package com.example.a.test3;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tiaozhuan);
        Button btn=(Button)findViewById(R.id.id1);
        Button btn2=(Button)findViewById(R.id.id2);
        Button btn3=(Button)findViewById(R.id.id3);
        Button btn4=(Button)findViewById(R.id.id4);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,simpleAdapter1.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AlertDialog1.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Mymenu.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Amction.class);
                startActivity(intent);
            }
        });
    }



}
