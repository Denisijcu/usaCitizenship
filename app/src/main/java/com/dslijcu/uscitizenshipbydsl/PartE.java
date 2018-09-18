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

public class PartE extends AppCompatActivity {

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
        setContentView(R.layout.activity_part_e);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        this.setTitle("E: 1800's:  Question 71/77");

        Pregunta = (TextView) findViewById(R.id.EPreg1);
        Resultado = (TextView) findViewById(R.id.idResultado);
        Score = (TextView) findViewById(R.id.idScore);

        b1 = (Button) findViewById(R.id.btnER1);
        b2 = (Button) findViewById(R.id.btnER2);
        b3 = (Button) findViewById(R.id.btnER3);
        b4 = (Button) findViewById(R.id.btnER4);
        b5 = (Button) findViewById(R.id.btnER5);


        ttsManager = new TTSManager();
        ttsManager.init(this);








        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "";

                switch (pagina) {
                    case 0:
                        text = "What territory did the United States buy from France in 1803?";
                        break;
                    case 1:
                        text = "Name on war fought by the United States in the 1800s";
                        break;
                    case 2:
                        text = "Name the US war between the North and South";
                        break;
                    case 3:
                        text = "Name one problem that led to the Civil War.";
                        break;
                    case 4:
                        text = "What was one important thing that Abraham Lincoln did?";
                        break;
                    case 5:
                        text = "What did the Emancipation Proclamation do?";
                        break;

                    case 6:
                        text = "What did Susan B. Anthony do?";
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
                this.setTitle("E:  Question 72/77");
                Pregunta.setText("Name one war fought by the United States in the 1800s");
                b1.setText("American Indians");
                b2.setText("Spanish - American War");
                b3.setText("Cariben Indian");
                b4.setText("Salute tribe");
                break;
            case 2:
                this.setTitle("E:  Question 73/77");
                Pregunta.setText("Name the U.S war between  the North and the South.");
                b1.setText("the Mexican War");
                b2.setText("Latin-American War");
                b3.setText("the Cold War");
                b4.setText("the Civil War");
                break;
            case 3:
                this.setTitle("E:  Question 74/77");
                Pregunta.setText("Name one problem that led the Civil War");
                b1.setText("slavery");
                b2.setText("because they didn't have self-government");
                b3.setText("racism");
                b4.setText("Fought for Treasures");
                break;
            case 4:
                this.setTitle("E:  Question 75/77");
                Pregunta.setText("What was one important thing that Abraham Lincoln did?");
                b1.setText("fought for his family");
                b2.setText("Saved ( or preserved) the Union");
                b3.setText("write the Constitution");
                b4.setText("was a good president");
                break;
            case 5:
                this.setTitle("E:  Question 76/77");
                Pregunta.setText("What did the Emancipation Proclamation do?");
                b1.setText("build federal offices");
                b2.setText("Checks and Balances");
                b3.setText("wrote the Constitution.");
                b4.setText("Free the slaves");
                break;
            case 6:
                this.setTitle("E:  Question 77/77");
                Pregunta.setText("What did Susan B Anthony do?");
                b1.setText("Fought for her family");
                b2.setText("Fought for civil rights");
                b3.setText("Fought for mexican people rights");
                b4.setText("Born in New York");
                break;

            case 7:
                // Toast.makeText(this,"Estoy aqui y voy a llamar a la form 4",Toast.LENGTH_LONG).show();
                Intent iR = new Intent(this,FrmRusultE.class);
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
                TheBotton1Minus();
                break;
            case 3:
                TheBotton1Plus();
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







        }


    }


    public void Boton2(View boton2) {
        // Toast.makeText(this, "Este es el boton dos de la primera pregunta", Toast.LENGTH_LONG).show();
        switch (pagina) {
            case 0:
                TheBotton2Minus();
                break;
            case 1:
                TheBotton2Plus();
                break;
            case 2:
                TheBotton2Minus();
                break;
            case 3:
                TheBotton2Minus();
                break;
            case 4:
                TheBotton2Plus();
                break;
            case 5:
                TheBotton2Minus();
                break;
            case 6:
                TheBotton2Plus();
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
                TheBotton3Minus();
                break;
            case 5:
                TheBotton3Minus();
                break;
            case 6:
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
                TheBotton4Plus();
                break;
            case 6:
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