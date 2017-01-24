package com.arpaul.googlespreadsheet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

/**
 * Created by Aritra on 24-01-2017.
 */

public class ListActivity extends AppCompatActivity {

    private RecyclerView rvList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        initialiseControls();

        bindControls();
    }

    private void bindControls() {

    }

    private void initialiseControls() {
        rvList = (RecyclerView) findViewById(R.id.rvList);
    }
}
