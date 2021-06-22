package com.example.mouse;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView mainImg;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but = findViewById(R.id.but);
        Button but_one = findViewById(R.id.Dong_one);
        Button but_two = findViewById(R.id.Dong_two);
        Button but_three = findViewById(R.id.Dong_three);
        Button but_four = findViewById(R.id.Dong_four);
        mainImg = findViewById(R.id.mainImg);
        but.setOnClickListener(this);
        but_one.setOnClickListener(this);
        but_two.setOnClickListener(this);
        but_three.setOnClickListener(this);
        but_four.setOnClickListener(this);
//        but.setText("Start Game");
    }

    @Override
    public void onClick(View v) {

        //        生成随机数
            int ran1 = new Random().nextInt(4);

//        判断点击按钮
            if (v.getId() == R.id.but) {
                //        生成随机数
//                int ran1 = new Random().nextInt(4);

//            开始游戏提示 & 地鼠图片隐藏
                Toast.makeText(MainActivity.this, "游戏开始", Toast.LENGTH_SHORT).show();
                mainImg.setVisibility(View.GONE);
                but.setVisibility(View.GONE);
            }else if (v.getId() == R.id.Dong_one) {
//            按钮标值
                int num = 0;
                if (num == ran1){
                    Toast.makeText(MainActivity.this, "恭喜猜中", Toast.LENGTH_SHORT).show();
//                地鼠图片恢复
                    mainImg.setVisibility(View.VISIBLE);
                    but.setVisibility(View.VISIBLE);
                }else {
//                猜错提示
                    Toast.makeText(MainActivity.this, "猜错喽.", Toast.LENGTH_SHORT).show();
                }
            }else if (v.getId() == R.id.Dong_two){
                int num = 1;
                if (num == ran1){
                    Toast.makeText(MainActivity.this, "恭喜猜中", Toast.LENGTH_SHORT).show();
                    mainImg.setVisibility(View.VISIBLE);
                    but.setVisibility(View.VISIBLE);
                }else {
                    Toast.makeText(MainActivity.this, "猜错喽.", Toast.LENGTH_SHORT).show();
                }
            }else if (v.getId() == R.id.Dong_three){
                int num = 2;
                if (num == ran1){
                    Toast.makeText(MainActivity.this, "恭喜猜中", Toast.LENGTH_SHORT).show();
                    mainImg.setVisibility(View.VISIBLE);
                    but.setVisibility(View.VISIBLE);
                }else {
                    Toast.makeText(MainActivity.this, "猜错喽.", Toast.LENGTH_SHORT).show();
                }
            }else if(v.getId() == R.id.Dong_four) {
                int num = 3;
                if (num == ran1) {
                    Toast.makeText(MainActivity.this, "恭喜猜中", Toast.LENGTH_SHORT).show();
                    mainImg.setVisibility(View.VISIBLE);
                    but.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(MainActivity.this, "猜错喽.", Toast.LENGTH_SHORT).show();
                }

        }
    }
}