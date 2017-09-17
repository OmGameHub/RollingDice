package com.pandey.rollingdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private int[] diceNumber = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRollIt(View view)
    {
        ImageView diceImage = findViewById(R.id.dice_image);

        Random random = new Random();

        int randomNumber = random.nextInt(diceNumber.length);

        int currentAngel = (int) diceImage.getRotation();
        int randomRotation = random.nextInt(currentAngel + 360) + currentAngel;

        diceImage.animate().rotation(randomRotation);
        diceImage.setImageResource(diceNumber[randomNumber]);
    }
}
