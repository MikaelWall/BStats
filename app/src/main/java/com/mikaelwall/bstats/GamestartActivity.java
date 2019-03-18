package com.mikaelwall.bstats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GamestartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamestart);

        Button oneGameBtn = (Button) findViewById(R.id.oneGameBtn);
        oneGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameFeedIntent = new Intent(getApplicationContext(), GameFeedActivity.class);
                gameFeedIntent.putExtra("gotoGameFeed", 0);
                startActivity(gameFeedIntent);
            }
        });

        Button twoGameBtn = (Button) findViewById(R.id.twoGameButton);
        twoGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameFeedIntent = new Intent(getApplicationContext(), GameFeedActivity.class);
                gameFeedIntent.putExtra("goToGameFeed", 0);
                startActivity(gameFeedIntent);
            }
        });
    }
}
