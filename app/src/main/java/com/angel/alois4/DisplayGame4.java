package com.angel.alois4;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayGame4 extends Activity {

    String problema[] = {"lluvia","lentes","cacao"};
    String correcto[] = {"nube","ojos","taza"};
    String incorrecto[] = {"sol","nariz","vaso"};
    int acierto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_game4);

        start();

        ImageView bien = (ImageView) findViewById(R.id.bien);
        bien.setVisibility(View.INVISIBLE);
        ImageButton b1 = (ImageButton) findViewById(R.id.imageButton);
        ImageButton b2 = (ImageButton) findViewById(R.id.imageButton2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton b1 = (ImageButton) findViewById(R.id.imageButton);
                ImageButton b2 = (ImageButton) findViewById(R.id.imageButton2);

                b1.setEnabled(false);
                b2.setEnabled(false);

                ImageView bien = (ImageView) findViewById(R.id.bien);
                if (acierto == 1){
                    bien.setImageResource(R.drawable.acierto);
                } else{
                    bien.setImageResource(R.drawable.error);
                }
                bien.setVisibility(View.VISIBLE);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        ImageView bien = (ImageView) findViewById(R.id.bien);
                        bien.setVisibility(View.INVISIBLE);
                        start();
                    }
                },800);


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView bien = (ImageView) findViewById(R.id.bien);
                ImageButton b1 = (ImageButton) findViewById(R.id.imageButton);
                ImageButton b2 = (ImageButton) findViewById(R.id.imageButton2);

                b1.setEnabled(false);
                b2.setEnabled(false);

                if (acierto == 2){
                    bien.setImageResource(R.drawable.acierto);

                } else{
                    bien.setImageResource(R.drawable.error);
                }
                bien.setVisibility(View.VISIBLE);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        ImageView bien = (ImageView) findViewById(R.id.bien);
                        bien.setVisibility(View.INVISIBLE);
                        start();
                    }
                },800);


            }
        });


        b1.setEnabled(true);
        b2.setEnabled(true);
    }

    public void start(){

        ImageView img = (ImageView) findViewById(R.id.imageView);

        ImageButton b1 = (ImageButton) findViewById(R.id.imageButton);
        ImageButton b2 = (ImageButton) findViewById(R.id.imageButton2);

        int numero = (int) (Math.random() * problema.length) + 1;
        acierto = (int) (Math.random() * 2) + 1;

        switch (numero){
            case 1:
                img.setImageResource(R.drawable.lluvia);
                if(acierto == 1){
                    b1.setImageResource(R.drawable.nube);
                    b2.setImageResource(R.drawable.sol);
                } else {
                    b1.setImageResource(R.drawable.sol);
                    b2.setImageResource(R.drawable.nube);
                }
                break;

            case 2:
                img.setImageResource(R.drawable.lentes);
                if(acierto == 1){
                    b1.setImageResource(R.drawable.ojos);
                    b2.setImageResource(R.drawable.boca);
                } else {
                    b1.setImageResource(R.drawable.boca);
                    b2.setImageResource(R.drawable.ojos);
                }
                break;


            case 3:
                img.setImageResource(R.drawable.cacao);
                if(acierto == 1){
                    b1.setImageResource(R.drawable.taza);
                    b2.setImageResource(R.drawable.vaso);
                } else {
                    b1.setImageResource(R.drawable.vaso);
                    b2.setImageResource(R.drawable.taza);
                }
                break;
        }
        b1.setEnabled(true);
        b2.setEnabled(true);
    }
}
