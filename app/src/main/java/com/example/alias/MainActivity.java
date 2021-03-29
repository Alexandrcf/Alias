package com.example.alias;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonGame, buttonRules, buttonExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();
        buttonActions();
    }

    private void initButtons() {
        buttonGame = (Button) findViewById(R.id.button_game);
        buttonRules = (Button) findViewById(R.id.button_rules);
        buttonExit = (Button) findViewById(R.id.button_exit);
    }

    private void buttonActions() {
        buttonGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GameActivityAlias.class);
                startActivity(intent);
            }
        });

        buttonRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RulesActivity.class);
                startActivity(intent);
            }
        });

        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}