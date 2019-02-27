package com.example.macomputer.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {
    private ArrayList<Contact> contacts;
    private Context context;
    public ContactAdapter(@NonNull Context context,  @NonNull ArrayList<Contact> contacts) {
        super(context,R.layout.listview_design, contacts);
        this.contacts=contacts;
        this.context=context;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.listview_design,parent,false);
        TextView name=view.findViewById(R.id.tv);
        ImageView image=view.findViewById(R.id.i);
        name.setText(contacts.get(position).getName());
        image.setImageResource(contacts.get(position).getImage());
        return view;
    }
}
