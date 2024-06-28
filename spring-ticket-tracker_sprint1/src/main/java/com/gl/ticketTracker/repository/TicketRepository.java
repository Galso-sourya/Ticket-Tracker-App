package com.gl.ticketTracker.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.ticketTracker.entity.Ticket;
    
public interface TicketRepository extends JpaRepository<Ticket, Long>{ //entity name, data type of primary key

	Optional<Ticket> findByUrl(String url); //create query using method name , spring jpa will pass internally and uses hibernate to create the query
	
}
