package com.sk.cashrichtask.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.sk.cashrichtask.R;

public class TaskListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        findViewById(R.id.buttonTask1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTaskOneActivity();
            }
        });

        findViewById(R.id.buttonTask2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTaskTwoActivity();
            }
        });
    }

    private void openTaskOneActivity() {
        Intent intent = new Intent(getApplicationContext(), Task1Activity.class);
        startActivity(intent);
    }

    private void openTaskTwoActivity() {
        Intent intent = new Intent(getApplicationContext(), Task2Activity.class);
        startActivity(intent);
    }
}
