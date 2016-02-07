package com.example.ryansatre.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        display();
    }

    public void display()
    {
        Intent i = getIntent();
        String book    = i.getStringExtra("BOOK"   );
        String chapter = i.getStringExtra("CHAPTER");
        String verse   = i.getStringExtra("VERSE"  );
        TextView display = (TextView)(findViewById(R.id.ref));
        display.setText("Your favorite scripture is: " + book + " " + chapter + ":" + verse);
    }
}
