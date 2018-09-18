package com.dslijcu.uscitizenshipbydsl;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class part_g extends AppCompatActivity {


    Button b1, b2, b3, b4, b5;
    TextView Pregunta, Resultado, Score;
    public int pagina = 0;

    public int p = 0;
    public int rw = 0;
    boolean llave1 = true;


    TTSManager ttsManager = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_g);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        this.setTitle("G: Geografy:  Question 88/95");

        Pregunta = (TextView) findViewById(R.id.GPreg1);
        Resultado = (TextView) findViewById(R.id.idResultado);
        Score = (TextView) findViewById(R.id.idScore);

        b1 = (Button) findViewById(R.id.btnGR1);
        b2 = (Button) findViewById(R.id.btnGR2);
        b3 = (Button) findViewById(R.id.btnGR3);
        b4 = (Button) findViewById(R.id.btnGR4);
        b5 = (Button) findViewById(R.id.btnGR5);


        ttsManager = new TTSManager();
        ttsManager.init(this);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Set up the English language", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();



                String text = "";

                switch (pagina) {
                    case 0:
                        text = "Name one of the two longest rivers in the United States.";
                        break;
                    case 1:
                        text = "What ocean is on the West Coast of the United States? ";
                        break;
                    case 2:
                        text = "What ocean is on the East Coast of the United States? ?";
                        break;
                    case 3:
                        text = " Name one U.S. territory.";
                        break;
                    case 4:
                        text = "Name one state that borders Canada.";
                        break;
                    case 5:
                        text = "Name one state that borders Mexico. ";
                        break;

                    case 6:
                        text = "What is the capital of the United States?";
                        break;
                    case 7:
                        text = " Where is the Statue of Liberty?";
                        break;


                }
                ttsManager.initQueue(text);
            }
        });
    }





    @Override
    public void onBackPressed() {

        ttsManager.shutDown();
        super.onBackPressed();
    }
    @Override
    protected void onStop() {
        ttsManager.shutDown();
        super.onStop();
    }
    public void GNext(View  btnGnext) {

        llave1 = true;
        //Toast.makeText(this,"La parte C",Toast.LENGTH_LONG).show();


        b1.setTextColor(Color.WHITE);
        b2.setTextColor(Color.WHITE);
        b3.setTextColor(Color.WHITE);
        b4.setTextColor(Color.WHITE);
        Resultado.setText("Result");
        Resultado.setTextColor(Color.BLACK);


        pagina = pagina + 1;
       // Toast.makeText(this,"La parte G"+pagina,Toast.LENGTH_LONG).show();

        switch (pagina) {
            case 1:
                this.setTitle("G:  Question 89/95");
                Pregunta.setText("What ocean is on the West Coast of the United States?");
                b1.setText("Atlantic Ocean");
                b2.setText("Southern Ocean");
                b3.setText("Pacific Ocean");
                b4.setText("World Ocean");
                break;
            case 2:
                this.setTitle("G:  Question 90/95");
                Pregunta.setText(" What ocean is on the East Coast of the United States?");
                b1.setText("World Ocean");
                b2.setText("Atlantic Ocean");
                b3.setText("Southern Ocean");
                b4.setText("Pacific");
                break;
            case 3:
                this.setTitle("G:  Question 91/95");
                Pregunta.setText("Name one U.S. territory. ");
                b1.setText("Cuba");
                b2.setText("Haiti");
                b3.setText("Republica Dominicana");
                b4.setText("Puerto Rico");
                break;
            case 4:
                this.setTitle("G:  Question 92/95");
                Pregunta.setText("Name one state that borders Canada. ?");
                b1.setText("New Yourk");
                b2.setText("North Carolina");
                b3.setText("Texas");
                b4.setText("Louissina");
                break;
            case 5:
                this.setTitle("G:  Question 93/95");
                Pregunta.setText("Name one state that borders Mexico. ");
                b1.setText("Ohio");
                b2.setText("California");
                b3.setText("South Carolina");
                b4.setText("Maine");
                break;
            case 6:
                this.setTitle("G:  Question 94/95");
                Pregunta.setText(" What is the capital of the United States?");
                b1.setText("Nueva York");
                b2.setText("Los Angeles");
                b3.setText("San Francisco");
                b4.setText("Washington D.C");
                break;

            case 7:
                this.setTitle("G:  Question 94/95");
                Pregunta.setText(" Where is the Statue of Liberty?");
                b1.setText("Nuevo Mexico");
                b2.setText("San Diego");
                b3.setText("Las Vegas");
                b4.setText("New York (Harbor)");
                break;




            case 8:
                // Toast.makeText(this,"Estoy aqui y voy a llamar a la form 4",Toast.LENGTH_LONG).show();
                Intent iR = new Intent(this,frm_result_g.class);
                Bundle bundle = new Bundle();

                //  Toast.makeText(this,"El valor de los puntos es "+p,Toast.LENGTH_LONG).show();


                String pr = Integer.toString(p);
                String pw = Integer.toString(rw);
                bundle.putString("TRIGHT",pr);
                bundle.putString("TWRONG",pw);

                iR.putExtras(bundle);
                startActivity(iR);

                break;

        }


    }

    public void Boton1(View boton1) {
        switch (pagina) {
            case 0:
                TheBotton1Plus();
                break;
            case 1:
                TheBotton1Plus();
                break;
            case 2:
                TheBotton1Minus();
                break;
            case 3:
                TheBotton1Minus();
                break;
            case 4:
                TheBotton1Plus();
                break;
            case 5:
                TheBotton1Minus();
                break;
            case 6:
                TheBotton1Minus();
                break;

            case 7:
                TheBotton1Minus();
                break;





        }


    }


    public void Boton2(View boton2) {
        // Toast.makeText(this, "Este es el boton dos de la primera pregunta", Toast.LENGTH_LONG).show();
        switch (pagina) {
            case 0:
                TheBotton2Minus();
                break;
            case 1:
                TheBotton2Minus();
                break;
            case 2:
                TheBotton2Plus();
                break;
            case 3:
                TheBotton2Minus();
                break;
            case 4:
                TheBotton2Plus();
                break;
            case 5:
                TheBotton2Plus();
                break;
            case 6:
                TheBotton2Plus();
                break;
            case 7:
                TheBotton2Minus();
                break;




        }


    }

    public void Boton3(View boton3) {
        switch (pagina) {
            case 0:
                TheBotton3Minus();
                break;
            case 1:
                TheBotton3Plus();
                break;
            case 2:
                TheBotton3Minus();
                break;
            case 3:
                TheBotton3Minus();
                break;
            case 4:
                TheBotton3Minus();
                break;
            case 5:
                TheBotton3Minus();
                break;
            case 6:
                TheBotton3Minus();
                break;

            case 7:
                TheBotton3Minus();
                break;



        }


    }

    public void Boton4(View boton4) {
        switch (pagina) {
            case 0:
                TheBotton4Minus();
                break;
            case 1:
                TheBotton4Minus();
                break;
            case 2:
                TheBotton4Plus();
                break;

            case 3:
                TheBotton4Plus();
                break;
            case 4:
                TheBotton4Minus();
                break;
            case 5:
                TheBotton4Plus();
                break;
            case 6:
                TheBotton4Plus();
                break;
            case 7:
                TheBotton4Plus();
                break;



        }

    }


    public void TheBotton1Minus() {

        // b1.setBackgroundColor(Color.GREEN);
        // b1.setTextColor(Color.RED);
        b1.setText("");
        Resultado.setText("Wrong");
        Resultado.setTextColor(Color.RED);
        if (llave1) {
            rw = rw + 1;
            llave1 = false;
        }
    }

    public void TheBotton1Plus() {
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1) {
            p = p + 1;
            Score.setText("Score =" + p);
            b2.setText("");
            b3.setText("");
            b4.setText("");
            llave1 = false;

        }
    }

    public void TheBotton1PlusAll() {
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1) {
            p = p + 1;
            Score.setText("Score =" + p);

            llave1 = false;

        }
    }



    public void TheBotton2Minus() {

        // b1.setBackgroundColor(Color.GREEN);
        // b1.setTextColor(Color.RED);
        b2.setText("");
        Resultado.setText("Wrong");
        Resultado.setTextColor(Color.RED);
        if (llave1) {
            rw = rw + 1;
            llave1 = false;
        }
    }

    public void TheBotton2Plus() {
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1) {
            p = p + 1;
            Score.setText("Score =" + p);
            b1.setText("");
            b3.setText("");
            b4.setText("");
            llave1 = false;

        }
    }

    public void TheBotton2PlusAll() {
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1) {
            p = p + 1;
            Score.setText("Score =" + p);

            llave1 = false;

        }
    }


    public void TheBotton3Minus() {

        // b1.setBackgroundColor(Color.GREEN);
        // b1.setTextColor(Color.RED);
        b3.setText("");
        Resultado.setText("Wrong");
        Resultado.setTextColor(Color.RED);
        if (llave1) {
            rw = rw + 1;
            llave1 = false;
        }
    }

    public void TheBotton3Plus() {
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1) {
            p = p + 1;
            Score.setText("Score =" + p);
            b2.setText("");
            b1.setText("");
            b4.setText("");
            llave1 = false;

        }
    }

    public void TheBotton3PlusAll() {
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1) {
            p = p + 1;
            Score.setText("Score =" + p);

            llave1 = false;

        }
    }

    public void TheBotton4Minus() {

        // b1.setBackgroundColor(Color.GREEN);
        // b1.setTextColor(Color.RED);
        b4.setText("");
        Resultado.setText("Wrong");
        Resultado.setTextColor(Color.RED);
        if (llave1) {
            rw = rw + 1;
            llave1 = false;
        }
    }

    public void TheBotton4Plus() {
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1) {
            p = p + 1;
            Score.setText("Score =" + p);
            b2.setText("");
            b3.setText("");
            b1.setText("");
            llave1 = false;

        }
    }

    public void TheBotton4PlusAll() {
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1) {
            p = p + 1;
            Score.setText("Score =" + p);

            llave1 = false;

        }
    }


}
