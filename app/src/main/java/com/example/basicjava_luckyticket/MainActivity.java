package com.example.basicjava_luckyticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startProcess(View view) {
        String input = ((EditText) findViewById(R.id.editText)).getText().toString();
        ImageView bulb = findViewById(R.id.bulbImageView);

        char[] number = input.toCharArray();
        if (number.length == 6) {
            if (number[0] + number[1] + number[2] == number[3] + number[4] + number[5]) {
                bulb.setImageResource(R.drawable.icongreen);
                Toast.makeText(this, "Щасливий білет!", Toast.LENGTH_LONG).show();
            } else {
                bulb.setImageResource(R.drawable.iconred);
                Toast.makeText(this, "Не щасливий білет!", Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, "Введіть більше символів!", Toast.LENGTH_LONG).show();
        }
    }
    // by Lazerneek123 / Barmutov Roman
}
