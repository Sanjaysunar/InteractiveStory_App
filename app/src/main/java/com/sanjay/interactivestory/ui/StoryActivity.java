package com.sanjay.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.sanjay.interactivestory.R;
import com.sanjay.interactivestory.model.Page;

public class StoryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        intent.getStringExtra(getString(R.string.key_name));


    }
}