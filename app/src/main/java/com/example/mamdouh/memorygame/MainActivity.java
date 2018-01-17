package com.example.mamdouh.memorygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_p1, tv_p2;
    ImageView iv_11, iv_12, iv_13, iv_14,
              iv_21, iv_22, iv_23, iv_24,
              iv_31, iv_32, iv_33, iv_34;
    Integer[] ArrayCards = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};

    int Image101, Image102, Image103, Image104,
            Image201, Image202, Image203, Image204,
            Image301, Image302, Image303, Image304;

    int FirstCard, secondCard;
    int ClickedFirst, ClickedSecond;
    int Cardnumber = 1;
    int turn = 1;
    int PlayerPoints = 0, cpuPoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);

        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);

        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);

        iv_11.setTag("0");
        iv_11.setTag("1");
        iv_11.setTag("2");
        iv_11.setTag("3");
        iv_11.setTag("4");
        iv_11.setTag("5");
        iv_11.setTag("6");
        iv_11.setTag("7");
        iv_11.setTag("8");
        iv_11.setTag("9");
        iv_11.setTag("10");
        iv_11.setTag("11");

        frontOfCardsResources();
        Collections.shuffle(Arrays.asList(ArrayCards));
        tv_p2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_11, theCard);
            }
        });


        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_12, theCard);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_13, theCard);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_14, theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_21, theCard);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_22, theCard);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_23, theCard);
            }
        });


        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_24, theCard);
            }
        });


        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_31, theCard);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_32, theCard);
            }
        });


        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_33, theCard);
            }
        });

        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String), view.getTag());
                doStuff(iv_34, theCard);
            }
        });


    }


    protected void doStuff(ImageView iv, int card) {
        if (ArrayCards[card] == 101) {
            iv.setImageResource(Image101);
        } else if (ArrayCards[card] == 102) {
            iv.setImageResource(Image102);
        } else if (ArrayCards[card] == 103) {
            iv.setImageResource(Image103);
        } else if (ArrayCards[card] == 104) {
            iv.setImageResource(Image104);
        } else if (ArrayCards[card] == 105) {
            iv.setImageResource(Image105);
        } else if (ArrayCards[card] == 106) {
            iv.setImageResource(Image106);
        } else if (ArrayCards[card] == 201) {
            iv.setImageResource(Image201);
        } else if (ArrayCards[card] == 202) {
            iv.setImageResource(Image202);
        } else if (ArrayCards[card] == 203) {
            iv.setImageResource(Image203);
        } else if (ArrayCards[card] == 204) {
            iv.setImageResource(Image204);
        } else if (ArrayCards[card] == 205) {
            iv.setImageResource(Image205);
        } else (ArrayCards[card] == 206) {
            iv.setImageResource(Image206);
        }

        // check which image is selected and save it to variable

        if (Cardnumber == 1) {
            FirstCard = ArrayCards[card];
            if (FirstCard > 200) {
                FirstCard = FirstCard - 100;
            }
            Cardnumber = 2;
            ClickedFirst = card;
            iv.setEnabled(false);

        } else if (Cardnumber == 2) {
            secondCard = ArrayCards[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            Cardnumber = 1;
            ClickedSecond = card;
            iv.setEnabled(false);

            iv_11.setEnabled(false);
            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            Handler handler = new Handler;
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the selected images are equal
                    calculate();
                }
            }, 1000)


        }
    }

    // if images are equal remove them and add point
    private void calculate() {
        if (FirstCard == secondCard) {
            if (ClickedFirst == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (ClickedFirst == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (ClickedFirst == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (ClickedFirst == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (ClickedFirst == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (ClickedFirst == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (ClickedFirst == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (ClickedFirst == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (ClickedFirst == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (ClickedFirst == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (ClickedFirst == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (ClickedFirst == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }


            if (ClickedFirst == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (ClickedSecond == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (ClickedSecond == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (ClickedSecond == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (ClickedSecond == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (ClickedSecond == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (ClickedSecond == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (ClickedSecond == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (ClickedSecond == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (ClickedSecond == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (ClickedSecond == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (ClickedSecond == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }
            // add points to the correct player
            if (turn == 1) {
                PlayerPoints++;
                tv_p1.setText("Pl :" + PlayerPoints);
            }
            if (turn == 2) {
                cpuPoints++;
                tv_p2.setText("P2 :" + cpuPoints);
            } else {
                iv_11.setImageResource(R.drawable.qmark);
                iv_12.setImageResource(R.drawable.qmark);
                iv_13.setImageResource(R.drawable.qmark);
                iv_14.setImageResource(R.drawable.qmark);
                iv_21.setImageResource(R.drawable.qmark);
                iv_22.setImageResource(R.drawable.qmark);
                iv_23.setImageResource(R.drawable.qmark);
                iv_24.setImageResource(R.drawable.qmark);
                iv_31.setImageResource(R.drawable.qmark);
                iv_32.setImageResource(R.drawable.qmark);
                iv_33.setImageResource(R.drawable.qmark);
                iv_34.setImageResource(R.drawable.qmark);
// Change the player turn
                if (turn == 1) {
                    turn = 2;
                    tv_p1.setTextColor(Color.GRAY);
                    tv_p1.setTextColor(Color.BLACK);
                } else (turn == 2){
                    turn = 1;
                    tv_p1.setTextColor(Color.BLACK);
                    tv_p1.setTextColor(Color.GRAY);
                }
            }
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);

        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);

        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        //check if the game is over
        checkEnd();
    }

    private void checkEnd (){
      if (  iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&

                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&


                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE){

          AlertDialog.Builder AlertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
          AlertDialogBuilder.setMessage("Game Over !\np1 : " + PlayerPoints + "\np2: " + cpuPoints)
          .setCancelable(false)

          .setPositiveButton("new ", new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialogInterface, int i) {
                  Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                  startActivity(intent);
                  finish();
              }
          })
                  .setNegativeButton("Exit ", new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface dialogInterface, int i) {
                          finish();
                      }
                  });
          AlertDialog alertDialog = new AlertDialog.Builder().create();
          alertDialog.show();
      }
    }


    protected void frontOfCardsResources() {

        Image101 = R.drawable.i101;
        Image102 = R.drawable.i102;
        Image103 = R.drawable.i103;
        Image104 = R.drawable.i104;

        Image201 = R.drawable.i201;
        Image202 = R.drawable.i202;
        Image203 = R.drawable.i203;
        Image204 = R.drawable.i204;

        Image301 = R.drawable.i201;
        Image302 = R.drawable.i202;
        Image303 = R.drawable.i203;
        Image304 = R.drawable.i204;

    }

}
