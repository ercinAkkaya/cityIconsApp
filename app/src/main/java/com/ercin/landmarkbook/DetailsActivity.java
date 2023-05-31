package com.ercin.landmarkbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ercin.landmarkbook.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //inflat xml ve kod bağlandığı yerlerden biri. aklına o gelsin
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        LandMMark selectedLandmark = (LandMMark) intent.getSerializableExtra("landmark");
        binding.nameTxt.setText(selectedLandmark.isim);
        binding.countryTxt.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);



    }
}