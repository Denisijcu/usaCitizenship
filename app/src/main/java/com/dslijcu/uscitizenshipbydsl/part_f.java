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

public class part_f extends AppCompatActivity {


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
        setContentView(R.layout.activity_part_f);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        this.setTitle("F: Recent American History and Other Important Historical Information:  Question 77/87");

        Pregunta = (TextView) findViewById(R.id.FPreg1);
        Resultado = (TextView) findViewById(R.id.idResultado);
        Score = (TextView) findViewById(R.id.idScore);

        b1 = (Button) findViewById(R.id.btnFR1);
        b2 = (Button) findViewById(R.id.btnFR2);
        b3 = (Button) findViewById(R.id.btnFR3);
        b4 = (Button) findViewById(R.id.btnFR4);
        b5 = (Button) findViewById(R.id.btnFR5);


        ttsManager = new TTSManager();
        ttsManager.init(this);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();



                String text = "";

                switch (pagina) {
                    case 0:
                        text = "Name one war fought by the United States in the 1900s.";
                        break;
                    case 1:
                        text = "Who was President during World War I";
                        break;
                    case 2:
                        text = "Who was President during the Great Depression and World War II?";
                        break;
                    case 3:
                        text = "Who did the United States fight in World War II?";
                        break;
                    case 4:
                        text = "Before he was President, Einsenhower weas a general. What war was he in?";
                        break;
                    case 5:
                        text = "During the Cold War, what was the main conern of the United States?";
                        break;

                    case 6:
                        text = "What movement tried to end racial discrimination?";
                        break;
                    case 7:
                        text = "What did Martin Luther King, Jr. do?";
                        break;
                    case 8:
                        text = "What major event happened on September 11, 2001, in the United States?";
                        break;

                    case 9:
                        text = "Name one American Indian tribe in the United States";
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
    public void ENext(View btnENext) {

        llave1 = true;
        //Toast.makeText(this,"La parte C",Toast.LENGTH_LONG).show();


        b1.setTextColor(Color.WHITE);
        b2.setTextColor(Color.WHITE);
        b3.setTextColor(Color.WHITE);
        b4.setTextColor(Color.WHITE);
        Resultado.setText("Result");
        Resultado.setTextColor(Color.BLACK);


        pagina = pagina + 1;
        //Toast.makeText(this,"La parte C"+pagina,Toast.LENGTH_LONG).show();

        switch (pagina) {
            case 1:
                this.setTitle("F:  Question 79/87");
                Pregunta.setText("Who was President during World War I");
                b1.setText("George Washintong");
                b2.setText("(Franklin) Roosevelt");
                b3.setText("(Woodrow) Wilson");
                b4.setText("Salute tribe");
                break;
            case 2:
                this.setTitle("F:  Question 80/87");
                Pregunta.setText("Who was President during the Great Depression and World War II?");
                b1.setText("(Woodrow) Wilson");
                b2.setText("(Franklin) Roosevelt");
                b3.setText("Einshower");
                b4.setText("Johm McCani");
                break;
            case 3:
                this.setTitle("F:  Question 81/87");
                Pregunta.setText("Who did the United States fight in World War II");
                b1.setText("slavery");
                b2.setText("because they didn't have self-government");
                b3.setText("Fought for the land");
                b4.setText("Japan, Germany, and Italy");
                break;
            case 4:
                this.setTitle("F:  Question 82/87");
                Pregunta.setText("Before he was President, Einsenhower was a general. What war was he in?");
                b1.setText("World War II");
                b2.setText("Saved ( or preserved) the Union");
                b3.setText("Thomas Jefferson");
                b4.setText("Serve on a jury");
                break;
            case 5:
                this.setTitle("F:  Question 83/87");
                Pregunta.setText("During the Cold War, what was the main concern of the United States?");
                b1.setText("Run for federal office");
                b2.setText("Communism");
                b3.setText("July 4, 1776");
                b4.setText("Free the slaves");
                break;
            case 6:
                this.setTitle("F:  Question 84/87");
                Pregunta.setText("What movement tried to end racial discrimination?");
                b1.setText("New Mexico");
                b2.setText("Fought for civil rights");
                b3.setText("Freedom of speech");
                b4.setText("Civil rights (movement");
                break;

            case 7:
                this.setTitle("F:  Question 85/87");
                Pregunta.setText("What did Martin Luther King, Jr. do?");
                b1.setText("New Mexico");
                b2.setText("Fought for civil rights");
                b3.setText("Freedom of speech");
                b4.setText("Civil rights (movement");
                break;

            case 8:
                this.setTitle("F:  Question 86/87");
                Pregunta.setText("What major event happened on September 11, 2001, In the United States?");
                b1.setText("New Mexico");
                b2.setText("Terrorists attacked the United States");
                b3.setText("Freedom of speech");
                b4.setText("Civil rights (movement");
                break;
            case 9:
                this.setTitle("F:  Question 87/87");
                Pregunta.setText("Name one American Indian tribe in the United States");
                b1.setText("New Mexico");
                b2.setText("Fought for civil rights");
                b3.setText("Freedom of speech");
                b4.setText("Navajo");
                break;





            case 10:
                // Toast.makeText(this,"Estoy aqui y voy a llamar a la form 4",Toast.LENGTH_LONG).show();
                Intent iR = new Intent(this,frm_result_f.class);
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
            case 8:
                TheBotton1Minus();
                break;
            case 9:
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
            case 8:
                TheBotton2Plus();
                break;
            case 9:
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
            case 8:
                TheBotton3Minus();
                break;

            case 9:
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

            case 8:
                TheBotton3Minus();
                break;

            case 9:
                TheBotton3Plus();
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
