package com.ercin.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.ercin.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList <LandMMark> landmarkArraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArraylist = new ArrayList<>();

        LandMMark eiffel = new LandMMark("Eiffel", "France", R.drawable.eyfel2);
        LandMMark galata = new LandMMark("Galata Kulesi", "İstanbul", R.drawable.galata2);
        LandMMark saatKulesi = new LandMMark("Saat Kulesi", "İzmir", R.drawable.saat);

        landmarkArraylist.add(eiffel);
        landmarkArraylist.add(galata);
        landmarkArraylist.add(saatKulesi);


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        landmarkAdapter landmarkAdapter = new landmarkAdapter(landmarkArraylist);
        binding.recyclerView.setAdapter(landmarkAdapter);




        /*
        //adapter veri kaynağı xml ve listviewi bağlar
        //listView

        //mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArraylist
        );
        binding.listView.setAdapter(arrayAdapter);

        System.out.println(landmarkArraylist.get(0).isim);

        
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, "bildirim", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("landmark", landmarkArraylist.get(position));
                startActivity(intent);

            }
        });
        */

        //recyclerView





    }
}