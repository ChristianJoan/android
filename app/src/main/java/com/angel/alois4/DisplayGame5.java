package com.angel.alois4;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayGame5 extends Activity {

    String preguntas[] = {"El Limon","El Aguacate","El Mar","El Cielo","El Platano","El Girasol","La Sangre", "La Cereza", "La Tierra", "El café", "La zanahoria","La Mandarina"};
    String respuesta[] = {"1","1","2","2","3","3","4","4","5","5","6","6"};
    String botonCorrecto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_game5);

        start();
        ImageView bien = (ImageView) findViewById(R.id.bien);
        bien.setVisibility(View.INVISIBLE);
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b1 = (Button) findViewById(R.id.button1);
                Button b2 = (Button) findViewById(R.id.button2);
                Button b3 = (Button) findViewById(R.id.button3);
                Button b4 = (Button) findViewById(R.id.button4);
                Button b5 = (Button) findViewById(R.id.button5);
                Button b6 = (Button) findViewById(R.id.button6);

                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);

                ImageView bien = (ImageView) findViewById(R.id.bien);
                if (botonCorrecto == "1"){
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
                Button b1 = (Button) findViewById(R.id.button1);
                Button b2 = (Button) findViewById(R.id.button2);
                Button b3 = (Button) findViewById(R.id.button3);
                Button b4 = (Button) findViewById(R.id.button4);
                Button b5 = (Button) findViewById(R.id.button5);
                Button b6 = (Button) findViewById(R.id.button6);

                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);

                ImageView bien = (ImageView) findViewById(R.id.bien);
                if (botonCorrecto == "2"){
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
                Button b1 = (Button) findViewById(R.id.button1);
                Button b2 = (Button) findViewById(R.id.button2);
                Button b3 = (Button) findViewById(R.id.button3);
                Button b4 = (Button) findViewById(R.id.button4);
                Button b5 = (Button) findViewById(R.id.button5);
                Button b6 = (Button) findViewById(R.id.button6);

                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);

                ImageView bien = (ImageView) findViewById(R.id.bien);
                if (botonCorrecto == "3"){
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

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b1 = (Button) findViewById(R.id.button1);
                Button b2 = (Button) findViewById(R.id.button2);
                Button b3 = (Button) findViewById(R.id.button3);
                Button b4 = (Button) findViewById(R.id.button4);
                Button b5 = (Button) findViewById(R.id.button5);
                Button b6 = (Button) findViewById(R.id.button6);

                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);

                ImageView bien = (ImageView) findViewById(R.id.bien);
                if (botonCorrecto == "4"){
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

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b1 = (Button) findViewById(R.id.button1);
                Button b2 = (Button) findViewById(R.id.button2);
                Button b3 = (Button) findViewById(R.id.button3);
                Button b4 = (Button) findViewById(R.id.button4);
                Button b5 = (Button) findViewById(R.id.button5);
                Button b6 = (Button) findViewById(R.id.button6);

                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);

                ImageView bien = (ImageView) findViewById(R.id.bien);
                if (botonCorrecto == "5"){
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

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b1 = (Button) findViewById(R.id.button1);
                Button b2 = (Button) findViewById(R.id.button2);
                Button b3 = (Button) findViewById(R.id.button3);
                Button b4 = (Button) findViewById(R.id.button4);
                Button b5 = (Button) findViewById(R.id.button5);
                Button b6 = (Button) findViewById(R.id.button6);

                b1.setEnabled(false);
                b2.setEnabled(false);
                b3.setEnabled(false);
                b4.setEnabled(false);
                b5.setEnabled(false);
                b6.setEnabled(false);

                ImageView bien = (ImageView) findViewById(R.id.bien);
                if (botonCorrecto == "6"){
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



    }

    public void start(){
        TextView pregunta = (TextView) findViewById(R.id.pregunta);
        int numero = (int) (Math.random() * preguntas.length) + 1;
        botonCorrecto = respuesta[numero-1];
        pregunta.setText(preguntas[numero-1]);

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);

        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
    }
}
