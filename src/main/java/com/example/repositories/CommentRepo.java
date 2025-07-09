package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entites.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
