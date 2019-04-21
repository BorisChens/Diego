package com.example.a90767.testno2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UC1 extends AppCompatActivity {

    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc1);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar1);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        Button button11=(Button)findViewById(R.id.shuiping);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UC1.this,"水平排列",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(UC1.this,shuiping.class);
                startActivity(intent);
            }
        });
        button12=(Button)findViewById(R.id.chuizhi);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UC1.this,"垂直排列",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(UC1.this,chuizhi.class);
                startActivity(intent);
            }
        });
        button13=(Button)findViewById(R.id.xiangzuo);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UC1.this,"靠左对齐",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(UC1.this,xiangzuo.class);
                startActivity(intent);
            }
        });
        Button button14=(Button)findViewById(R.id.back);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UC1.this,"返回",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(UC1.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
