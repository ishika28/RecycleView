package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.recyclerView);

        List<Contacts> conatctsList=new ArrayList<>();
        conatctsList.add(new Contacts("Ishika","989896565",R.drawable.flower));
        conatctsList.add(new Contacts("prerana","89844888",R.drawable.flower1));
        conatctsList.add(new Contacts("Tasmiya","95678779778",R.drawable.flower2));

        ContactsAdapter contactsAdapter =new ContactsAdapter(this,conatctsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
