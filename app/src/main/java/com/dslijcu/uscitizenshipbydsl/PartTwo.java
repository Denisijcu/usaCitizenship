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

public class PartTwo extends AppCompatActivity {

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
        setContentView(R.layout.activity_part_two);
        this.setTitle("System of Government:  Question 13/100");

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


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text="";
                switch (pagina) {
                    case 0:
                        text = "Name one branch or part of the government.";
                        break;
                    case 1:
                        text = "What ;stops one branch of government from becoming too powerful?";
                        break;
                    case 2:
                        text = "Who is in charge of the executive branch?";
                        break;
                    case 3:
                        text = "Who makes federal laws?";
                        break;
                    case 4:
                        text = "What are the two parts of the U.S. Congress?";
                        break;

                    case 5:
                        text = "How many U.S. Senators are there?";
                        break;

                    case 6:
                        text = "We elect a U.S. Senator for how many years?";
                        break;

                    case 7:
                        text = "The House of Representatives has how many voting members?";
                        break;
                    case 8:
                        text = "We elect a U.S Representative for how many years?";
                        break;
                    case 9:
                        text = "Who doess a U.S Senators represent?";
                        break;
                    case 10:
                        text = "Why do some states have more Representatives than other states?";
                        break;
                    case 11:
                        text = "We elect a President for how many years?";
                        break;
                    case 12:
                        text = "In What month do we vote for President?";
                        break;
                    case 13:
                        text = "What is the name of the President of the United States now?";
                        break;
                    case 14:
                        text = "What is the name of the Vice President of the United States now?";
                        break;
                    case 15:
                        text = "If the President can no longer serve, who becomes President?";
                        break;
                    case 16:
                        text = "If both the President and the Vice President can no longer serve, who becomes President?";
                        break;

                    case 17:
                        text = "Who is the Commander in Chief of the military?";
                        break;
                    case 18:
                        text = "Who signs bills to become laws?";
                        break;
                    case 19:
                        text = "Who vetoes bills?";
                        break;
                    case 20:
                        text = "What does the President's Cabinet do?";
                        break;
                    case 21:
                        text = "What are two Cabinet-level position?";
                        break;
                    case 22:
                        text = "What does the Judicial branch do?";
                        break;
                    case 23:
                        text = "What is the highest court in the United Sates?";
                        break;
                    case 24:
                        text = "How many justices are on the Supreme Court?";
                        break;
                    case 25:
                        text = "Who is the Chief Justice of the United States now?";
                        break;
                    case 26:
                        text = "Under our Constitution, some powers belong to the federal government. What is one power of the federal governmen?";
                        break;
                    case 27:
                        text = "Under our Constitution, some powers belong to the states. What is one power of the states?";
                        break;
                    case 28:
                        text = "Who is the Government of your state now?";
                        break;
                    case 29:
                        text = "What is the capital of your state?";
                        break;
                    case 30:
                        text = "What are the two major political parties in the United States?";
                        break;
                    case 31:
                        text = "What is the political party of the President now?";
                        break;
                    case 32:
                        text = "What is the name of the Speaker of the House of Representatives now?";
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
                this.setTitle("B:  Question 14/100");

                Pregunta.setText("What stops one branch of government from becoming too powerful?");

                b1.setText("The people");
                b2.setText("Checks and Balances");
                b3.setText("Freedom of speech");
                b4.setText("The president");

                break;
            case 2:
                this.setTitle("B:  Question 15/100");
                Pregunta.setText("Who is in charge of the executive branch?");

                b1.setText("The Chief Justice");
                b2.setText("The Speaker of the House");
                b3.setText("The president");
                b4.setText("The Prime Minister");

                break;


            case 3:
                this.setTitle("B:  Question 16/100");
                Pregunta.setText("Who makes federal laws?");

                b1.setText("the President");
                b2.setText("the state");
                b3.setText("Congress");
              //  b4.setText("because of the state's population");
                b4.setText("the Supreme Court");

                break;


            case 4:
                this.setTitle("B:  Question 17/100");
                Pregunta.setText("What are the two parts of the U.S. Congress?");

                b1.setText("the Senate and House (of Representatives");
                b2.setText("the House of Lords and the House of Commons");
                b3.setText("the Senate and the Courts");
                b4.setText("the House of Representatives and the courts");

                break;


            case 5:
                this.setTitle("B:  Question 18/100");
                Pregunta.setText("How many U.S Senators are there?");

                b1.setText("Two hundred (200)");
                b2.setText("One hundred (100)");
                b3.setText("fifty (50)");
                b4.setText("Nine (9)");

                break;


            case 6:
                this.setTitle("B:  Question 19/100");
                Pregunta.setText("We elect a U.S. Senator for how many years?");

                b1.setText("Two (2)");
                b2.setText("six (6)");
                b3.setText("Four (4)");
                b4.setText("Three (3)");

                break;

            case 7:
                this.setTitle("B:  Question 21/100");
                Pregunta.setText("The House of Representatives has how many voting members?");

                b1.setText("One hundred (100)");
                b2.setText("Two hundred (200)");
                b3.setText("Four hundred thirty-five (435)");
             //   b3.setText("All people of the state");
                b4.setText("Four hundred forty-one (441)");

                break;
            case 8:
                this.setTitle("B:  Question 22/100");
                Pregunta.setText("We elect a U.S. Representative for how many years?");

                b1.setText("six (6)");
                b2.setText("four (4)");
                b3.setText("three (3)");
                b4.setText("Two (2)");

                break;

            case 9:
                this.setTitle("B:  Question 24/100");
                Pregunta.setText("Who does a U.S. Senator represent?");

                b1.setText("The state legislatures");
                b2.setText("All people of the state");
                b3.setText("All people of the state who belong to the Senator's political party");
                b4.setText("Only the people in the state who voted for the Senator");

                break;
            case 10:
                this.setTitle("B:  Question 25/100");
                Pregunta.setText("Why do some states have more Representatives than other states?");

                b1.setText("Because of the state's location");
                b2.setText("Because of the state's population");
                b3.setText("Because the state's Representatives have seniority in the House of Representatives");
                b4.setText("Because of the geographical size of the state");

                break;
            case 11:
                this.setTitle("B:  Question 26/100");
                Pregunta.setText("We elect a President for how many years?");

                b1.setText("Six (6)");
                b2.setText("Four (4)");
                b3.setText("Eight (8)");
                b4.setText("Ten (10");

                break;
            case 12:
                this.setTitle("B:  Question 27/100");
                Pregunta.setText("In what month do we vote for President?");

                b1.setText("July");
                b2.setText("March");
                b3.setText("November");
                b4.setText("June");

                break;
            case 13:
                this.setTitle("B:  Question 28/100");
                Pregunta.setText("What is the name of the President of the United States now?");

                b1.setText("Barack Obama");
                b2.setText("Hillary Clinton");
                b3.setText("Ted Cruz");
                b4.setText("Donald Trump");

                break;

            case 14:
                this.setTitle("B:  Question 29/100");
                Pregunta.setText("What is the name of the Vice President of the United States now?");

                b1.setText("John Benher");
                b2.setText("Mike Pence");
                b3.setText("John G. Roberts Jr.");
                b4.setText("Paul Ryan");

                break;
            case 15:
                this.setTitle("B:  Question 30/100");
                Pregunta.setText("If the President can no longer serve, who becomes President?");

                b1.setText("the Vice President");
                b2.setText("the Speaker of the House");
                b3.setText("the President Pro Tempore");
                b4.setText("the Secretary of State");

                break;
            case 16:
                this.setTitle("B:  Question 31/100");
                Pregunta.setText("If both the President and the Vice President can no longer serve, who becomes President?");

                b1.setText("The President Pro Temporal");
                b2.setText("The Speaker of the House");
                b3.setText("The secretary of State");
                b4.setText("The secretary of the Treasury");

                break;
            case 17:
                this.setTitle("B:  Question 32/100");
                Pregunta.setText("Who is the Commander in Chief of the Military?");

                b1.setText("the Attorney General");
                b2.setText("the Vice President");
                b3.setText("the secretary of Defense");
                b4.setText("the President");

                break;
            case 18:
                this.setTitle("B:  Question 33/100");
                Pregunta.setText("Who signs bills to become laws?");

                b1.setText("The Secratary of the State");
                b2.setText("The Chief Justice of the Supreme Court");
                b3.setText("The Vice President");
                b4.setText("The President");

                break;
            case 19:
                this.setTitle("B:  Question 34/100");
                Pregunta.setText("Who vetoes bills?");

                b1.setText("the President Pro Tempore");
                b2.setText("the Vice President");
                b3.setText("the President");
                b4.setText("the Speaker of the House");

                break;

            case 20:
                this.setTitle("B:  Question 35/100");
                Pregunta.setText("What does the President's Cabinet do?");

                b1.setText("Commands the U.S. Armed Forces");
                b2.setText("Advices the President the President");
                b3.setText("All of these answers");
                b4.setText("Makes laws");

                break;
            case 21:
                this.setTitle("B:  Question 36/100");
                Pregunta.setText("What are two Cabinet-level positions?");

                b1.setText("Secretary of Health and Human Services and Secretary of Navy");
                b2.setText("Secratary of the Interior and Secretary of History");
                b3.setText("Secretary of Homeland Security and Secretary of the Treasury");
                b4.setText("Secretary of Weather and Secretary of Energy");

                break;
            case 22:
                this.setTitle("B:  Question 37/100");
                Pregunta.setText("What does the judicial branch do?");

                b1.setText("Resolves disputes");
                b2.setText("All of these answers");
                b3.setText("Resolves disputes (disagreements)");
                b4.setText("Decides if a law goes against the Constitution");

                break;
            case 23:
                this.setTitle("B:  Question 38/100");
                Pregunta.setText("What is the highest court in the United States?");

                b1.setText("The Federal Court");
                b2.setText("The Supreme Ccourt");
                b3.setText("The Court of Appeals");
                b4.setText("The District Court");

                break;
            case 24:
                this.setTitle("B:  Question 39/100");
                Pregunta.setText("How many justices are on the Supreme Court?");

                b1.setText("Nine (9)");
                b2.setText("Twenty-seven (27)");
                b3.setText("Seven (7)");
                b4.setText("Ninty nine  (99)");

                break;
            case 25:
                this.setTitle("B:  Question 40/100");
                Pregunta.setText("Who is the Chief Justice of the United States now?");

                b1.setText("John Roberts ( John G. Roberts, Jr.");
                b2.setText("Joe Biden");
                b3.setText("John Behner");
                b4.setText("Franklin Roosvelt");

                break;
            case 26:
                this.setTitle("B:  Question 41/100");
                Pregunta.setText("Under our Constitution, some powers belong to the federal government. What is one power of the federal government?");

                b1.setText("To provide schooling");
                b2.setText("To provide police departments");
                b3.setText("To make treaties");
                b4.setText("to issues driver's licenses");

                break;
            case 27:
                this.setTitle("B:  Question 42/100");
                Pregunta.setText("Under our Constitution, some powers belong to the states. What is one power of the states?");

                b1.setText("Make treaties");
                b2.setText("Coin or print money");
                b3.setText("Provide schooling and education");
                b4.setText("Create an army");
                break;

            case 28:
                this.setTitle("B:  Question 45/100");
                Pregunta.setText("What are the two major political parties in the United States?");

                b1.setText("Green Party");
                b2.setText("Independent Party");
                b3.setText("Democratic and Republican");
                b4.setText("Worker Party");
                break;
            case 29:
                this.setTitle("B:  Question 46/100");
                Pregunta.setText("What is the political party of the President now?");

                b1.setText("Green Party");
                b2.setText("Republican Party");
                b3.setText("Democratic Party");
                b4.setText("Independent Party");
                break;
            case 30:
                this.setTitle("B:  Question 47/100");
                Pregunta.setText("What is the name of the Speaker of the House of Representatives now?");

                b1.setText("Paul Ryan");
                b2.setText("Hillary Clinton");
                b3.setText("John Boehner");
                b4.setText("Joe Biden");
                break;


            case 31:


                Intent iR = new Intent(this,fr2.class);
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
                TheBottonOnePlus();
                break;
            case 2:
                // b1.setBackgroundColor(Color.RED);
               // b1.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                b1.setText("");
                if (llave1) {
                        rw=rw+1;
                        Score.setText("Score =" + p);
                        llave1=false;
                    }
                break;

            case 3:

                // b1.setBackgroundColor(Color.RED);
               // b1.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                b1.setText("");
                if (llave1) {
                    rw=rw+1;
                    Score.setText("Score =" + p);
                    llave1=false;
                   // b1.setText("");
                }
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
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                b1.setText("");
                if (llave1){
                    rw=rw+1;
                    Score.setText("Score ="+p);
                    llave1=false;
                }
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
                b1.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }
                break;

