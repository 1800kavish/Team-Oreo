package com.example.android.availgovernmentschemes;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {


    public CategoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.category_activity, container, false);
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


        CategoryAdapter itemsAdapter = new CategoryAdapter(getActivity(), words);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = words.get(i);
                Log.v("NumbersActivity", "Current Word: " + word.toString());

            }
        });
        return rootView;
    }

}
