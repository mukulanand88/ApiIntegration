package com.example.api_exampls.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.api_exampls.R;
import com.example.api_exampls.databinding.ItemNextBinding;
import com.example.api_exampls.model.Category;

import java.util.List;

public class NextPageAdapter extends RecyclerView.Adapter<NextPageAdapter.NextViewHolder> {
    List<Category>categoryList;
    Context context;

public NextPageAdapter(List<Category>categoryList){
    this.categoryList=categoryList;

}

    @NonNull
    @Override
    public NextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        context =parent.getContext();
        ItemNextBinding binding =ItemNextBinding.inflate(LayoutInflater.from(context));
        return new NextViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull NextPageAdapter.NextViewHolder holder, int position) {
        Category category= categoryList.get(position);
        Glide.with(context).load(category.getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class NextViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public NextViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.imageIV);


        }
    }
}
