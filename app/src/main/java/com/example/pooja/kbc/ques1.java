package com.example.pooja.kbc;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ques1 extends AppCompatActivity {
Button btn2,btn3,btn4,btn5,btn6;
    int marks;
    EditText e1;MediaPlayer mp,mp1,mp5;
    int m=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);
       // btn7=(Button)findViewById(R.id.button7);
        e1=(EditText) findViewById(R.id.editText);
        mp=MediaPlayer.create(this,R.raw.kbc);
        mp1=MediaPlayer.create(ques1.this,R.raw.kbcr);
        mp5 = MediaPlayer.create(ques1.this, R.raw.kbcback);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn3.setBackgroundColor(Color.GREEN);
                btn4.setBackgroundColor(Color.RED);
                btn5.setBackgroundColor(Color.RED);
                btn6.setBackgroundColor(Color.RED);
               mp.stop();
                mp1.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                m=m+10;
                e1.setText(" Your Score is : "+m);

                Intent i=new Intent(ques1.this,ques2.class);
                startActivity(i);
                i.putExtra("marks",m);
                startActivity(i);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setBackgroundColor(Color.GREEN);
                btn4.setBackgroundColor(Color.RED);
                btn5.setBackgroundColor(Color.RED);
                btn6.setBackgroundColor(Color.RED);


                mp.stop();
                mp5.start();
                m=m+0;
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                e1.setText(" Your Score is : "+m);
                Intent i=new Intent(ques1.this,ques2.class);
                startActivity(i);
                i.putExtra("marks",m);
                startActivity(i);
            }
        });
btn5.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        btn3.setBackgroundColor(Color.GREEN);
        btn4.setBackgroundColor(Color.RED);
        btn5.setBackgroundColor(Color.RED);
        btn6.setBackgroundColor(Color.RED);

        mp.stop();
        mp5.start();
        m=m+0;

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        e1.setText(" Your Score is : "+m);
        Intent i=new Intent(ques1.this,ques2.class);
        startActivity(i);
        i.putExtra("marks",m);
        startActivity(i);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn3.setBackgroundColor(Color.GREEN);
                btn4.setBackgroundColor(Color.RED);
                btn5.setBackgroundColor(Color.RED);
                btn6.setBackgroundColor(Color.RED);
                mp.stop();
                mp5.start();
                m=m+0;
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                e1.setText(" Your Score is : "+m);
                Intent i=new Intent(ques1.this,ques2.class);
                startActivity(i);
                i.putExtra("marks",m);
                startActivity(i);
            }
        });
   /*btn7.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        mp3=MediaPlayer.create(ques1.this,R.raw.kbcback);
        //mp.stop();
        mp3.start();
        Intent i=new Intent(ques1.this,ques2.class);
        startActivity(i);
        marks=Integer.parseInt(e1.getText().toString());
        i.putExtra("Score",marks);
        startActivity(i);

    }
});*/
    }
}
