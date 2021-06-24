package com.meembusoft.recyclerview.sample.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.meembusoft.recyclerview.MRecyclerView;
import com.meembusoft.recyclerview.adapter.RecyclerArrayAdapter;
import com.meembusoft.recyclerview.sample.R;
import com.meembusoft.recyclerview.sample.adapter.MAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private MRecyclerView recyclerView;
    private MAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup recyclerview
        recyclerView = (MRecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        // Prepare data
        List<String> input = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            input.add("Test" + i);
        }

        // Setup adapter
        mAdapter = new MAdapter(MainActivity.this);
        mAdapter.addAll(input);
        mAdapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

            }
        });

        // Load adapter
        recyclerView.setAdapter(mAdapter);

//        recyclerView.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        List<String> input = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            input.add("Test" + i);
//        }
//        mAdapter = new MyAdapter(input);
//        recyclerView.setAdapter(mAdapter);
//        recyclerView.addOnScrollListener(new MRecyclerViewScrollListener(new FanEffect()));
    }
}