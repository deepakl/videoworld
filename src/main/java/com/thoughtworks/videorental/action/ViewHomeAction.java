package com.thoughtworks.videorental.action;

import com.opensymphony.xwork2.ActionSupport;
import com.thoughtworks.videorental.domain.Movie;
import com.thoughtworks.videorental.domain.repository.MovieRepository;

import java.util.Set;

public class ViewHomeAction extends ActionSupport {

    private final MovieRepository movieRepository;

    public ViewHomeAction(final MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Set<Movie> getMovies() {
        return movieRepository.selectAll();
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
