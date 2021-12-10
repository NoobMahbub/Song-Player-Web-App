package com.techhelpbd.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

LinearLayout sg1,sg2,sg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sg1 = findViewById(R.id.sg1);
        sg2 = findViewById(R.id.sg2);
        sg3 = findViewById(R.id.sg3);

        sg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.videoUrl = "https://www.youtube.com/embed/C_KmdNQpDAc";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        sg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.videoUrl = "https://www.youtube.com/embed/CxN0oHJtTzE?auoplay=1";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });

        sg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                VideoPlayer.videoUrl = "https://www.youtube.com/embed/eaRbdH7vhB0?autoplay=1";
                Intent myIntent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(myIntent);
            }
        });




    }
}
