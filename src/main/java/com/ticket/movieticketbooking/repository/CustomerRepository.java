package com.ticket.movieticketbooking.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.movieticketbooking.dto.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public boolean existsByEmail(String email);

	public boolean existsByMobile(long mobile);

	public Customer findByEmail(String email);

	public Customer findByMobile(long mobile);
}