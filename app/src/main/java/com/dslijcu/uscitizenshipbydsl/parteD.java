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

public class parteD extends AppCompatActivity {

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
        setContentView(R.layout.activity_parte_d);


        this.setTitle("D: Colonial Period and Independence:  Question 58/100");

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
                        text = "What is one reason colonists came to America";
                        break;
                    case 1:
                        text = "Who lived in America before the Europeans arrived?";
                        break;
                    case 2:
                        text = "What group of people was taken to America and sold as slaves?";
                        break;
                    case 3:
                        text = "Why did the colonists fight the British?";
                        break;
                    case 4:
                        text = "Who wrote the Declaration of Independence?";
                        break;
                    case 5:
                        text = "When was  the Declaration of Independence adopted?";
                        break;

                    case 6:
                        text = "There were 13 original states. Name three?";
                        break;
                    case 7:
                        text = "What happened at the Constituional Convention?";
                        break;

                    case 8:
                        text = "When was the Constitution written?";
                        break;

                    case 9:
                        text = "The Federalist Papers supported the passage of the U.S Constitution. Name one of the writers. ?";
                        break;
                    case 10:
                        text = "What is one thing Benajamin Franklin is famous for?";
                        break;
                    case 11:
                        text = "Who is the Father of Our Country?";
                        break;

                    case 12:
                        text = "Who was the first President?";
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
                this.setTitle("D:  Question 59/100");
                Pregunta.setText("Who lived in America before the Europeans arrived?");
                b1.setText("American Indians");
                b2.setText("Eurpeans Indian");
                b3.setText("Cariben Indian");
                b4.setText("Salute tribe");
                break;
            case 2:
                this.setTitle("D:  Question 60/100");
                Pregunta.setText("What group of people was taken to America and sold as slaves?");
                b1.setText("Mexican");
                b2.setText("Chinesse");
                b3.setText("Latins");
                b4.setText("Africans");
                break;
            case 3:
                this.setTitle("D:  Question 61/100");
                Pregunta.setText("Why did he colonists fight the British?");
                b1.setText("Difference oppinions");
                b2.setText("because they didn't have self-government");
                b3.setText("Fought for the land");
                b4.setText("Fought for Treasures");
                break;
            case 4:
                this.setTitle("D:  Question 62/100");
                Pregunta.setText("Who wrote the Declaration of Independence?");
                b1.setText("Benjamin Harrison");
                b2.setText("Crover Cleveland");
                b3.setText("Thomas Jefferson");
                b4.setText("William MacKinley");
                break;
            case 5:
                this.setTitle("D:  Question 63/100");
                Pregunta.setText("When was the Declaration of Independence adopted?");
                b1.setText("Auguest 1866");
                b2.setText("May 4, 1876");
                b3.setText("July 4, 1776");
                b4.setText("Novembe 5, 1776");
                break;
            case 6:
                this.setTitle("D:  Question 64/100");
                Pregunta.setText("There were 13 original states. Name three.");
                b1.setText("New Mexico");
                b2.setText("Nevada");
                b3.setText("Arizona");
                b4.setText("New York");
                break;
            case 7:
                this.setTitle("D:  Question 65/100");
                Pregunta.setText("What happened at the Constitutional Convention?");
                b1.setText("Vote and join a political party");
                b2.setText("The Constitution was written.");
                b3.setText("Freedom of speech");
                b4.setText("Serve on a jury");
                break;
            case 8:
                this.setTitle("D:  Question 66/100");
                Pregunta.setText("When was the Constitution written?");
                b1.setText("July 4");
                b2.setText("May 15");
                b3.setText("1787");
                b4.setText("June 4");
                break;
            case 9:
                this.setTitle("D:  Question 67/100");
                Pregunta.setText("The Federalist Papers supported the passage of the U.S. Constitution. Name one of the writers.?");
                b1.setText("James Madison");
                b2.setText("Benjamin Harrison");
                b3.setText("William McKinley");
                b4.setText("Grover Cleveland");
                break;
            case 10:
                this.setTitle("D:  Question 68/100");
                Pregunta.setText("What is one thing Benjamin Franklin is famous for?");
                b1.setText("Secretary of treasures");
                b2.setText("U.S. diplomat");
                b3.setText("Senator");
                b4.setText("Lawyer");
                break;


            case 11:
                this.setTitle("D:  Question 69/100");
                Pregunta.setText("Who is the Father of Our Country?");
                b1.setText("James Madison");
                b2.setText("Benjamin Harrison");
                b3.setText("George Washington");
                b4.setText("John Adams");
                break;

            case 12:
                this.setTitle("D:  Question 70/100");
                Pregunta.setText("Who was the first President?");
                b1.setText("James Madison");
                b2.setText("Franklin Rosevelt");
                b3.setText("John Adams");
                b4.setText("George Washington");
                break;
            case 13:
               // Toast.makeText(this,"Estoy aqui y voy a llamar a la form 4",Toast.LENGTH_LONG).show();
               Intent iR = new Intent(this,FrmResulD.class);
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
                TheBotton1Plus();
                break;
            case 2:
                TheBotton1Minus();
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
                TheBotton1Minus();
                break;
            case 8:
                TheBotton1Minus();
                break;
            case 9:
                TheBotton1Plus();
                break;
            case 10:
                TheBotton1Minus();
                break;
            case 11:
                TheBotton1Minus();
                break;
            case 12:
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
                TheBotton2Minus();
                break;
            case 7:
                TheBotton2Plus();
                break;
            case 8:
                TheBotton2Minus();
                break;
            case 9:
                TheBotton2Minus();
                break;
            case 10:
                TheBotton2Plus();
                break;
            case 11:
                TheBotton2Minus();
                break;
            case 12:
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
                TheBotton3Plus();
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
            case 10:
                TheBotton3Plus();
                break;

            case 11:
                TheBotton3Plus();
                break;
            case 12:
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
                TheBotton4Minus();
                break;
            case 4:
                TheBotton4Minus();
                break;
            case 5:
                TheBotton4Minus();
                break;
            case 6:
                TheBotton4Plus();
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
            case 10:
                TheBotton4Minus();
                break;
            case 11:
                TheBotton4Minus();
                break;
            case 12:
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