            case 10:
                /*
                b1.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }
                */
                TheBottoOne();
                break;
            case 11:
                TheBottoOne();
                break;
            case 12:
                TheBottoOne();
                break;
            case 13:
                TheBottoOne();
                break;
            case 14:
                TheBottoOne();
                break;
            case 15:
                TheBottonOnePlus();
                break;
            case 16:
               TheBottoOne();
                break;
            case 17:
                TheBottoOne();
                break;
            case 18:
                TheBottoOne();
                break;
            case 19:
                TheBottoOne();
                break;
            case 20:
                TheBottoOne();
                break;
            case 21:
                TheBottoOne();
                break;
            case 22:
                TheBottonOnePlusAll();
                break;
            case 23:
                TheBottoOne();
                break;
            case 24:
                TheBottonOnePlus();
                break;
            case 25:
                TheBottonOnePlus();
                break;
            case 26:
               TheBottoOne();
                break;
            case 27:
               TheBottoOne();
                break;
            case 28:
                TheBottoOne();
                break;

            case 29:
                TheBottoOne();
                break;
            case 30:
                TheBottonOnePlus();
                break;
            case 31:
                TheBottoOne();
                break;
            case 32:
                TheBottonOnePlus();
                break;
        }


    }

    public void Boton2(View boton2){
        switch (pagina){
            case 0:
                TheBottoTwo();
                /*
                b2.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                b2.setText("");
                if (llave1) {
                    rw = rw + 1;
                    Score.setText("Score =" + p);
                    llave1 = false;
                }
                */
                break;
            case 1:
                TheBottonTwoPlus();
              /*
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1){
                  p=p+1;
                        Score.setText("Score ="+p);
                        b1.setText("");
                        b3.setText("");
                        b4.setText("");
                        llave1=false;

                    }
                    */
                break;
            case 2:
                TheBottoTwo();
              /*
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.GREEN);
                b2.setText("");
                if (llave1) {
                    //p = p + 1;
                    rw=rw+1;
                     Score.setText("Score =" + p);
                    llave1=false;
                }
                */
                break;

            case 3:
                TheBottoTwo();
              /*
                b2.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                b2.setText("");

                if (llave1) {
                    rw=rw+1;
                    Score.setText("Score =" + p);
                    llave1=false;
                }
                */
                break;

            case 4:
                TheBottoTwo();
                /*
                    Resultado.setText("Wrong");
                    Resultado.setTextColor(Color.RED);
                    b2.setText("");
                    if (llave1) {
                       rw=rw+1;
                       b2.setText("");
                       llave1=false;
                    }
                    */
                    break;
            case 5:
                TheBottonTwoPlus();
               /*
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                    b1.setText("");
                    b3.setText("");
                    b4.setText("");
                }
                */
                break;

            case 6:
                TheBottonTwoPlus();
              /*
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);

                if (llave1){
                    p=p+1;
                    Score.setText("Score =" + p);
                    llave1=false;
                    b1.setText("");
                    b3.setText("");
                    b4.setText("");
                                 }
                                 */
                break;
            case 7:
                TheBottoTwo();
             /*
                b2.setText("");

                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }
               */
                break;
            case 8:
                TheBottoTwo();
              /*
                b2.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }
                */
                break;
            case 9:
                TheBottonTwoPlus();
             /*
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
               // b2.setText("");
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                    b1.setText("");
                    b3.setText("");
                    b4.setText("");
                }
               */
                break;
            case 10:
                  TheBottonTwoPlus();
                break;
            case 11:
                TheBottonTwoPlus();
                break;
            case 12:
               TheBottoTwo();
                break;
            case 13:
                TheBottoTwo();
                break;
            case 14:
               TheBottonTwoPlus();
                break;
            case 15:
                TheBottoTwo();
                break;
            case 16:
                TheBottonTwoPlus();
                break;
            case 17:
                TheBottoTwo();
                break;
            case 18:
                TheBottoTwo();
                break;
            case 19:
                TheBottoTwo();
                break;
            case 20:
               TheBottonTwoPlus();
                break;
            case 21:
                TheBottoTwo();
                break;
            case 22:
               TheBottonTwoPlusAll();
                break;
            case 23:
                TheBottonTwoPlus();
                break;
            case 24:
               TheBottoTwo();
                break;
            case 25:
                TheBottoTwo();
                break;
            case 26:
                TheBottoTwo();
                break;
            case 27:
                TheBottoTwo();
                break;
            case 28:
                TheBottoTwo();
                break;
            case 29:
                TheBottonTwoPlus();
                break;
            case 30:
                TheBottoTwo();
                break;
        }

    }

    public void Boton3(View boton3){
        switch (pagina){
            case 0:
                TheBottoThree();
              /*
                b3.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                b3.setText("");
                if (llave1) {
                        rw=rw+1;
                        Score.setText("Score ="+p);
                        llave1=false;
                    }
                    */
                break;

            case 1:
                TheBottoThree();
                /*
                b3.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                        rw=rw+1;
                        Score.setText("Score ="+p);
                        b3.setText("");
                        llave1=false;
                    }
                    */
                break;
            case 2:
                TheBottonThreePlus();
               /*
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);



                if (llave1) {
                   p=p+1;
                    Score.setText("Score =" + p);
                    llave1=false;
                    b1.setText("");
                    b2.setText("");
                    b4.setText("");
                }
                */
                break;

            case 3:
                TheBottonThreePlus();
               /*
                b3.setTextColor(Color.WHITE);
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
                //b3.setText("");
                if (llave1){
                    p=p+1;
                    llave1=false;

                    b1.setText("");
                    b2.setText("");
                    b4.setText("");
                }
                */
                break;
            case 4:
                TheBottoThree();
               /*
                b3.setText("");
                if (llave1) {
                    // b3.setTextColor(Color.RED);
                    Resultado.setText("Wrong");
                    Resultado.setTextColor(Color.RED);
                    rw=rw+1;
                    llave1=false;
                }
                */
                break;
            case 5:
                TheBottoThree();
              /*
                Resultado.setText("Right");
                Resultado.setTextColor(Color.RED);
                b3.setText("");
                if (llave1) {
                   rw=rw+1;
                    Score.setText("Score =" + p);
                    llave1=false;
                }
*/
                break;
            case 6:
                TheBottoThree();
                /*
                b3.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }
                */
                break;

            case 7:
                TheBottonThreePlus();
              /*

                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
               // b3.setText("");
                if (llave1) {
                    p = p + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                    b1.setText("");
                    b2.setText("");
                    b4.setText("");

                }
                */

                break;
            case 8:
                TheBottoThree();
              /*
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                b3.setText("");
                if (llave1){
                    rw =rw + 1;
                    Score.setText("Score =" + p);
                    llave1=false;
                }
                */
                break;
            case 9:
                TheBottoThree();
               /*
                b3.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1){
                    rw=rw+1;
                    llave1=false;
                }
                */
                break;
            case 10:
                TheBottoThree();
                break;
            case 11:
                TheBottoThree();
                break;
            case 12:
                TheBottonThreePlus();
                break;
            case 13:
                TheBottoThree();
                break;
            case 14:
                TheBottoThree();
                break;
            case 15:
                TheBottoThree();
                break;
            case 16:
                TheBottoThree();
                break;
            case 17:
                TheBottoThree();
                break;
            case 18:
                TheBottoThree();
                break;
            case 19:
                TheBottonThreePlus();
                break;
            case 20:
                TheBottoThree();
                break;
            case 21:
                TheBottonThreePlus();
                break;
            case 22:
                TheBottonThreeAll();
                break;
            case 23:
                TheBottoThree();
                break;
            case 24:
                TheBottoThree();
                break;
            case 25:
                TheBottoThree();
                break;
            case 26:
                TheBottonThreePlus();
                break;
            case 27:
                TheBottonThreePlus();
                break;
            case 28:
                TheBottonThreePlus();
                break;
            case 29:
                TheBottoThree();
                break;
            case 30:
                TheBottoThree();
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
               // b4.setTextColor(Color.RED);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                b4.setText("");

                if (llave1){
                        rw=rw+1;
                        Score.setText("Score ="+p);
                        llave1=false;
                    }
                break;
            case 2:
                // b4.setBackgroundColor(Color.GREEN);
               // b4.setTextColor(Color.WHITE);
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                b4.setText("");
                if (llave1) {
                    rw=rw+1;
                    Score.setText("Score =" + p);
                    b2.setTextColor(Color.WHITE);
                    b3.setTextColor(Color.WHITE);

                    llave1=false;
                }


                break;
            case 3:
                // b4.setBackgroundColor(Color.GREEN);
                // b4.setTextColor(Color.BLUE);
                b4.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                if (llave1) {
                    rw=rw+1;

                    Score.setText("Score =" + p);
                    b4.setTextColor(Color.WHITE);

                }


                break;
            case 4:
                // b1.setBackgroundColor(Color.RED);
                b4.setText("");
                if (llave1) {
                    //  b4.setTextColor(Color.RED);
                    Resultado.setText("Wrong");
                    Resultado.setTextColor(Color.RED);
                    rw=rw+1;
                    llave1 = false;
                }
                break;
            case 5:
                // b1.setBackgroundColor(Color.GREEN);
                b1.setTextColor(Color.WHITE);
                b2.setTextColor(Color.WHITE);
                b3.setTextColor(Color.WHITE);
                b4.setTextColor(Color.WHITE);

                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                b4.setText("");
                if (llave1) {
                   rw=rw+1;
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
                Resultado.setText("Right");
                Resultado.setTextColor(Color.GREEN);
               // b4.setText("");
                if (llave1){
                    llave1=false;
                    p=p+1;
                    Score.setText("Score="+p);
                    b1.setText("");
                    b2.setText("");
                    b3.setText("");

                }

                break;
            case 9:
                // b1.setBackgroundColor(Color.GREEN);
                //b3.setTextColor(Color.RED);
               // b4.setText("");
                Resultado.setText("Wrong");
                Resultado.setTextColor(Color.RED);
                b4.setText("");
                if (llave1){
                    llave1=false;
                    rw=rw+1;

                }
                break;

            case  10:
                TheBottoFour();
                break;
            case  11:
                TheBottoFour();
                break;
            case  12:
                TheBottoFour();
                break;
            case  13:
                TheBottonFourPlus();
                break;
            case  14:
                TheBottoFour();
                break;
            case  15:
                TheBottoFour();
                break;
            case  16:
                TheBottoFour();
                break;
            case  17:
                TheBottonFourPlus();
                break;
            case  18:
                TheBottonFourPlus();
                break;
            case  19:
                TheBottoFour();
                break;
            case  20:
                TheBottoFour();
                break;
            case  21:
               TheBottoFour();
                break;
            case  22:
               TheBottonFourAll();
                break;
            case  23:
                TheBottoFour();
                break;
            case  24:
                TheBottoFour();
                break;
            case  25:
                TheBottoFour();
                break;
            case  26:
                TheBottoFour();
                break;
            case  27:
                TheBottoFour();
                break;
            case  28:
                TheBottoFour();
                break;
            case  29:
                TheBottoFour();
                break;
            case  30:
                TheBottoFour();
                break;

        }

    }

    public  void TheBottoOne(){

        // b1.setBackgroundColor(Color.GREEN);
        // b1.setTextColor(Color.RED);
        b1.setText("");
        Resultado.setText("Wrong");
        Resultado.setTextColor(Color.RED);
        if (llave1){
            rw=rw+1;
            llave1=false;
        }
    }

    public void TheBottonOnePlus(){
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1){
            p=p+1;
            Score.setText("Score ="+p);
            b2.setText("");
            b3.setText("");
            b4.setText("");
            llave1=false;

        }
    }
    public void TheBottonOnePlusAll(){
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1){
            p=p+1;
            Score.setText("Score ="+p);

            llave1=false;

        }
    }

    public  void TheBottoTwo(){

        // b1.setBackgroundColor(Color.GREEN);
        // b1.setTextColor(Color.RED);
        b2.setText("");
        Resultado.setText("Wrong");
        Resultado.setTextColor(Color.RED);
        if (llave1){
            rw=rw+1;
            llave1=false;
        }
    }




    public void TheBottonTwoPlus(){
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1){
            p=p+1;
            Score.setText("Score ="+p);
            b1.setText("");
            b3.setText("");
            b4.setText("");
            llave1=false;

        }
    }
    public void TheBottonTwoPlusAll(){
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1){
            p=p+1;
            Score.setText("Score ="+p);

            llave1=false;

        }
    }


    public  void TheBottoThree(){

        // b1.setBackgroundColor(Color.GREEN);
        // b1.setTextColor(Color.RED);
        b3.setText("");
        Resultado.setText("Wrong");
        Resultado.setTextColor(Color.RED);
        if (llave1){
            rw=rw+1;
            llave1=false;
        }
    }

    public void TheBottonThreePlus(){
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1){
            p=p+1;
            Score.setText("Score ="+p);
            b1.setText("");
            b2.setText("");
            b4.setText("");
            llave1=false;

        }
    }

    public void TheBottonThreeAll(){
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1){
            p=p+1;
            Score.setText("Score ="+p);

            llave1=false;

        }
    }

    public  void TheBottoFour(){

        // b1.setBackgroundColor(Color.GREEN);
        // b1.setTextColor(Color.RED);
        b4.setText("");
        Resultado.setText("Wrong");
        Resultado.setTextColor(Color.RED);
        if (llave1){
            rw=rw+1;
            llave1=false;
        }
    }
    public void TheBottonFourPlus(){
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1){
            p=p+1;
            Score.setText("Score ="+p);
            b1.setText("");
            b2.setText("");
            b3.setText("");
            llave1=false;

        }
    }
    public void TheBottonFourAll(){
        Resultado.setText("Right");
        Resultado.setTextColor(Color.GREEN);
        if (llave1){
            p=p+1;
            Score.setText("Score ="+p);

            llave1=false;

        }
    }
}
