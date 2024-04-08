package com.example.Real.Estate.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.Real.Estate.Entities.Reg_User;

@Repository
@EnableJpaRepositories
public interface Reg_user_Repo extends JpaRepository<Reg_User, Integer> {

}
