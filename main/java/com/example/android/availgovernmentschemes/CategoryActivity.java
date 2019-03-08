package com.example.android.availgovernmentschemes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_activity);
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", R.drawable.women));
        words.add(new Word("two", R.drawable.women));
        words.add(new Word("three", R.drawable.senior));
        words.add(new Word("four", R.drawable.senior));
        words.add(new Word("five", R.drawable.women));
        words.add(new Word("six", R.drawable.senior));
        words.add(new Word("seven", R.drawable.senior));
        words.add(new Word("eight", R.drawable.women));
        words.add(new Word("nine", R.drawable.senior));
        words.add(new Word("ten", R.drawable.women));


        CategoryAdapter itemsAdapter = new CategoryAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                Log.v("NumbersActivity", "Current Word: " + word.toString());

            }
        });
    }
}
