package com.example.pooja.kbc;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ques5 extends AppCompatActivity {
    EditText e4;
    Button btn23,btn24,btn25,btn26,btn27;
    MediaPlayer mp12,mp13,mp14;
    int m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques5);
        Bundle b = getIntent().getExtras();
        m = b.getInt("marks");

        mp12=MediaPlayer.create(this,R.raw.kbc);
        mp13=MediaPlayer.create(ques5.this,R.raw.kbcr);
        mp14=MediaPlayer.create(ques5.this,R.raw.kbcback);

        e4=(EditText)findViewById(R.id.editText4);
        btn23=(Button)findViewById(R.id.button23);
        btn24=(Button)findViewById(R.id.button24);
        btn25=(Button)findViewById(R.id.button25);
        btn26=(Button)findViewById(R.id.button26);
        btn27=(Button)findViewById(R.id.button27);

        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp12.start();

            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn24.setBackgroundColor(Color.GREEN);
                btn25.setBackgroundColor(Color.RED);
                btn26.setBackgroundColor(Color.RED);
                btn27.setBackgroundColor(Color.RED);
               mp12.stop();
                mp13.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                m=m+10;
                e4.setText(" Your Score is : "+m);

                Intent i=new Intent(ques5.this,Final.class);
                startActivity(i);
                i.putExtra("marks",m);
                startActivity(i);
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn24.setBackgroundColor(Color.GREEN);
                btn25.setBackgroundColor(Color.RED);
                btn26.setBackgroundColor(Color.RED);
                btn27.setBackgroundColor(Color.RED);

                mp12.stop();
                mp14.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               // m=m+10;
                e4.setText(" Your Score is : "+m);

                Intent i=new Intent(ques5.this,Final.class);
                startActivity(i);
                i.putExtra("marks",m);
                startActivity(i);
            }
        });
        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn24.setBackgroundColor(Color.GREEN);
                btn25.setBackgroundColor(Color.RED);
                btn26.setBackgroundColor(Color.RED);
                btn27.setBackgroundColor(Color.RED);
               mp12.stop();
                mp14.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // m=m+10;
                e4.setText(" Your Score is : "+m);

                Intent i=new Intent(ques5.this,Final.class);
                startActivity(i);
                i.putExtra("marks",m);
                startActivity(i);
            }
        });
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn24.setBackgroundColor(Color.GREEN);
                btn25.setBackgroundColor(Color.RED);
                btn26.setBackgroundColor(Color.RED);
                btn27.setBackgroundColor(Color.RED);
               mp12.stop();
                mp14.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // m=m+10;
                e4.setText(" Your Score is : "+m);

                Intent i=new Intent(ques5.this,Final.class);
                startActivity(i);
                i.putExtra("marks",m);
                startActivity(i);
            }
        });
    }
}
