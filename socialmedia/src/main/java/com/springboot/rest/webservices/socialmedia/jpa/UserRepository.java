package com.springboot.rest.webservices.socialmedia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.webservices.socialmedia.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
