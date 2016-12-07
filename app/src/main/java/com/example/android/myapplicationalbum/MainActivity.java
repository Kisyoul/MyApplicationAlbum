package com.example.android.myapplicationalbum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import static com.example.android.myapplicationalbum.R.string.Hotmovie;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenHotMovie(View view){
        Toast.makeText(this,"正在启动热门电影",Toast.LENGTH_SHORT).show();
    }
    public void OpenEagle(View view){
        Toast.makeText(this,"正在启动股票雄鹰",Toast.LENGTH_SHORT).show();
    }
    public void OpenReader(View view){
        Toast.makeText(this,"正在启动XYZ阅读器",Toast.LENGTH_SHORT).show();
    }
    public void OpenNews(View view){
        Toast.makeText(this,"正在启动最新闻",Toast.LENGTH_SHORT).show();
    }
    public void OpenDesign(View view){
        Toast.makeText(this,"正在启动毕业设计",Toast.LENGTH_SHORT).show();
    }
}
