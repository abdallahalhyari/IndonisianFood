package com.rajendra.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.icu.text.Replaceable;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.rajendra.foodapp.adapter.AllMenuAdapter;
import com.rajendra.foodapp.adapter.PopularAdapter;
import com.rajendra.foodapp.adapter.RecommendedAdapter;
import com.rajendra.foodapp.model.Allmenu;
import com.rajendra.foodapp.model.FoodData;
import com.rajendra.foodapp.model.Popular;
import com.rajendra.foodapp.model.Recommended;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
static   MediaPlayer mediaPlayer;

static ImageView imageView1,imageView2;
    RecyclerView popularRecyclerView, recommendedRecyclerView, allMenuRecyclerView;
    music music;
    PopularAdapter popularAdapter;
    RecommendedAdapter recommendedAdapter;
    AllMenuAdapter allMenuAdapter;


    @Override
    protected void onPause() {
        super.onPause();
        music.pause();
    }



    @Override
    protected void onResume() {
        super.onResume();
        if (music.n==1){
            music.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (music==null){
            mediaPlayer=MediaPlayer.create(this,R.raw.m219215);
            music=new music(mediaPlayer,this);
            music.start();
        }



imageView2=findViewById(R.id.imageVw);
imageView1=findViewById(R.id.imageVew);

        List<Popular> popularFoodList = new ArrayList<>();

        popularFoodList.add(new Popular("Soto Betawi\n(Jakarta soup)", R.drawable.p6,"4.1","3 JOD"));
        popularFoodList.add(new Popular("Sate Ayam / Sate\nKambing (satay)",  R.drawable.p7,"4.7","2 JOD"));
        popularFoodList.add(new Popular("Sate Padang\n(Padang satay)",  R.drawable.p8,"4.8","3 JOD"));
        popularFoodList.add(new Popular("Ayam Bakar Taliwang\n(grilled chicken)",  R.drawable.p9,"4.9","4 JOD"));
        popularFoodList.add(new Popular("Pepes\n(herbal packet)", R.drawable.p10,"3.4","4 JOD"));


       getPopularData(popularFoodList);


        List<Allmenu> FoodList = new ArrayList<>();
        FoodList.add(new Allmenu("Ayam Goreng\n(fried chicken)", "3 JOD", R.drawable.p1, "4.5"));
        FoodList.add(new Allmenu("Bebek Goreng\n(fried duck)", "2 JOD", R.drawable.p2, "4.0"));
        FoodList.add(new Allmenu("Ikan Bakar\n(grilled fish)", "2 JOD", R.drawable.p3, "3.5"));
        FoodList.add(new Allmenu("Pecel Lele\n(fried catfish)", "2 JOD", R.drawable.p4, "4.2"));
        FoodList.add(new Allmenu("Ikan Goreng\n(deep fried fish)", "2 JOD", R.drawable.p5, "4.2"));
        FoodList.add(new Allmenu("Soto Betawi\n(Jakarta soup)", "3 JOD", R.drawable.p6, "4.1"));
        FoodList.add(new Allmenu("Sate Ayam / Sate\nKambing (satay)", "2 JOD", R.drawable.p7, "4.7"));
        FoodList.add(new Allmenu("Sate Padang\n(Padang satay)", "3 JOD", R.drawable.p8, "4.8"));
        FoodList.add(new Allmenu("Ayam Bakar Taliwang\n(grilled chicken)", "4 JOD", R.drawable.p9, "4.9"));
        FoodList.add(new Allmenu("Pepes\n(herbal packet)", "4 JOD", R.drawable.p10, "3.4"));

        getAllMenu(FoodList);

        List<Recommended> recommendeds = new ArrayList<>();
       recommendeds.add(new Recommended("Ayam Goreng\n(fried chicken)", "3", R.drawable.p1, "4.5", "Briand Restaurant"));
        recommendeds.add(new Recommended("Bebek Goreng\n(fried duck)", "2", R.drawable.p2, "4.0", "Friends Restaurant"));
        recommendeds.add(new Recommended("Ikan Bakar\n(grilled fish)", "2", R.drawable.p3, "3.5", "Briand Restaurant"));
        recommendeds.add(new Recommended("Pecel Lele\n(fried catfish)", "2", R.drawable.p4, "4.2", "Friends Restaurant"));

        getRecommendedData(recommendeds);

    }

    private void  getPopularData(List<Popular> popularList){

        popularRecyclerView = findViewById(R.id.popular_recycler);
        popularAdapter = new PopularAdapter(this, popularList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        popularRecyclerView.setLayoutManager(layoutManager);
        popularRecyclerView.setAdapter(popularAdapter);

    }

    private void  getRecommendedData(List<Recommended> recommendedList){

        recommendedRecyclerView = findViewById(R.id.recommended_recycler);
        recommendedAdapter = new RecommendedAdapter(this, recommendedList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recommendedRecyclerView.setLayoutManager(layoutManager);
        recommendedRecyclerView.setAdapter(recommendedAdapter);

    }

    private void  getAllMenu(List<Allmenu> allmenuList){

        allMenuRecyclerView = findViewById(R.id.all_menu_recycler);
        allMenuAdapter = new AllMenuAdapter(this, allmenuList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        allMenuRecyclerView.setLayoutManager(layoutManager);
        allMenuRecyclerView.setAdapter(allMenuAdapter);
        allMenuAdapter.notifyDataSetChanged();

    }

    public void recycle(View view) {
        Intent intent=new Intent(getApplicationContext(),Add_Cart.class);
        startActivity(intent);
    }

    public void music(View view) {


            imageView1.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
            mediaPlayer.pause();
music.n=0;

    }

    public void musc(View view) {
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        mediaPlayer.start();
   music.n=1;
    }
}
