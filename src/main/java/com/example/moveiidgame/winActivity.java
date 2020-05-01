package com.example.moveiidgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class winActivity extends AppCompatActivity {
    private TextView mtv;
    private Button mxt;
    private Button mrst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        Intent intent2=getIntent();
        mtv=(TextView)findViewById(R.id.result);
        mrst=(Button)findViewById(R.id.rst);
        mxt=(Button)findViewById(R.id.xt);

        String scorea= intent2.getStringExtra("scoreA2");
        String scoreb=intent2.getStringExtra("scoreB2");
        int intscorea=Integer.parseInt(scorea);
        int intscoreb=Integer.parseInt(scoreb);
        if(intscorea<intscoreb){
            mtv.setText("TEAM B");
        }
        else{
            mtv.setText("TEAM A");
        }
        mrst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(winActivity.this, MainActivity.class));
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
