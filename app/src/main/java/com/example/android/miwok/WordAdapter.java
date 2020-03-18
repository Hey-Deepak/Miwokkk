package com.example.android.miwok;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;


class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(NumbersActivity numbersActivity, ArrayList<Word> words) {
        super(numbersActivity,0, words);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
