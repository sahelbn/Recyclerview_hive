package com.metraj.recyclerview_hive;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>  {

    private List<Movie> movieList;
    private Context mContext;

    public MovieAdapter(List<Movie> movieList, Context mContext) {
        this.movieList = movieList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView =  LayoutInflater.from(mContext).inflate(R.layout.movie_list_row,viewGroup,false);
        ViewHolder holder = new ViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

           Movie movie =  movieList.get(position);
           holder.title_row.setText(movie.getTitle());
           Glide.with(mContext)
                   .load(movie.getUrl())
                   .into(holder.img_row);

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    //Viewholder
    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView title_row;
        public ImageView img_row;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title_row = (TextView) itemView.findViewById(R.id.title_row);
            img_row = (ImageView) itemView.findViewById(R.id.img_row);

        }
    }


}
