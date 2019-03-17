package com.sk.cashrichtask.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.sk.cashrichtask.R;

import java.util.Objects;

public class Task2Activity extends AppCompatActivity {

    private double aValue = 0;
    private double bValue = 0;

    private EditText editTextA;
    private EditText editTextB;
    private EditText editTextC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_two);

        getViewFromLayout();
        setUpViewListener();
    }

    private void setUpViewListener() {
        editTextA.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                if (cs.length() > 0) {
                    aValue = Integer.valueOf(cs.toString());
                    updateCValue();
                }
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
            }

            @Override
            public void afterTextChanged(Editable arg0) {
            }
        });

        editTextB.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                if (cs.length() > 0) {
                    bValue = Integer.valueOf(cs.toString());
                    updateCValue();
                }
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
            }

            @Override
            public void afterTextChanged(Editable arg0) {

            }
        });
    }

    private void updateCValue() {
        if (aValue > 0 && bValue > 0) {
            double cValue = aValue + bValue;
            editTextC.setText(String.valueOf(Math.round(cValue)));
        }
    }

    private void getViewFromLayout() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment aFragment = fragmentManager.findFragmentById(R.id.fragmentA);
        Fragment bFragment = fragmentManager.findFragmentById(R.id.fragmentB);
        Fragment cFragment = fragmentManager.findFragmentById(R.id.fragmentC);

        if (aFragment != null) {
            editTextA = Objects.requireNonNull(aFragment.getView()).findViewById(R.id.editTextA);
        }
        if (bFragment != null) {
            editTextB = Objects.requireNonNull(bFragment.getView()).findViewById(R.id.editTextB);
        }
        if (cFragment != null) {
            editTextC = Objects.requireNonNull(cFragment.getView()).findViewById(R.id.editTextC);
        }
    }
}
