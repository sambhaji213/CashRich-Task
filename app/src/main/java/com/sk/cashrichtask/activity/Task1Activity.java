package com.sk.cashrichtask.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sk.cashrichtask.R;
import com.sk.cashrichtask.adapter.ItemAdapter;
import com.sk.cashrichtask.model.Item;

import java.util.ArrayList;

public class Task1Activity extends AppCompatActivity {

    private int[] imageArray = {R.drawable.hdfc, R.drawable.sbi};
    private String[] nameArray = {"HDFC", "SBI"};
    private String[] mutualFundArray = {"ABC Mutual Fund", "XYZ Mutual Fund"};
    private Double[] currentValueArray = {3500.00, 3500.00};
    private Double[] withdrawalAmountArray = {5000.45, 1500.00};

    private GridLayoutManager gridLayoutManager;
    private RecyclerView recyclerView;

    private ItemAdapter mAdapter;
    private ArrayList<Item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_one);

        recyclerView = findViewById(R.id.recyclerView);

        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        itemArrayList = new ArrayList<>();
        for (int i = 0; i < nameArray.length; i++) {
            itemArrayList.add(new Item(imageArray[i], nameArray[i], mutualFundArray[i], currentValueArray[i], withdrawalAmountArray[i]));
        }

        mAdapter = new ItemAdapter(this, itemArrayList);
        recyclerView.setAdapter(mAdapter);
    }
}