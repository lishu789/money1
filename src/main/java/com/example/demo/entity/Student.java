package com.example.demo.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name="student")
@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer id;
    @Column(name="name")
    public String name;
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ",password="+ password +", sex=" + sex +", age=" + age + "]";
    }
    @Column(name="password")
    public String password;
    @Column(name="sex")
    public String sex;
    @Column(name="age")
    public String age;
}

