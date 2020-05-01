package com.example.moveiidgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class scores_Activity extends AppCompatActivity {
    private TextView mtas;
    private TextView mtbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores_);
        Intent intent=getIntent();

        mtas = (TextView)findViewById(R.id.tas);
        mtbs = (TextView)findViewById(R.id.tbs);
        String scorea= intent.getStringExtra("scoreA");
        String scoreb=intent.getStringExtra("scoreB");
        mtbs.setText(scoreb);
        mtas.setText(scorea);



    }
}
