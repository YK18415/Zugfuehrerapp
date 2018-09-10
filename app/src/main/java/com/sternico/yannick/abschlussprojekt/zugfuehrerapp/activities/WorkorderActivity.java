package com.sternico.yannick.abschlussprojekt.zugfuehrerapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.sternico.yannick.abschlussprojekt.zugfuehrerapp.R;
import com.sternico.yannick.abschlussprojekt.zugfuehrerapp.WorkorderListAdapter;

public class WorkorderActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    WorkorderListAdapter workorderListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workorder);

        Toast.makeText(this, "Das Login hat funktioniert!", Toast.LENGTH_SHORT).show();

        recyclerView = findViewById(R.id.recyclerView);
        workorderListAdapter = new WorkorderListAdapter(this);
        recyclerView.setAdapter(workorderListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


}

