package com.example.android.myapplicationalbum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OpenHotMovie(){
        Toast.makeText(this,R.string.Hotmovie,Toast.LENGTH_SHORT).show();
    }
    public void OpenEagle(){
        Toast.makeText(this,R.string.eagle,Toast.LENGTH_SHORT).show();
    }
    public void OpenReader(){
        Toast.makeText(this,R.string.reader,Toast.LENGTH_SHORT).show();
    }
    public void OpenNews(){
        Toast.makeText(this,R.string.news,Toast.LENGTH_SHORT).show();
    }
    public void OpenDesign(){
        Toast.makeText(this,R.string.design,Toast.LENGTH_SHORT).show();
    }
}
