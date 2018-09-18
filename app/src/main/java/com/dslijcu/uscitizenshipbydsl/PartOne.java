package com.dslijcu.uscitizenshipbydsl;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PartOne extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    TextView Pregunta,Resultado,Score;
    public int pagina = 0;

    public int p=0;
    public int rw=0;
    boolean llave1=true;


    TTSManager ttsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_one);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        this.setTitle("Principles of American Democracy:  Question 1/100");

        Pregunta = (TextView) findViewById(R.id.Preg1);
        Resultado = (TextView) findViewById(R.id.idResultado);
        Score = (TextView) findViewById(R.id.idScore);

        b1 = (Button) findViewById(R.id.btnR1);
        b2 = (Button) findViewById(R.id.btnR2);
        b3 = (Button) findViewById(R.id.btnR3);
        b4 = (Button) findViewById(R.id.btnR4);
        b5 = (Button) findViewById(R.id.btnR5);



        ttsManager = new TTSManager();
        ttsManager.init(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text="";
                switch (pagina) {
                    case 0:

                        text = "What is the supreme law of the land?";
                        break;
                    case 1:
                        text = "What does the Constitution do?";
                        break;
                    case 2:
                        text = "What is an amendment?";
                        break;
                    case 3:
                        text = "The idea of self-government is in the first three words of the Constitution. What are these words?";
                        break;
                    case 4:
                        text = "What do we call the first ten amendments to the Constitution?";
                        break;

                    case 5:
                        text = "What is one right or freedom the first amendment?";
                        break;

                    case 6:
                        text = "How many amendments does the Constitution have?";
                        break;
                    case 7:
                        text = "What did the Declaration of Independence do?";
                        break;
                    case 8:
                        text = "What are two rights in the Declaration of Independence?";
                        break;
                    case 9:
                        text = "What is freedom of religion?";
                        break;
                    case 10:
                        text = "What is the economic system in the United States?";
                        break;
                    case 11:
                        text = "What is the rule of law";
                        break;





                }

                ttsManager.initQueue(text);
            }
        });}


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


    public void BNext(View btnNext){

        llave1=true;


        b1.setTextColor(Color.WHITE);
        b2.setTextColor(Color.WHITE);
        b3.setTextColor(Color.WHITE);
        b4.setTextColor(Color.WHITE);
        Resultado.setText("Result");
        Resultado.setTextColor(Color.BLACK);


        pagina=pagina+1;

        switch (pagina){
            case 1:
                this.setTitle("A:  Question 2/100");
                Pregunta.setText("What does the Constitution do?");

                b1.setText("Protects basic right of Americans");
                b2.setText("Announced our independence(From Great Britain)");
                b3.setText("Declared our independence (From Great Britain)");
                b4.setText("Said that the United States ins free ( From Great Britain");

                break;
            case 2:
                this.setTitle("A:  Question 3/100");
                Pregunta.setText("What is an amendment?");

                b1.setText("The Bill of Rights");
                b2.setText("A change (to the Constitution)");
                b3.setText("A addition ( to the Constitution)");
                b4.setText("B and C");

                break;


            case 3:
                this.setTitle("A:  Question 4/100");
                Pregunta.setText("The idea of self-governments is in the first three words of the Constitution. What are these words");

                b1.setText("Congress");
                b2.setText("The House of Representatives");
                b3.setText("The Senate");
                b4.setText("We the People");

                break;


            case 4:
                this.setTitle("A:  Question 5/100");
                Pregunta.setText("What do we call the first ten amendments to the Constitution?");

                b1.setText("The Bill of Rights.");
                b2.setText("Right to speech");
                b3.setText("Rigth of religion");
                b4.setText("None of the above");

                break;


            case 5:
                this.setTitle("A:  Question 6/100");
                Pregunta.setText(" What is one right or freedom from the First Amendment?");

                b1.setText("Speech");
                b2.setText("Religion");
                b3.setText("assembly");
                b4.setText("All of the above");

                break;


            case 6:
                this.setTitle("A:  Question 7/100");
                Pregunta.setText("How many amendments does the Constitutions have?");

                b1.setText("Ten (10)");
                b2.setText("Twenty-seven (27)");
                b3.setText("Nine (9)");
                b4.setText("Four Houndred thirty-five (435)");

                break;

            case 7:
                this.setTitle("A:  Question 8/100");
                Pregunta.setText("What did the Declaration of Independence do?");

                b1.setText("Life ");
                b2.setText("Liberty");
                b3.setText("Said that the United States is free (from Great Britain)");
                b4.setText("All of the above");

                break;
            case 8:
                this.setTitle("A:  Question 9/100");
                Pregunta.setText("What are two rigths in the Declaration of Independence?");

                b1.setText("Speech, religion");
                b2.setText("Assembly");
                b3.setText("Life, Liberty");
                b4.setText("Press, petition the government");

                break;

            case 9:
                this.setTitle("A:  Question 10/100");
                Pregunta.setText("What is freedom of religion?");

                b1.setText("Only practice protestant religion");
                b2.setText("You can practice any religion, or not practice a religion");
                b3.setText("You can practice only catolic religion");
                b4.setText("All of the above");

                break;

            case 10:
                this.setTitle("A:  Question 11/100");
                Pregunta.setText("What is economy system in the United States?");

                b1.setText("A.-Communism economy");
                b2.setText("B.-Capitalist economy");
                b3.setText("C.-Market economy");
                b4.setText("B and C");

                break;

            case 11:
                this.setTitle("A:  Question 12/100");
                Pregunta.setText("What is the rule of law?");

                b1.setText("Leaders must obey the law");
                b2.setText("Everyone must follow the law");
                b3.setText("No one is above the law");
                b4.setText("All of the above");

                break;


            case 12:


               // Toast.makeText(this,"El valor de los puntos es "+p,Toast.LENGTH_LONG).show();


                Intent iiR = new Intent(this, Fr.class);
                Bundle bundle = new Bundle();





                String pr = Integer.toString(p);
                String pw = Integer.toString(rw);
                bundle.putString("TRIGHT",pr);
                bundle.putString("TWRONG",pw);

                iiR.putExtras(bundle);
                startActivity(iiR);

                break;
            default:
               finish();
               break;

        }

    }

    public void Boton1(View boton1){
        switch (pagina){
            case 0:
                // b1.setBackgroundColor(Color.RED);
               // b1.setTextColor(Color.RED);
                b1.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                        rw=rw+1;
                        Score.setText("Score ="+p);
                        llave1=false;
                    }

                break;
            case 1:
                // b1.setBackgroundColor(Color.GREEN);
                b1.setTextColor(Color.WHITE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                }
                break;
            case 2:
                // b1.setBackgroundColor(Color.RED);
                b1.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1) {
                    if (b1.getText() != "") {
                        rw=rw+1;
                        Score.setText("Score =" + p);
                        b1.setText("");
                        llave1=false;
                    }
                }else b1.setText("");
                break;
            case 3:
                // b1.setBackgroundColor(Color.RED);
                b1.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1) {
                    rw=rw+1;
                    Score.setText("Score =" + p);
                    llave1=false;
                    b1.setText("");
                }else b1.setText("");
                break;
            case 4:
                // b1.setBackgroundColor(Color.GREEN);
                b1.setTextColor(Color.WHITE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    b2.setText("");
                    b3.setText("");
                    b4.setText("");
                    llave1=false;
                }
                break;

            case 5:
                // b1.setBackgroundColor(Color.GREEN);
                //b1.setTextColor(Color.GREEN);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1){
                    p=p+1;
                    Score.setText("Score ="+p);
                    b1.setTextColor(Color.WHITE);
                    llave1=false;
                }b1.setTextColor(Color.WHITE);
                break;
            case 6:
                // b1.setBackgroundColor(Color.GREEN);
                // b1.setTextColor(Color.RED);
                b1.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }


                break;
            case 7:
                // b1.setBackgroundColor(Color.GREEN);
                //b1.setTextColor(Color.RED);
                b1.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }

                break;
            case 8:
                // b1.setBackgroundColor(Color.GREEN);
                // b1.setTextColor(Color.RED);
                b1.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }
                break;
            case 9:
                // b1.setBackgroundColor(Color.GREEN);
                // b1.setTextColor(Color.RED);
                b1.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }
                break;
            case 10:
                // b1.setBackgroundColor(Color.GREEN);
                // b1.setTextColor(Color.RED);
               // b1.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                    Score.setText("Score =" + p);
                }
                break;

            case 11:
                // b1.setBackgroundColor(Color.GREEN);
                // b1.setTextColor(Color.RED);
                // b1.setText("");
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1){
                    p=p+1;
                    llave1=false;
                    Score.setText("Score =" + p);
                }
                break;

        }


    }

    public void Boton2(View boton2){
        switch (pagina){
            case 0:
                //b2.setBackgroundColor(Color.RED);
                b2.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){

                        rw=rw+1;
                        Score.setText("Score ="+p);
                        b2.setText("");
                        llave1=false;
                    }
                break;
            case 1:
                // b2.setBackgroundColor(Color.RED);
                b2.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                        rw=rw+1;
                        Score.setText("Score ="+p);
                        b2.setText("");
                        llave1=false;
                    }
                break;
            case 2:
                // b2.setBackgroundColor(Color.RED);
                b2.setTextColor(Color.WHITE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                } else b1.setText("");

                break;

            case 3:
                // b1.setBackgroundColor(Color.RED);
               // b2.setTextColor(Color.RED);
                b2.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1) {
                    rw=rw+1;
                    Score.setText("Score =" + p);
                    llave1=false;
                }
                break;

            case 4:
                // b1.setBackgroundColor(Color.RED);
                b2.setText("");
                if (llave1) {
                   // b2.setTextColor(Color.RED);
                    Resultado.setText("Wrong");
                    Resultado.setTextColor(Color.RED);
                    rw=rw+1;
                    llave1=false;
                }
                break;
            case 5:
                // b1.setBackgroundColor(Color.GREEN);
                b2.setTextColor(Color.WHITE);

                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                }

                break;

            case 6:
                // b1.setBackgroundColor(Color.GREEN);
                b2.setTextColor(Color.WHITE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1){
                    b1.setText("");
                    b3.setText("");
                    b4.setText("");
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                }else
                {
                    b1.setText("");
                    b3.setText("");
                    b4.setText("");
                }
                break;
            case 7:
                // b1.setBackgroundColor(Color.GREEN);
                // b2.setTextColor(Color.RED);
                b2.setText("");

                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }

                break;
            case 8:
                // b1.setBackgroundColor(Color.GREEN);
                //b2.setTextColor(Color.RED);
                b2.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }
                break;
            case 9:
                // b2.setBackgroundColor(Color.RED);
                b2.setTextColor(Color.WHITE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    b1.setText("");
                    b3.setText("");
                    b4.setText("");


                    llave1=false;
                }

                break;
            case 10:
                // b1.setBackgroundColor(Color.GREEN);
                // b1.setTextColor(Color.RED);
                // b1.setText("");
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1){
                    p=p+1;
                    llave1=false;
                    Score.setText("Score =" + p);

                }
                break;
            case 11:
                // b1.setBackgroundColor(Color.GREEN);
                // b1.setTextColor(Color.RED);
                // b1.setText("");
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1){
                    p=p+1;
                    llave1=false;
                    Score.setText("Score =" + p);
                }
                break;


        }

    }

    public void Boton3(View boton3){
        switch (pagina){
            case 0:
                //  b3.setBackgroundColor(Color.RED);
                b3.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1) {
                    if (b3.getText()!="") {
                        rw=rw+1;
                        Score.setText("Score ="+p);
                        b3.setText("");
                        llave1=false;
                    }}
                else b3.setText("");
                break;

            case 1:
                // b3.setBackgroundColor(Color.RED);
                b3.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    if (b3.getText()!="") {
                        rw=rw+1;
                        Score.setText("Score ="+p);
                        b3.setText("");
                        llave1=false;
                    }} else b3.setText("");
                break;
            case 2:
                // b3.setBackgroundColor(Color.RED);
                b3.setTextColor(Color.WHITE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                } b1.setText("");
                break;

            case 3:
                // b1.setBackgroundColor(Color.RED);
                b3.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    b3.setText("");
                    rw=rw+1;
                    llave1=false;
                }else b3.setText("");
                break;
            case 4:
                // b1.setBackgroundColor(Color.RED);
                if (llave1) {
                    // b3.setTextColor(Color.RED);
                    b3.setText("");
                    Resultado.setText("Wrong");
                    Resultado.setTextColor(Color.RED);
                    rw=rw+1;
                    llave1=false;
                } else b3.setText("");
                break;
            case 5:
                // b1.setBackgroundColor(Color.GREEN);
                b3.setTextColor(Color.WHITE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);

                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                }

                break;
            case 6:
                // b1.setBackgroundColor(Color.GREEN);
                //b3.setTextColor(Color.RED);
                b3.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }
                break;
            case 7:
                // b1.setBackgroundColor(Color.GREEN);
                b3.setTextColor(Color.WHITE);

                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                    b1.setText("");
                    b2.setText("");
                    b4.setText("");
                }

                break;
            case 8:
                // b1.setBackgroundColor(Color.GREEN);
                b3.setTextColor(Color.WHITE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1){
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                    b1.setText("");
                    b2.setText("");
                    b4.setText("");

                }
                break;
            case 9:
                // b1.setBackgroundColor(Color.GREEN);
                //b3.setTextColor(Color.RED);
                b3.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }
                break;
            case 10:
                // b1.setBackgroundColor(Color.GREEN);
                // b1.setTextColor(Color.RED);
                // b1.setText("");
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1){
                    p=p+1;
                    llave1=false;
                    Score.setText("Score =" + p);
                }
                break;
            case 11:
                // b1.setBackgroundColor(Color.GREEN);
                // b1.setTextColor(Color.RED);
                // b1.setText("");
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1){
                    p=p+1;
                    llave1=false;
                    Score.setText("Score =" + p);
                }
                break;



        }

    }
    public void Boton4(View boton4){
        switch (pagina){
            case 0:
                //  b4.setBackgroundColor(Color.GREEN);
                b4.setTextColor(Color.WHITE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");
                }
                break;
            case 1:
                // b4.setBackgroundColor(Color.RED);
                b4.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    if (b4.getText()!="") {
                        rw=rw+1;
                        Score.setText("Score ="+p);
                        b4.setText("");
                        llave1=false;
                    }}else b4.setText("");
                break;
            case 2:
                // b4.setBackgroundColor(Color.GREEN);
                b4.setTextColor(Color.WHITE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    b2.setTextColor(Color.WHITE);
                    b3.setTextColor(Color.WHITE);
                    b1.setText("");
                    llave1=false;
                }


                break;
            case 3:
                // b4.setBackgroundColor(Color.GREEN);
                // b4.setTextColor(Color.BLUE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1) {
                    p=p+1;

                    Score.setText("Score =" + p);
                    b4.setTextColor(Color.WHITE);

                    b1.setText("");
                    b2.setText("");
                    b3.setText("");

                }


                break;
            case 4:
                // b1.setBackgroundColor(Color.RED);
                if (llave1) {
                    b4.setText("");
                    //  b4.setTextColor(Color.RED);
                    Resultado.setText("Wrong");
                    Resultado.setTextColor(Color.RED);
                    rw=rw+1;
                    llave1 = false;
                }else b4.setText("");
                break;
            case 5:
                // b1.setBackgroundColor(Color.GREEN);
                b1.setTextColor(Color.WHITE);
                b2.setTextColor(Color.WHITE);
                b3.setTextColor(Color.WHITE);
                b4.setTextColor(Color.WHITE);

                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);

                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                }

                break;
            case 6:
                // b1.setBackgroundColor(Color.GREEN);
                //b4.setTextColor(Color.RED);
                b4.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    llave1=false;
                    rw=rw+1;
                }
                break;
            case 7:
                // b1.setBackgroundColor(Color.GREEN);
                // b4.setTextColor(Color.RED);
                b4.setText("");

                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    llave1=false;
                    rw=rw+1;
                }
                break;
            case 8:
                // b1.setBackgroundColor(Color.GREEN);
                // b4.setTextColor(Color.RED);
                b4.setText("");
                if (llave1){
                    llave1=false;
                    rw=rw+1;
                }
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                break;
            case 9:
                // b1.setBackgroundColor(Color.GREEN);
                //b3.setTextColor(Color.RED);
                b4.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    llave1=false;
                    rw=rw+1;
                }
                break;
            case 10:
                // b1.setBackgroundColor(Color.GREEN);
                // b1.setTextColor(Color.RED);
                // b1.setText("");
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1){
                    p=p+1;
                    llave1=false;
                    b1.setText("");
                    Score.setText("Score =" + p);

                }
                break;
            case 11:
                // b1.setBackgroundColor(Color.GREEN);
                // b1.setTextColor(Color.RED);
                // b1.setText("");
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1){
                    p=p+1;
                    llave1=false;
                    Score.setText("Score =" + p);
                }
                break;

        }

    }

}


