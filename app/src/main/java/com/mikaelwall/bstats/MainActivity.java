package com.mikaelwall.bstats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playerListBtn = (Button) findViewById(R.id.playerListBtn);
        playerListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playerListIntent = new Intent(getApplicationContext(), PlayerlistActivity.class);
                playerListIntent.putExtra("gotoPlayerlist", 0);
                startActivity(playerListIntent);
            }
        });

        Button leaderboardsBtn = (Button) findViewById(R.id.leaderboardsBtn);
        leaderboardsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leaderboardsIntent = new Intent(getApplicationContext(), LeaderboardsActivity.class);
                leaderboardsIntent.putExtra("gotoLeaderboards", 0);
                startActivity(leaderboardsIntent);
            }
        });

        Button startBtn = (Button) findViewById(R.id.startGameBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameStartIntent = new Intent(getApplicationContext(), GamestartActivity.class);
                gameStartIntent.putExtra("gotoGameStart", 0);
                startActivity(gameStartIntent);
            }
        });
    }
}
