package com.angel.alois4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendGame(View view){
        Intent intent = new Intent(this, DisplayGameActivity.class);
        startActivity(intent);
    }

    public void sendGame2(View view){
        Intent intent = new Intent(this,DisplayGame2.class);
        startActivity(intent);
    }

    public void sendGame3(View view){
        Intent intent = new Intent(this,DisplayGame3.class);
        startActivity(intent);
    }

    public void sendGame4(View view){
        Intent intent = new Intent(this, DisplayGame4.class);
        startActivity(intent);
    }

    public void sendGame5(View view){
        Intent intent = new Intent(this,DisplayGame5.class);
        startActivity(intent);
    }
}
