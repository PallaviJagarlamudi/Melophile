package com.example.android.melophile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);


        Button myMusicAllButton = (Button) findViewById(R.id.myMusic_all);
        myMusicAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MyMusicActivity.this, MyMusicAllSongsActivity.class);
                startActivity(i);
            }
        });

        Button myMusicAlbumButton = (Button) findViewById(R.id.myMusic_album);
        myMusicAlbumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MyMusicActivity.this, MyMusicAlbumActivity.class);
                startActivity(i);
            }
        });
;

        Button genreButton = (Button) findViewById(R.id.myMusic_genre);
        genreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MyMusicActivity.this, MyMusicGenreActivity.class);
                startActivity(i);
            }
        });

        Button playlistButton = (Button) findViewById(R.id.myMusic_playlist);
        playlistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MyMusicActivity.this, MyMusicPlaylistActivity.class);
                startActivity(i);
            }
        });
    }
}
