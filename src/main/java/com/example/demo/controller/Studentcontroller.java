package com.example.demo.controller;

import com.example.demo.dao.StudentRespority;
import com.example.demo.entity.Student;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller

@RequestMapping("/student")
 public class Studentcontroller {

    @Autowired
   StudentRespority studentRespority;

    @ApiOperation("查询全部")
    @RequestMapping("/SelectAll")

    public ModelAndView SelectAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("studentList");
        modelAndView.addObject("studentList",studentRespority.SelectAll());
        return modelAndView;
    }
    @ApiOperation("查询特定")
    @RequestMapping("/SelectOne")
    public String SelectOne(Student student,HttpServletRequest request){
        Student student1 = studentRespority.SelectOne(student.getId());
        HttpSession session  = request.getSession();
        session.setAttribute("student1",student1);
        return "forward:/pages/updateOne.jsp";
    }
    @ApiOperation("删除")
    @RequestMapping("/DeleteOne")
    public String DeleteOne(int id){
        studentRespority.DeleteOne(id);
        return "redirect:/student/SelectAll";
    }

    @ApiOperation("添加")
    @RequestMapping("/InsertOne")
    public String InsertOne(Student student){
        studentRespority.save(student);
        return "redirect:/student/SelectAll";
    }

    @ApiOperation("更新")
    @RequestMapping("/UpdateOne")
    public String UpdateOne(Student student1){
        studentRespority.save(student1);
        return "redirect:/student/SelectAll";
    }
}
