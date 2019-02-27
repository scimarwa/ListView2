package com.example.macomputer.listview2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactDetails extends AppCompatActivity {
    private ImageView image;
    private TextView name;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_details);
        image=findViewById(R.id.i);
        name=findViewById(R.id.tv);
        Contact contact=(Contact) getIntent().getSerializableExtra("data");
        image.setImageResource(contact.getImage());
        name.setText(contact.getName());

    }
}
