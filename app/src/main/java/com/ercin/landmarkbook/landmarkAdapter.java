package com.ercin.landmarkbook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ercin.landmarkbook.databinding.RecycleRowBinding;

import java.util.ArrayList;

public class landmarkAdapter extends RecyclerView.Adapter<landmarkAdapter.LandmarkHolder> {

    ArrayList <LandMMark> landmarkArraylist;

    public landmarkAdapter(ArrayList<LandMMark> landmarkArraylist) {
        this.landmarkArraylist = landmarkArraylist;
    }

    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecycleRowBinding recycleRowBinding = RecycleRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LandmarkHolder(recycleRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {

        holder.binding.recyclerViewTxtView.setText(landmarkArraylist.get(position).isim);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
                intent.putExtra("landmark", landmarkArraylist.get(holder.getAdapterPosition()));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return landmarkArraylist.size();
    }

    public class LandmarkHolder extends  RecyclerView.ViewHolder{

        private RecycleRowBinding binding;

        public LandmarkHolder(RecycleRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
