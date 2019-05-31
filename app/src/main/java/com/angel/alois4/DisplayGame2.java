package com.angel.alois4;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DisplayGame2 extends Activity {
    int n1;
    int n2;
    int n3;
    int n4;
    int n5;
    int c1,c2,c3,c4,c5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_game2);
        start();

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        Button b7 = (Button) findViewById(R.id.button7);
        Button b8 = (Button) findViewById(R.id.button8);
        Button b9 = (Button) findViewById(R.id.button9);
        Button b10 = (Button) findViewById(R.id.button10);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button b1 = (Button) findViewById(R.id.button1);
                Button b6 = (Button) findViewById(R.id.button6);
                b1.setEnabled(false);
                b6.setEnabled(false);
                if (n1 == 1){
                    b1.setBackgroundColor(0xFF1B6D33);
                } else{
                    b1.setBackgroundColor(Color.RED);
                }
                end();
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button b2 = (Button) findViewById(R.id.button2);
                Button b7 = (Button) findViewById(R.id.button7);
                b2.setEnabled(false);
                b7.setEnabled(false);
                if (n2 == 1){
                    b2.setBackgroundColor(0xFF1B6D33);
                } else{
                    b2.setBackgroundColor(Color.RED);
                }
                end();
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button b3 = (Button) findViewById(R.id.button3);
                Button b8 = (Button) findViewById(R.id.button8);
                b3.setEnabled(false);
                b8.setEnabled(false);
                if (n3 == 1){
                    b3.setBackgroundColor(0xFF1B6D33);
                } else{
                    b3.setBackgroundColor(Color.RED);
                }
                end();
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button b4 = (Button) findViewById(R.id.button4);
                Button b9 = (Button) findViewById(R.id.button9);
                b4.setEnabled(false);
                b9.setEnabled(false);
                if (n4 == 1){
                    b4.setBackgroundColor(0xFF1B6D33);
                } else{
                    b4.setBackgroundColor(Color.RED);
                }
                end();
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button b5 = (Button) findViewById(R.id.button5);
                Button b10 = (Button) findViewById(R.id.button10);
                b5.setEnabled(false);
                b10.setEnabled(false);
                if (n5 == 1){
                    b5.setBackgroundColor(0xFF1B6D33);
                } else{
                    b5.setBackgroundColor(Color.RED);
                }
                end();
            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button b1 = (Button) findViewById(R.id.button1);
                Button b6 = (Button) findViewById(R.id.button6);
                b1.setEnabled(false);
                b6.setEnabled(false);
                if (n1 == 1){
                    b6.setBackgroundColor(Color.RED);
                } else{
                    b6.setBackgroundColor(0xFF1B6D33);
                }
                end();
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button b2 = (Button) findViewById(R.id.button2);
                Button b7 = (Button) findViewById(R.id.button7);
                b2.setEnabled(false);
                b7.setEnabled(false);
                if (n2 == 1){
                    b7.setBackgroundColor(Color.RED);
                } else{
                    b7.setBackgroundColor(0xFF1B6D33);
                }
                end();
            }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button b3 = (Button) findViewById(R.id.button3);
                Button b8 = (Button) findViewById(R.id.button8);
                b3.setEnabled(false);
                b8.setEnabled(false);
                if (n3 == 1){
                    b8.setBackgroundColor(Color.RED);
                } else{
                    b8.setBackgroundColor(0xFF1B6D33);
                }
                end();
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button b4 = (Button) findViewById(R.id.button4);
                Button b9 = (Button) findViewById(R.id.button9);
                b4.setEnabled(false);
                b9.setEnabled(false);
                if (n4 == 1){
                    b9.setBackgroundColor(Color.RED);
                } else{
                    b9.setBackgroundColor(0xFF1B6D33);
                }
                end();
            }
        });

        b10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Button b5 = (Button) findViewById(R.id.button5);
                Button b10 = (Button) findViewById(R.id.button10);
                b5.setEnabled(false);
                b10.setEnabled(false);
                if (n5 == 1){
                    b5.setBackgroundColor(Color.RED);
                } else{
                    b10.setBackgroundColor(0xFF1B6D33);
                }
                end();
            }
        });
    }

    public void start(){

        ImageView img1 = (ImageView) findViewById(R.id.imageView8);
        ImageView img2 = (ImageView) findViewById(R.id.imageView9);
        ImageView img3 = (ImageView) findViewById(R.id.imageView10);
        ImageView img4 = (ImageView) findViewById(R.id.imageView11);
        ImageView img5 = (ImageView) findViewById(R.id.imageView12);

        n1 = (int) (Math.random() * 2) +1;
        n2 = (int) (Math.random() * 2) +1;
        n3 = (int) (Math.random() * 2) +1;
        n4 = (int) (Math.random() * 2) +1;
        n5 = (int) (Math.random() * 2) +1;

        if (n1 == 1){
            img1.setImageResource(R.drawable.corazon);
        } else{
            img1.setImageResource(R.drawable.trebol);
        }

        if (n2 == 1){
            img2.setImageResource(R.drawable.corazon);
        } else{
            img2.setImageResource(R.drawable.trebol);
        }

        if (n3 == 1){
            img3.setImageResource(R.drawable.corazon);
        } else{
            img3.setImageResource(R.drawable.trebol);
        }

        if (n4 == 1){
            img4.setImageResource(R.drawable.corazon);
        } else{
            img4.setImageResource(R.drawable.trebol);
        }

        if (n5 == 1){
            img5.setImageResource(R.drawable.corazon);
        } else{
            img5.setImageResource(R.drawable.trebol);
        }



    }

    public void end(){
        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        Button b7 = (Button) findViewById(R.id.button7);
        Button b8 = (Button) findViewById(R.id.button8);
        Button b9 = (Button) findViewById(R.id.button9);
        Button b10 = (Button) findViewById(R.id.button10);

        if (!b5.isEnabled() && !b1.isEnabled() && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled()){
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            b10.setEnabled(true);

            b1.setBackgroundColor(0x00000000);
            b2.setBackgroundColor(0x00000000);
            b3.setBackgroundColor(0x00000000);
            b4.setBackgroundColor(0x00000000);
            b5.setBackgroundColor(0x00000000);
            b6.setBackgroundColor(0x00000000);
            b7.setBackgroundColor(0x00000000);
            b8.setBackgroundColor(0x00000000);
            b9.setBackgroundColor(0x00000000);
            b10.setBackgroundColor(0x00000000);
            start();
        }
    }
}
