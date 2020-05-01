package com.example.moveiidgame;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class names_Activity extends AppCompatActivity {
    private TextView mTextView;
    private Button mButton;
    private Button mta;
    private Button mtb;
    private Button mscr;

    int scorea=0;
    int scoreb=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_names_);

        mscr=(Button)findViewById(R.id.scrs);
        mta=(Button)findViewById(R.id.ta);
        mtb=(Button)findViewById(R.id.tb);
        mta.setEnabled(false);
        mtb.setEnabled(false);

        mTextView=(TextView)findViewById(R.id.fmname);
        mButton=(Button)findViewById(R.id.spin);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandom();
                if(mTextView.getText().toString().equals("Game Over")){
                    mta.setEnabled(false);
                    mtb.setEnabled(false);
                }else{
                mta.setEnabled(true);
                mtb.setEnabled(true);}
                mta.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        scorea++;
                        mta.setEnabled(false);
                        mtb.setEnabled(false);
                        mButton.setEnabled(true);


                    }
                });
                mtb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        scoreb++;
                        mta.setEnabled(false);
                        mtb.setEnabled(false);
                        mButton.setEnabled(true);
                    }
                });

            }

        });
        mscr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mscr.getText().toString().equals("show results")) {
                    if(scorea==scoreb){
                        startActivity(new Intent(names_Activity.this, tieactivity.class));
                    }else{
                    Intent intent2=new Intent(getApplicationContext(),winActivity.class);
                    intent2.putExtra("scoreA2",Integer.toString(scorea));
                    intent2.putExtra("scoreB2",Integer.toString(scoreb));
                    startActivity(intent2);}
                }else{
                Intent intent=new Intent(names_Activity.this,scores_Activity.class);

                intent.putExtra("scoreA",Integer.toString(scorea));
                intent.putExtra("scoreB",Integer.toString(scoreb));
                startActivity(intent);

                }
            }
        });


    }




    String[] filmarray={"1","Inception","Dark Knight","Godfather","Iron Man","Shawshank Redemption","Martian","Conjuring","21 Jump Street"};
    public void showRandom() {
        if ((filmarray[0] == "1" && filmarray[1] == "1") && (filmarray[2] == "1" && filmarray[3] == "1") && (filmarray[4] == "1" && filmarray[5] == "1") && (filmarray[6] == "1" && filmarray[7] == "1")&&filmarray[8]=="1") {
            mButton.setEnabled(false);

            mTextView.setText("Game Over");
            mscr.setText("show results");




        } else {

            while (filmarray[0] == "1") {
                shuf();
            }
            mTextView.setText(filmarray[0]);
            Arrays.asList(filmarray).set(0, "1");
            mButton.setEnabled(false);

        }

    }
    public void shuf(){
        Collections.shuffle(Arrays.asList(filmarray));

    }


}
