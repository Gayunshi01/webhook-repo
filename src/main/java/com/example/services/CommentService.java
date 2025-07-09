package com.example.services;

import org.springframework.stereotype.Service;

import com.example.payloads.CommentDto;

@Service
public interface CommentService {
	
	CommentDto createComment(CommentDto commentDto,Integer postId);
	
	void deleteComment(Integer commentId);

}
