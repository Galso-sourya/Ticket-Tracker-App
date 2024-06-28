package com.gl.ticketTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.ticketTracker.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

	
}
