package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRespority extends JpaRepository<Student, Integer>{

    @Query(value = "select * from student", nativeQuery =true)
    List<Student> SelectAll();

    @Query(value = "select * from student where id = :id", nativeQuery = true)
    Student SelectOne(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query("delete from Student u where u.id=:id")
    void DeleteOne(@Param("id") Integer id);

    @Query("delete from Student u where u.id=?1")
    void DeleteOne2(Integer id);


    @Modifying
    @Transactional
    @Query(value="update student set name =:name,password = :password ,sex= :sex,age= :age where id=:id", nativeQuery = true)
    void UpdateOne(@Param("id") Integer id,@Param("name") String name,@Param("password") String password,@Param("sex") String sex,@Param("age")String age);


    @Modifying
    @Transactional
    @Query(value = "insert into student value(?,?,?,?,?)", nativeQuery = true)
    void InsertOne(@Param("id") Integer id,@Param("name") String name,@Param("password") String password,@Param("sex") String sex,@Param("age")String age);
}
