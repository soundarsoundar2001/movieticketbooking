package com.ticket.movieticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.movieticketbooking.dto.Show;

public interface ShowRepository extends JpaRepository<Show, Integer> {

}