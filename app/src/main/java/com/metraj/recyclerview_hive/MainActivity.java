package com.metraj.recyclerview_hive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //init
    private List<Movie> movieList = new ArrayList<>();


    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //init recyclerview
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view_container);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        movieAdapter = new MovieAdapter(movieList,getApplicationContext());
        recyclerView.setAdapter(movieAdapter);




        generateMovieData();
    }

    private void generateMovieData() {


        Movie movie = new Movie("ghalb yakhi","http://lorempixel.com/400/201");
        movieList.add(movie);

        Movie movie1 = new Movie("ghalb yakhi2","http://lorempixel.com/400/202");
        movieList.add(movie1);

        Movie movie2 = new Movie("ghalb yakhi3","http://lorempixel.com/400/203");
        movieList.add(movie2);

        Movie movie3 = new Movie("ghalb yakhi4","http://lorempixel.com/400/204");
        movieList.add(movie3);

        Movie movie4 = new Movie("ghalb yakhi5","http://lorempixel.com/400/205");
        movieList.add(movie4);

        Movie movie5 = new Movie("ghalb yakhi6","http://lorempixel.com/400/206");
        movieList.add(movie5);

        Movie movie6 = new Movie("ghalb yakhi7","http://lorempixel.com/400/207");
        movieList.add(movie6);

        Movie movie7 = new Movie("ghalb yakhi8","http://lorempixel.com/400/208");
        movieList.add(movie7);

        Movie movie8 = new Movie("ghalb yakhi9","http://lorempixel.com/400/200");
        movieList.add(movie8);

        Movie movie9 = new Movie("ghalb yakhi10","http://lorempixel.com/400/300");
        movieList.add(movie9);

        Movie movie10 = new Movie("ghalb yakhi11","http://lorempixel.com/400/2323");
        movieList.add(movie10);

        Movie movie11 = new Movie("ghalb yakhi12","http://lorempixel.com/400/231");
        movieList.add(movie11);

        Movie movie12 = new Movie("ghalb yakhi13","http://lorempixel.com/400/221");
        movieList.add(movie12);

        Movie movie13 = new Movie("ghalb yakhi14","http://lorempixel.com/400/211");
        movieList.add(movie13);

        Movie movie14 = new Movie("ghalb yakhi15","http://lorempixel.com/400/212");
        movieList.add(movie14);

        Movie movie15 = new Movie("ghalb yakhi16","http://lorempixel.com/400/213");
        movieList.add(movie15);

        Movie movie16 = new Movie("ghalb yakhi17","http://lorempixel.com/400/214");
        movieList.add(movie16);

        Movie movie17 = new Movie("ghalb yakhi18","http://lorempixel.com/400/215");
        movieList.add(movie17);

    }
}
