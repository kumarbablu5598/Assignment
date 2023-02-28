package com.userms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userms.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer>{

}

