package com.example.moveiidgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tieactivity extends AppCompatActivity {
    private Button mrst;
    private Button mxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tieactivity);
        mrst=(Button)findViewById(R.id.rst);
        mxt=(Button)findViewById(R.id.xt);

        mrst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tieactivity.this, MainActivity.class));
            }
        });
        mxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


             finish();
            }
        });
    }
}
