package com.dicoding.millatip.myrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.dicoding.millatip.myrecyclerview.adapter.ListHeroesAdapter;
import com.dicoding.millatip.myrecyclerview.model.Heroes;
import com.dicoding.millatip.myrecyclerview.model.HeroesData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListHeroesAdapter.OnHeroListener {

    RecyclerView rvList;
    private ArrayList<Heroes> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvList = findViewById(R.id.rvList);
        rvList.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(HeroesData.getListData());

        showRecyclerList();
    }


    private void showRecyclerList() {
        rvList.setLayoutManager(new LinearLayoutManager(this));
        ListHeroesAdapter listHeroesAdapter = new ListHeroesAdapter(this, this);
        listHeroesAdapter.setListHeroes(list);
        rvList.setAdapter(listHeroesAdapter);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_HERO,list.get(position) );
        startActivity(intent);
    }
}
