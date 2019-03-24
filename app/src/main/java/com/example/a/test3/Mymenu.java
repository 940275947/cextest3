package com.example.a.test3;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.EditText;
import android.widget.Toast;

import android.widget.TextView;
public class Mymenu extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
       textView = (TextView) findViewById(R.id.wenzi);
        //为文本框注册上下文菜单
       registerForContextMenu(textView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.size1:
                textView.setTextSize(10);
                break;
            case R.id.size2:
                textView.setTextSize(16);
                break;
            case R.id.size3:
                textView.setTextSize(20);
                break;
            case R.id.red:
                textView.setTextColor(Color.parseColor("#ffff0000"));
                break;
            case R.id.black:
                textView.setTextColor(Color.parseColor("#ff000000"));
                break;
            case R.id.item2:
                Toast toast=Toast.makeText(Mymenu .this,"Toast提示",Toast.LENGTH_SHORT);
                toast.show();

        }
        return super.onOptionsItemSelected(item);
    }

}
