package com.example.dell.myapplication;

import android.content.Intent;
import android.drm.DrmStore;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class My_HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_home);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.hide();
        }
        Button button1 = (Button) findViewById(R.id.button_setup);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(My_HomeActivity.this, MyActivity_Setup.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.button_mytask);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(My_HomeActivity.this, MyActivity_Mytask.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.button_vip);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(My_HomeActivity.this, MyActivity_Vip.class);
                startActivity(intent);
            }
        });
        /**Button button4 = (Button) findViewById(R.id.button_talent);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(My_HomeActivity.this, MyActivity_Talent.class);
                startActivity(intent);
            }
        });*/
        Button button5 = (Button) findViewById(R.id.button_grade);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(My_HomeActivity.this,  MyActivity_credit.class);
                startActivity(intent);
            }
        });

       /** BottomNavigationView bottomNavigationItemView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationItemView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.item_task:
                        Intent intent1 = new Intent(My_HomeActivity.this, Task_Home.class);
                        startActivity(intent1);
                        break;
                    case R.id.item_explore:
                        Intent intent2 = new Intent(My_HomeActivity.this, ExploreActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.item_my:
                        Intent intent3 = new Intent(My_HomeActivity.this, My_HomeActivity.class);
                        startActivity(intent3);
                        break;
                }
                return true;
            }
        });*/

    }
}
