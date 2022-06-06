package com.example.assignment2;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

/*public class MyViewAdapter extends ArrayAdapter<Alphabet> {
    public MyViewAdapter(@NonNull Context context, @NonNull ArrayList<Alphabet> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Alphabet alpha = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_custom,parent,false);
        TextView txtCap = convertView.findViewById(R.id.txtVwCap);
        TextView txtSmall = convertView.findViewById(R.id.txtVwSmall);
        ImageView imgView = convertView.findViewById(R.id.imgVw1);
        txtCap.setText(alpha.capital);
        txtSmall.setText(alpha.small);
        imgView.setImageResource(alpha.imageID);
        return convertView;
    }
}*/
public class MyViewAdapter extends ArrayAdapter<Alphabet> {
    public MyViewAdapter(@NonNull Context context, ArrayList<Alphabet> alphabetsArrayList) {
        super(context,0, alphabetsArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

        Alphabet alphabet = getItem(position);
        view = LayoutInflater.from(getContext()).

                inflate(R.layout.activity_custom, parent, false);
        TextView txtCap = view.findViewById(R.id.txtVwCap);
        TextView txtSmall = view.findViewById(R.id.txtVwSmall);
        ImageView imageView = view.findViewById(R.id.imgVw1);
        txtCap.setText(alphabet.capital.toString());
        txtSmall.setText(alphabet.small.toString());
        imageView.setImageResource(alphabet.imageID);

        return view;
    }
}
