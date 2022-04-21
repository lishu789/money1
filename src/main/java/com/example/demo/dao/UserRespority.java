package com.example.demo.dao;

import com.example.demo.entity.Student;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRespority extends JpaRepository<User, Integer> {
    public User getByUsernameAndPassword(String username,String password);

    @Modifying
    @Transactional
    @Query(value = "insert into user value(?,?,?)", nativeQuery = true)
    void AddOne(@Param("id") Integer id,@Param("username") String username,@Param("password") String password);
}