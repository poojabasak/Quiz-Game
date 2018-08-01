package com.example.pooja.kbc;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ques4 extends AppCompatActivity {
    Button btn7,btn19,btn20,btn21,btn22;
    EditText e3;
    MediaPlayer mp9,mp10,mp11;
    int m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques4);
        Bundle b = getIntent().getExtras();
        m = b.getInt("marks");

        mp9=MediaPlayer.create(this,R.raw.kbc);
        mp10=MediaPlayer.create(ques4.this,R.raw.kbcr);
        mp11=MediaPlayer.create(ques4.this,R.raw.kbcback);

        e3=(EditText)findViewById(R.id.editText3);
        btn7=(Button)findViewById(R.id.button7);
        btn19=(Button)findViewById(R.id.button19);
        btn20=(Button)findViewById(R.id.button20);
        btn21=(Button)findViewById(R.id.button21);
        btn22=(Button)findViewById(R.id.button22);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp9.start();

            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn19.setBackgroundColor(Color.GREEN);
                btn20.setBackgroundColor(Color.RED);
                btn21.setBackgroundColor(Color.RED);
                btn22.setBackgroundColor(Color.RED);
               mp9.stop();
                mp10.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                m=m+10;
                e3.setText(" Your Score is : "+m);

                Intent i=new Intent(ques4.this,ques5.class);
                startActivity(i);
                i.putExtra("marks",m);
                startActivity(i);
            }
        });

        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn19.setBackgroundColor(Color.GREEN);
                btn20.setBackgroundColor(Color.RED);
                btn21.setBackgroundColor(Color.RED);
                btn22.setBackgroundColor(Color.RED);

                mp9.stop();
                mp11.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               // m=m+10;
                e3.setText(" Your Score is : "+m);

                Intent i=new Intent(ques4.this,ques5.class);
                startActivity(i);
                i.putExtra("marks",m);
                startActivity(i);
            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn19.setBackgroundColor(Color.GREEN);
                btn20.setBackgroundColor(Color.RED);
                btn21.setBackgroundColor(Color.RED);
                btn22.setBackgroundColor(Color.RED);
             mp9.stop();
                mp11.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // m=m+10;
                e3.setText(" Your Score is : "+m);

                Intent i=new Intent(ques4.this,ques5.class);
                startActivity(i);
                i.putExtra("marks",m);
                startActivity(i);
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn19.setBackgroundColor(Color.GREEN);
                btn20.setBackgroundColor(Color.RED);
                btn21.setBackgroundColor(Color.RED);
                btn22.setBackgroundColor(Color.RED);
               mp9.stop();
                mp11.start();
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // m=m+10;
                e3.setText(" Your Score is : "+m);

                Intent i=new Intent(ques4.this,ques5.class);
                startActivity(i);
                i.putExtra("marks",m);
                startActivity(i);
            }
        });



    }
}
