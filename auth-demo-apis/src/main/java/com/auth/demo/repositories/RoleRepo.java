package com.auth.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.demo.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}