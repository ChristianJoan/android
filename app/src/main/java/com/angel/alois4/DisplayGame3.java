package com.angel.alois4;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayGame3 extends Activity {
    String frase[] = {"No hay caminos para la paz; la paz ",
                        "Haz el amor y no ",
                        "Pienso, luego ",
                        "Mas vale pajaro en mano que ",
                        "Lo que no te mata te hace"};

    String respuesta[] = {"Es el camino",
                            "la guerra",
                            "Existo",
                            "100 volando",
                            "mas mamadisimo, hijos de su puta madre"};

    int botonCorrecto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_game3);
        start();
        ImageView bien = (ImageView) findViewById(R.id.bien);
        bien.setVisibility(View.INVISIBLE);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b1 = (Button) findViewById(R.id.button1);
                Button b2 = (Button) findViewById(R.id.button2);
                Button b3 = (Button) findViewById(R.id.button3);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                ImageView bien = (ImageView) findViewById(R.id.bien);
                if (botonCorrecto == 1){
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
                Button b1 = (Button) findViewById(R.id.button1);
                Button b2 = (Button) findViewById(R.id.button2);
                Button b3 = (Button) findViewById(R.id.button3);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                if (botonCorrecto == 2){
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

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView bien = (ImageView) findViewById(R.id.bien);
                Button b1 = (Button) findViewById(R.id.button1);
                Button b2 = (Button) findViewById(R.id.button2);
                Button b3 = (Button) findViewById(R.id.button3);
                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                if (botonCorrecto == 3){
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
        b3.setEnabled(true);
    }

    public void start(){
        TextView f = (TextView) findViewById(R.id.frase);

        int numero = (int) (Math.random() * frase.length) + 1;
        int numero2 = (int) (Math.random() * frase.length) + 1;
        while(numero2 == numero){
            numero2 = (int) (Math.random() * frase.length) + 1;
        }
        int numero3 = (int) (Math.random() * frase.length) + 1;
        while(numero3 == numero || numero3 == numero2){
            numero3 = (int) (Math.random() * frase.length) + 1;
        }

        switch (numero){
            case 1:
                f.setText(frase[0]);
                break;

            case 2:
                f.setText(frase[1]);
                break;

            case 3:
                f.setText(frase[2]);
                break;

            case 4:
                f.setText(frase[3]);
                break;

            case 5:
                f.setText(frase[4]);
                break;
        }

        defineBoton(numero,numero2,numero3);
    }

    public void defineBoton(int numero, int numero2, int numero3){

        int acierto = (int) (Math.random() * 3) + 1;
        botonCorrecto = acierto;
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);

        switch(acierto){
            case 1:
                b1.setText(respuesta[numero-1]);
                b2.setText(respuesta[numero2-1]);
                b3.setText(respuesta[numero3-1]);
                break;

            case 2:
                b2.setText(respuesta[numero-1]);
                b1.setText(respuesta[numero2-1]);
                b3.setText(respuesta[numero3-1]);
                break;

            case 3:
                b3.setText(respuesta[numero-1]);
                b1.setText(respuesta[numero2-1]);
                b2.setText(respuesta[numero3-1]);
                break;
        }
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
    }
}
