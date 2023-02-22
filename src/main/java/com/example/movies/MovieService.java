package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private IMovieRepository movieReposiroty;

    public List<Movie> allMovies(){
        return movieReposiroty.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieReposiroty.findMovieByImdbId(imdbId);
    }
}
