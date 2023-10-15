package com.example.api_exampls.Post.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.api_exampls.Post.model.Post;
import com.example.api_exampls.R;
import com.example.api_exampls.databinding.ItemPostBinding;

import java.util.List;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{
   List<Post>postList;
   Context context;
    public PostAdapter(List<Post>postList){
        this.postList =postList;

    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        ItemPostBinding binding = ItemPostBinding.inflate(LayoutInflater.from(context));
        return new PostViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.PostViewHolder holder, int position) {
        Post post = postList.get(position);
        Glide.with(context).load(post.getImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.postIV);
        }
    }
}
