package com.example.pooja.kbc;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ques3 extends AppCompatActivity {
Button btn14,btn15,btn16,btn17,btn18;
    MediaPlayer mp6,mp7,mp8;
    int m;
    EditText et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques3);

        Bundle b = getIntent().getExtras();
        m = b.getInt("marks");

        mp6=MediaPlayer.create(this,R.raw.kbc);
        mp7 = MediaPlayer.create(ques3.this, R.raw.kbcr);
        mp8= MediaPlayer.create(ques3.this, R.raw.kbcback);


        et3=(EditText)findViewById(R.id.editText2);
        btn14=(Button)findViewById(R.id.button14);
        btn15=(Button)findViewById(R.id.button15);
        btn16=(Button)findViewById(R.id.button16);
        btn17=(Button)findViewById(R.id.button17);
        btn18=(Button)findViewById(R.id.button18);


        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn15.setBackgroundColor(Color.GREEN);
                btn16.setBackgroundColor(Color.RED);
                btn17.setBackgroundColor(Color.RED);
                btn18.setBackgroundColor(Color.RED);

                mp6.stop();
                mp7.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                m=m+10;
                et3.setText(" Your Score is : "+m);

                Intent i2=new Intent(ques3.this,ques4.class);
                startActivity(i2);
                i2.putExtra("marks",m);
                startActivity(i2);





            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn15.setBackgroundColor(Color.GREEN);
                btn16.setBackgroundColor(Color.RED);
                btn17.setBackgroundColor(Color.RED);
                btn18.setBackgroundColor(Color.RED);
               mp6.stop();
                mp8.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // m=m+10;
                et3.setText(" Your Score is : " + m);

                Intent i2 = new Intent(ques3.this, ques4.class);
                startActivity(i2);
                i2.putExtra("marks", m);
                startActivity(i2);
            }
        });

        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn15.setBackgroundColor(Color.GREEN);
                btn16.setBackgroundColor(Color.RED);
                btn17.setBackgroundColor(Color.RED);
                btn18.setBackgroundColor(Color.RED);
                mp6.stop();
                mp8.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // m=m+10;
                et3.setText(" Your Score is : " + m);

                Intent i2 = new Intent(ques3.this, ques4.class);
                startActivity(i2);
                i2.putExtra("marks", m);
                startActivity(i2);
            }
        });

        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn15.setBackgroundColor(Color.GREEN);
                btn16.setBackgroundColor(Color.RED);
                btn17.setBackgroundColor(Color.RED);
                btn18.setBackgroundColor(Color.RED);
                mp6.stop();
                mp8.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // m=m+10;
                et3.setText(" Your Score is : " + m);

                Intent i2 = new Intent(ques3.this, ques4.class);
                startActivity(i2);
                i2.putExtra("marks", m);
                startActivity(i2);
            }
        });


    }
}
