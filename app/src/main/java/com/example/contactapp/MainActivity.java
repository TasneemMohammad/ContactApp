package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  RecyclerView rv ;
  ArrayList<Contact> contacts ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView)findViewById(R.id.rv_contact);
        contacts = new ArrayList<>();
        RecyclerAdapter adapter = new RecyclerAdapter(contacts, new OnClickListener() {
            @Override
            public void onClickItem(Contact c) {

                Toast.makeText(MainActivity.this ,c.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        contacts.add(new Contact("Ahmed","01001111377"));
        contacts.add(new Contact("Amin","01001111377"));
        contacts.add(new Contact("Tasneem","01001111377"));
        contacts.add(new Contact("Salma","01001111377"));
        contacts.add(new Contact("Ahmed","01001111377"));
        contacts.add(new Contact("A","01001111377"));
        contacts.add(new Contact("H","01001111377"));
        contacts.add(new Contact("A","01001111377"));
        contacts.add(new Contact("H","01001111377"));
        contacts.add(new Contact("A","01001111377"));
        contacts.add(new Contact("H","01001111377"));
        contacts.add(new Contact("A","01001111377"));
        contacts.add(new Contact("A","01001111377"));
        contacts.add(new Contact("A","01001111377"));
        contacts.add(new Contact("A","01001111377"));
    }
}
  /*  Intent i = new Intent(MainActivity.this,Activity_name.class);
               i.putExtra("x", c.getName());
                       startActivity(i);
*/