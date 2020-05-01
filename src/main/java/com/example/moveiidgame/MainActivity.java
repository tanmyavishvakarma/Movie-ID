package com.example.moveiidgame;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button howto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        howto=(Button)findViewById(R.id.inst);
        Button begin = (Button)findViewById(R.id.begin);
        howto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,instruction.class));
            }
        });



        begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, names_Activity.class));
            }
        });
    }
}
