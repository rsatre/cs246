package com.example.ryansatre.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class scripturePower extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture_power);
    }

    public void buttonOnClick(View v)
    {
        //Button button = (Button) v;
        Intent i = new Intent(this, activity_2.class);
        EditText bookText    = (EditText)findViewById(R.id.book   );
        EditText chapterText = (EditText)findViewById(R.id.chapter);
        EditText verseText   = (EditText)findViewById(R.id.verse  );
        String book    = bookText.getText().toString();
        String chapter = chapterText.getText().toString();
        String verse   = verseText.getText().toString();
        i.putExtra ("BOOK"   , book   );
        i.putExtra("CHAPTER", chapter);
        i.putExtra("VERSE", verse);
        startActivity(i);

    }
}
