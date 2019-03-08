package com.example.android.availgovernmentschemes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends ArrayAdapter<Word> {
    private static final String LOG_TAG = CategoryAdapter.class.getSimpleName();
    public CategoryAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.view1);
        nameTextView.setText(((Word) currentWord).getTextCategory());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.img);
        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceId());
        }
        else{
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
