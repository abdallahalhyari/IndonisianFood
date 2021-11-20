package com.rajendra.foodapp;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.opengl.Visibility;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewpager2.widget.ViewPager2;

public class Add_Cart extends AppCompatActivity {
String textView;
ImageView imageView1;

    @Override
    protected void onStart() {
        super.onStart();

        if (music.n==0){
            music.mediaPlayer.pause();
        }
        else {
            music.mediaPlayer.start();
        }
    }
    protected void onPause() {
        super.onPause();

        music.mediaPlayer.pause();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView="ORDER NOW";
        imageView1=findViewById(R.id.imageVw);


    }


    public void home_page(View view) {
        Intent intent = new Intent(this, FoodDetails.class);
        startActivity(intent);
    }





    public void add(View view) {
        Intent intent = new Intent(this, payment.class);
        startActivity(intent);


    }
}