package com.example.contactapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolderContact> {
    OnClickListener listener ;
    ArrayList<Contact> contacts ;

    public RecyclerAdapter(ArrayList<Contact> contacts , OnClickListener listener) {
        this.contacts = contacts;
        this.listener = listener;
    }
    @NonNull
    @Override
    public ViewHolderContact onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contact,null,false);
        return new ViewHolderContact(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderContact holder, int position) {
        Contact c = contacts.get(position);
        holder.tv_name.setText(c.getName());
        holder.tv_phoneNumber.setText(c.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    class ViewHolderContact extends RecyclerView.ViewHolder {
        TextView tv_name , tv_phoneNumber ;

        public ViewHolderContact(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.tv_name);
            tv_phoneNumber = itemView.findViewById(R.id.tv_number);
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    listener.onClickItem(new Contact(tv_name.getText().toString(),tv_phoneNumber.getText().toString())
                    );
                }
            });

        }}}
