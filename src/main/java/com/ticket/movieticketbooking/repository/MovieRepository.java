package com.ticket.movieticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.movieticketbooking.dto.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
