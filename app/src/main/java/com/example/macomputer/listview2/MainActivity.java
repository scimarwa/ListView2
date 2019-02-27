package com.example.macomputer.listview2;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private  ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.lv);
        Contact c1=new Contact("banana",R.drawable.a);
        Contact c2=new Contact("mango",R.drawable.b);
        Contact c3=new Contact("apricot",R.drawable.c);
        Contact c4=new Contact("strawberry",R.drawable.d);
        Contact c5=new Contact("orange",R.drawable.e);
        Contact c6=new Contact("pinapple",R.drawable.f);
        Contact c7=new Contact("apple",R.drawable.g);
       contacts=new ArrayList<>();
        contacts.add(c1);
        contacts.add(c2);
        contacts.add(c3);
        contacts.add(c4);
        contacts.add(c5);
        contacts.add(c6);
        contacts.add(c7);
        ContactAdapter adapter=new ContactAdapter(this,contacts);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView name=view.findViewById(R.id.tv);
        Toast.makeText(this,name.getText().toString(),Toast.LENGTH_LONG).show();
        Contact contact=contacts.get(position);
        Intent intent=new Intent(this,ContactDetails.class);
        intent.putExtra("data",contact);
        startActivity(intent);



    }
}
