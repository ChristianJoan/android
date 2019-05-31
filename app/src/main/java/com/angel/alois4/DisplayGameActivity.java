package com.angel.alois4;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayGameActivity extends Activity {

    String opciones[] = {"bicicleta","gato","chayote","computadora","guitarra"};
    int botonCorrecto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_game);
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
                        next();
                    }
                },200);


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
                        next();
                    }
                },200);


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
                        next();
                    }
                },200);


            }
        });
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
    }

    public void start(){
        ImageView imag = (ImageView) findViewById(R.id.imag);
        int numero = (int) (Math.random() * 5) + 1;
        int numero2 = (int) (Math.random() * 5) + 1;
        while(numero2 == numero){
            numero2 = (int) (Math.random() * 5) + 1;
        }
        int numero3 = (int) (Math.random() * 5) + 1;
        while(numero3 == numero || numero3 == numero2){
            numero3 = (int) (Math.random() * 5) + 1;
        }
        switch (numero){
            case 1:
                imag.setImageResource(R.drawable.bicicleta);
                break;

            case 2:
                imag.setImageResource(R.drawable.gato);
                break;

            case 3:
                imag.setImageResource(R.drawable.chayote);
                break;

            case 4:
                imag.setImageResource(R.drawable.computadora);
                break;

            case 5:
                imag.setImageResource(R.drawable.guitarra);
                break;
        }
        defineButton(numero,numero2,numero3);

    }

    public void defineButton(int numero, int numero2, int numero3){
        int acierto = (int) (Math.random() * 3) + 1;
        botonCorrecto = acierto;
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);

        switch(acierto){
            case 1:
                b1.setText(opciones[numero-1]);
                b2.setText(opciones[numero2-1]);
                b3.setText(opciones[numero3-1]);
                break;

            case 2:
                b2.setText(opciones[numero-1]);
                b1.setText(opciones[numero2-1]);
                b3.setText(opciones[numero3-1]);
                break;

            case 3:
                b3.setText(opciones[numero-1]);
                b1.setText(opciones[numero2-1]);
                b2.setText(opciones[numero3-1]);
                break;
        }
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
    }

    public void next(){
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        ImageView imag = (ImageView) findViewById(R.id.imag);
        int numero = (int) (Math.random() * 5) + 1;
        int numero2 = (int) (Math.random() * 5) + 1;
        while(numero2 == numero){
            numero2 = (int) (Math.random() * 5) + 1;
        }
        int numero3 = (int) (Math.random() * 5) + 1;
        while(numero3 == numero || numero3 == numero2){
            numero3 = (int) (Math.random() * 5) + 1;
        }
        switch (numero){
            case 1:
                imag.setImageResource(R.drawable.bicicleta);
                break;

            case 2:
                imag.setImageResource(R.drawable.gato);
                break;

            case 3:
                imag.setImageResource(R.drawable.chayote);
                break;

            case 4:
                imag.setImageResource(R.drawable.computadora);
                break;

            case 5:
                imag.setImageResource(R.drawable.guitarra);
                break;
        }
        defineButton(numero,numero2,numero3);

    }

}
