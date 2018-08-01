package com.example.pooja.kbc;

import android.Manifest;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Final extends AppCompatActivity {
    Button btn28;
    EditText e5;
    int m;
    MediaPlayer mp15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        mp15=MediaPlayer.create(Final.this,R.raw.kbcr);
        Bundle b = getIntent().getExtras();
        m = b.getInt("marks");
        e5=(EditText)findViewById(R.id.editText5);
        btn28=(Button)findViewById(R.id.button28);
        mp15.start();

        String y= String.valueOf(m);
        e5.setText("Score :" +y);

        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent i=new Intent(Final.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
