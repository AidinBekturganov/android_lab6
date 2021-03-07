package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    private String[] names = {"Oleg", "Sergei", "Vladimir", "Vanya", "Fedor", "Heras", "Chingiz", "Aidar", "Shi", "Chu", "Chan", "Fedor", "Heras", "Fedor", "Heras"};
    private String[] lastNames = {"Shin", "Penkin", "Putin", "Naval", "Shil", "Hex", "Jask", "Avai", "Djig", "Wond", "Jack", "Shin", "Penkin", "Shin", "Penkin"};
    private List<Student> studentList = new ArrayList<>();

    private int[] images = {R.drawable.download11, R.drawable.dwadwad, R.drawable.images, R.drawable.images2,
            R.drawable.images3, R.drawable.images4, R.drawable.images5, R.drawable.images6, R.drawable.images7, R.drawable.images8,
            R.drawable.images8, R.drawable.images9, R.drawable.images10, R.drawable.images5, R.drawable.images7};
    MyRecyclerViewAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        prepareTheList();
        RecyclerAdapter adapter = new RecyclerAdapter(studentList);
        recyclerView.setAdapter(adapter);
    }

    private void prepareTheList()
    {
        int count = 0;
        for(String name : names)
        {
            Student student = new Student(name, lastNames[count], images[count]);
            studentList.add(student);
            count++;
        }

    }




}