package com.mikaelwall.bstats;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.Serializable;

public class PlayerlistActivity extends AppCompatActivity {

    TextView player1Spot;
    TextView player2Spot;
    TextView player3Spot;
    TextView player4Spot;
    TextView player5Spot;

    Player mikaelWall = new Player("Mikael Wall");
    Player rasmusOhlgren = new Player("Rasmus Ohlgren");
    Player gabrielWall = new Player("Gabriel Wall");
    Player andreasOhlsson = new Player("Andreas Ohlsson");
    Player nikitaBerezkin = new Player("Nikita Berezkin");

    Player playerArray[] = new Player[5];
    TextView textViewArray[] = new TextView[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playerlist);

        playerArray[0] = mikaelWall;
        playerArray[1] = rasmusOhlgren;
        playerArray[2] = gabrielWall;
        playerArray[3] = andreasOhlsson;
        playerArray[4] = nikitaBerezkin;

        player1Spot = (TextView) findViewById(R.id.player1spot);
        player2Spot = (TextView) findViewById(R.id.player2spot);
        player3Spot = (TextView) findViewById(R.id.player3spot);
        player4Spot = (TextView) findViewById(R.id.player4spot);
        player5Spot = (TextView) findViewById(R.id.player5spot);

        textViewArray[0] = player1Spot;
        textViewArray[1] = player2Spot;
        textViewArray[2] = player3Spot;
        textViewArray[3] = player4Spot;
        textViewArray[4] = player5Spot;


        for (int i = 0; i < textViewArray.length; i++){

            textViewArray[i].setText(playerArray[i].getName());

            final int index = i;

            textViewArray[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent playerProfileIntent = new Intent(getApplicationContext(), PlayerProfileActivity.class);

                    Bundle bundle = new Bundle();
                    bundle.putSerializable("goToPlayerProfile", playerArray[index]);
                    playerProfileIntent.putExtras(bundle);
                    startActivity(playerProfileIntent);
                }
            });

        }

    }
}
