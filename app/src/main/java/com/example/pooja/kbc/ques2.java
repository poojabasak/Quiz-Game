package com.example.pooja.kbc;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ques2 extends AppCompatActivity {
Button btn8,btn9,btn10,btn11,btn12;
    EditText e2;
    MediaPlayer mp2,mp3,mp4;
  int m;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);
        Bundle b = getIntent().getExtras();
         m = b.getInt("marks");

        btn8=(Button)findViewById(R.id.button8);
        btn9=(Button)findViewById(R.id.button9);
        btn10=(Button)findViewById(R.id.button10);
        btn11=(Button)findViewById(R.id.button11);
        btn12=(Button)findViewById(R.id.button12);
       // btn13=(Button)findViewById(R.id.button13);
        e2=(EditText) findViewById(R.id.editText1);
        mp2=MediaPlayer.create(this,R.raw.kbc);
        mp3 = MediaPlayer.create(ques2.this, R.raw.kbcr);
        mp4=MediaPlayer.create(ques2.this,R.raw.kbcback);





        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn9.setBackgroundColor(Color.GREEN);
                btn10.setBackgroundColor(Color.RED);
                btn11.setBackgroundColor(Color.RED);
                btn12.setBackgroundColor(Color.RED);
                mp3 = MediaPlayer.create(ques2.this, R.raw.kbcr);
                mp2.stop();
                mp3.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                m=m+10;
                e2.setText(" Your Score is : "+m);

                Intent i2=new Intent(ques2.this,ques3.class);
                startActivity(i2);
                i2.putExtra("marks",m);
                startActivity(i2);




            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setBackgroundColor(Color.GREEN);
                btn10.setBackgroundColor(Color.RED);
                btn11.setBackgroundColor(Color.RED);
                btn12.setBackgroundColor(Color.RED);
                //e2.setText(" Your Score is : 0");
              mp2.stop();
                mp4.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                e2.setText(" Your Score is : "+m);

                Intent i2=new Intent(ques2.this,ques3.class);
                startActivity(i2);
                i2.putExtra("marks",m);
                startActivity(i2);;



                // e2.setText("Your Score is : "+m);
            }

        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setBackgroundColor(Color.GREEN);
                btn10.setBackgroundColor(Color.RED);
                btn11.setBackgroundColor(Color.RED);
                btn12.setBackgroundColor(Color.RED);
                //e2.setText(" Your Score is : 0");
             mp2.stop();

                mp4.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                e2.setText(" Your Score is : "+m);

                Intent i2=new Intent(ques2.this,ques3.class);
                startActivity(i2);
                i2.putExtra("marks",m);
                startActivity(i2);

               // e2.setText("Your Score is : "+m);

            }
            });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn9.setBackgroundColor(Color.GREEN);
                btn10.setBackgroundColor(Color.RED);
                btn11.setBackgroundColor(Color.RED);
                btn12.setBackgroundColor(Color.RED);

                mp2.stop();

                mp4.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                e2.setText(" Your Score is : "+m);

                Intent i2=new Intent(ques2.this,ques3.class);
                startActivity(i2);
                i2.putExtra("marks",m);
                startActivity(i2);

            }
        });
      /*  btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1=MediaPlayer.create(ques2.this,R.raw.kbcback);

                mp1.start();


            }
        });*/


    }


}
