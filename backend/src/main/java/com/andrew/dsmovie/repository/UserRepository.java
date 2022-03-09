package com.andrew.dsmovie.repository;

import com.andrew.dsmovie.model.Movie;
import com.andrew.dsmovie.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);
}
