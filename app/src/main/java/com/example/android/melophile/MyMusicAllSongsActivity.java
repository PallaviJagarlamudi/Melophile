package com.example.android.melophile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyMusicAllSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music_all_songs);

        Button playSongButton = (Button) findViewById(R.id.playSong_button);
        playSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MyMusicAllSongsActivity.this, NowPlayingActivity.class);
                startActivity(i);
            }
        });
    }
}
