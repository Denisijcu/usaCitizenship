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

public class ParteC extends AppCompatActivity {
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
        setContentView(R.layout.activity_parte_c);

        this.setTitle("C: Rights and Responsabilities:  Question 48/100");

        Pregunta = (TextView) findViewById(R.id.CPreg1);
        Resultado = (TextView) findViewById(R.id.idResultado);
        Score = (TextView) findViewById(R.id.idScore);

        b1 = (Button) findViewById(R.id.btnCR1);
        b2 = (Button) findViewById(R.id.btnCR2);
        b3 = (Button) findViewById(R.id.btnCR3);
        b4 = (Button) findViewById(R.id.btnCR4);
        b5 = (Button) findViewById(R.id.btnCR5);


        ttsManager = new TTSManager();
        ttsManager.init(this);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "";

                switch (pagina) {
                    case 0:
                        text = "There are four amendments to the Constitution about who can vote. Describe one of them";
                        break;
                    case 1:
                        text = "What is one responsability that is only for United States citizens?";
                        break;
                    case 2:
                        text = "Name one right only for United States citizens";
                        break;
                    case 3:
                        text = "What are two rights of everyone living in the United States?";
                        break;
                    case 4:
                        text = "What do we show loyalty to when we say the Pledge of Allegiance?";
                        break;

                    case 5:
                        text = "What is one promise you make when you become a United States Citizen?";
                        break;

                    case 6:
                        text = "How old do citizens have to be to vote for President?";
                        break;

                    case 7:
                        text = "What are two ways that Americans can participate in their democracy?";
                        break;
                    case 8:
                        text = "When is the last day you can send in federal income tax forms?";
                        break;
                    case 9:
                        text = "When must all men register for the Selective Service?";
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

    public void CNext(View btnCNext) {

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
                this.setTitle("C:  Question 49/100");
                Pregunta.setText("What is one responsability that is only for United States citizens?");
                b1.setText("The people");
                b2.setText("Checks and Balances");
                b3.setText("Freedom of speech");
                b4.setText("Serve on a jury");
                break;
            case 2:
                this.setTitle("C:  Question 50/100");
                Pregunta.setText("Name one right only for United States Citizens");
                b1.setText("Run for federal office");
                b2.setText("Checks and Balances");
                b3.setText("Freedom of speech");
                b4.setText("Serve on a jury");
                break;
            case 3:
                this.setTitle("C:  Question 51/100");
                Pregunta.setText("What are two rights of everyone living in United States?");
                b1.setText("Run for federal office");
                b2.setText("Freedom of speech and freedom of worship");
                b3.setText("Freedom of speech");
                b4.setText("Serve on a jury");
                break;
            case 4:
                this.setTitle("C:  Question 52/100");
                Pregunta.setText("What do we show loyalty to when we say the pledge of Allegiance?");
                b1.setText("Run for federal office");
                b2.setText("Checks and Balances");
                b3.setText("The flag");
                b4.setText("Serve on a jury");
                break;
            case 5:
                this.setTitle("C:  Question 53/100");
                Pregunta.setText("What is one promise you make when you become a United States citizen?");
                b1.setText("Run for federal office");
                b2.setText("Checks and Balances");
                b3.setText("Freedom of speech");
                b4.setText("give up loyalty to other countries");
                break;
            case 6:
                this.setTitle("C:  Question 54/100");
                Pregunta.setText("How old do citizens have to be to vote for President?");
                b1.setText("Run for federal office");
                b2.setText("Eighteen (18) and older");
                b3.setText("Freedom of speech");
                b4.setText("Serve on a jury");
                break;
            case 7:
                this.setTitle("C:  Question 55/100");
                Pregunta.setText("What are two ways that American can participate in their democracy?");
                b1.setText("Vote and join a political party");
                b2.setText("Checks and Balances");
                b3.setText("Freedom of speech");
                b4.setText("Serve on a jury");
                break;
            case 8:
                this.setTitle("C:  Question 56/100");
                Pregunta.setText("When is the last day you can send in federal income tax forms?");
                b1.setText("July 4");
                b2.setText("May 15");
                b3.setText("April 15");
                b4.setText("June 4");
                break;
            case 9:
                this.setTitle("C:  Question 57/100");
                Pregunta.setText("When must all men register for the Selective Service?");
                b1.setText("between eighteen (18) and Twenty-six (26)");
                b2.setText("19");
                b3.setText("36");
                b4.setText("17");
                break;
            case 10:

            Intent iR = new Intent(this,frm3.class);
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
                TheBotton1Minus();
                break;
            case 1:
                TheBotton1Minus();
                break;
            case 2:
                TheBotton1Plus();
                break;
            case 3:
                TheBotton1Minus();
                break;
            case 4:
                TheBotton1Minus();
                break;
            case 5:
                TheBotton1Minus();
                break;
            case 6:
                TheBotton1Minus();
                break;
            case 7:
                TheBotton1Plus();
                break;
            case 8:
                TheBotton1Minus();
                break;
            case 9:
                TheBotton1Plus();
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
                TheBotton2Minus();
                break;
            case 3:
                TheBotton2Plus();
                break;
            case 4:
                TheBotton2Minus();
                break;
            case 5:
                TheBotton2Minus();
                break;
            case 6:
                TheBotton2Plus();
                break;
            case 7:
                TheBotton2Minus();
                break;
            case 8:
                TheBotton2Minus();
                break;
            case 9:
                TheBotton2Minus();
                break;






        }


    }

    public void Boton3(View boton3) {
        switch (pagina) {
            case 0:
               TheBotton3Plus();
                break;
            case 1:
                TheBotton3Minus();
                break;
            case 2:
                TheBotton3Minus();
                break;
            case 3:
                TheBotton3Minus();
                break;
            case 4:
                TheBotton3Plus();
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
                TheBotton3Plus();
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
                TheBotton4Plus();
                break;
            case 2:
                TheBotton4Minus();
                break;

            case 3:
                TheBotton4Minus();
                break;
            case 4:
                TheBotton4Minus();
                break;
            case 5:
                TheBotton4Plus();
                break;
            case 6:
                TheBotton4Minus();
                break;
            case 7:
                TheBotton4Minus();
                break;
            case 8:
                TheBotton4Minus();
                break;
            case 9:
                TheBotton4Minus();
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