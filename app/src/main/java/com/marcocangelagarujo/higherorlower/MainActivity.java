package com.marcocangelagarujo.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void checkGuess(View view){

        EditText guessedNumber = (EditText) findViewById(R.id.guessedNumber) ;

        String guessedString = guessedNumber.getText().toString();

        int guessedNumb = Integer.parseInt(guessedString);

        String message = "";

        if (guessedNumb > randomNumber){

            message= "Too High! Either the number is out of range or it isn't too high for the random!";
            guessedNumber.setText("");
        } else if (guessedNumb < randomNumber){
            message = "Too Low! Try Again!!!";
            guessedNumber.setText("");
        }  else {
            message = "Correct, Well done!!!!";
        }

        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();

        randomNumber = randomGenerator.nextInt(21);

    }
}
