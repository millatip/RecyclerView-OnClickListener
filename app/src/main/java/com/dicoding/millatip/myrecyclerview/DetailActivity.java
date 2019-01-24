package com.dicoding.millatip.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.millatip.myrecyclerview.model.Heroes;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_HERO = "extra_hero";
    ImageView imageHero;
    TextView descriptionHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageHero = findViewById(R.id.imageHero);
        descriptionHero = findViewById(R.id.tvHeroDescription);

        Heroes heroes = getIntent().getParcelableExtra(EXTRA_HERO);

        Glide.with(this).load(heroes.getPhoto()).into(imageHero);
        descriptionHero.setText(heroes.getRemarks());
        getSupportActionBar().setTitle(heroes.getName());

    }
}
