package com.example.a90767.testno2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TableRow;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button LineLinerLayout;
    private Button RelativeLayout;
    private Button Framelayout;
    private Button TableLayout;
    private Button NetLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        LineLinerLayout=(Button)findViewById(R.id.LineLinerLayout);
        LineLinerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"线性布局",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,UC1.class);
                startActivity(intent);
            }
        });
        RelativeLayout=(Button)findViewById(R.id.RelativeLayout);
        RelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"相对布局",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,UC2.class);
                startActivity(intent);
            }
        });

        Framelayout=(Button)findViewById(R.id.Framelayout);
        Framelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"帧布局",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,UC3.class);
                startActivity(intent);
            }
        });

        TableLayout =(Button)findViewById(R.id.TableLayout);
        TableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"表格布局",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,UC4.class);
                startActivity(intent);
            }
        });
        NetLayout =(Button)findViewById(R.id.NetLayout);
        NetLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"网格布局",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,UC5.class);
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
