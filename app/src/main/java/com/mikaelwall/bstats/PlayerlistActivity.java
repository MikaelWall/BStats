package com.mikaelwall.bstats;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class PlayerlistActivity extends AppCompatActivity {

    Player mikaelWall = new Player("Mikael Wall");
    Player rasmusOhlgren = new Player("Rasmus Ohlgren");
    Player gabrielWall = new Player("Gabriel Wall");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playerlist);

        Resources res = getResources();
        ListView myListView = (ListView) findViewById(R.id.playerListView);


    }
}
