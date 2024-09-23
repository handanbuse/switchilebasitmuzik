package com.example.switchlemzikaldirma;

import static com.example.switchlemzikaldirma.R.*;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Switch switchmuzik;
    private MediaPlayer mediaplayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchmuzik=findViewById(R.id.switch1);
        mediaplayer=mediaplayer.create(getApplicationContext(),R.raw.m1);

        switchmuzik.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    mediaplayer.start();
                else
                    //mediaplayer.stop(); tek seferlik açar o yüzden
                mediaplayer.pause();
            }
        });



    }
}