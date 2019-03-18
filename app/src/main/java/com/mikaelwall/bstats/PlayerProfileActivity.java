package com.mikaelwall.bstats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayerProfileActivity extends AppCompatActivity {

    Player player;
    Intent i;
    Bundle bundle;
    TextView nameTextView;
    TextView fgStatTextView;
    TextView fgRatioTextView;
    TextView blocksTextview;
    TextView stealsTextView;
    TextView assistsTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_profile);

        i = getIntent();

        bundle = i.getExtras();

        player = (Player) bundle.getSerializable("goToPlayerProfile");

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        fgStatTextView = (TextView) findViewById(R.id.fgStatTextView);
        fgRatioTextView = (TextView) findViewById(R.id.fgRatioTextView);
        blocksTextview = (TextView) findViewById(R.id.blocksTextView);
        stealsTextView = (TextView) findViewById(R.id.stealsTextView);
        assistsTextView = (TextView) findViewById(R.id.assistsTextView);



        String fgStat = "FG: " + player.getFgMade() + "/" + player.getFgAttempted();
        String fgratio = "FG%: " + player.getFgRatio() + "%";
        String blocks = "Blocks: " + player.getBlocks();
        String steals = "Steals: " + player.getSteals();
        String assists = "Assists: " + player.getAssists();

        nameTextView.setText(player.getName());
        fgStatTextView.setText(fgStat);
        fgRatioTextView.setText(fgratio);
        blocksTextview.setText(blocks);
        stealsTextView.setText(steals);
        assistsTextView.setText(assists);
    }
}
