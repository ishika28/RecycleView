package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;


public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>{
    Context mcontext;
    List<Contacts> contactsList;

    public ContactsAdapter(Context mcontext, List<Contacts> contactsList) {
        this.mcontext = mcontext;
        this.contactsList = contactsList;
    }
    //Constructor to receive data from the activity

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contacts,parent,false);
        return new ContactsViewHolder(view);
    }

    @Override
    public int getItemCount()
    {
        return contactsList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        Contacts contacts = contactsList.get(position);
        holder.imgView.setImageResource(contacts.getImageId());
        holder.tvname.setText(contacts.getName());
        holder.tvphone.setText(contacts.getContactNo());

    }


  public  class ContactsViewHolder extends RecyclerView.ViewHolder{
      ImageView imgView;
      TextView tvname, tvphone;

      public ContactsViewHolder(View itemView){
          super(itemView);
          imgView= itemView.findViewById(R.id.imageView);
          tvname=itemView.findViewById(R.id.textView);
          tvphone=itemView.findViewById(R.id.textView2);
      }
  }

}
