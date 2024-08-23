package com.ticket.movieticketbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.movieticketbooking.dto.Screen;

public interface ScreenRepository extends JpaRepository<Screen, Integer>{

	boolean existsByName(String name);

}
