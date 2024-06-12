package com.springboot.rest.webservices.socialmedia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.webservices.socialmedia.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
