package com.qf.gittest.controller;

import com.qf.gittest.entity.Student;
import com.qf.gittest.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    public String login(Student student){
        Student student1 = studentService.selectByName(student.getStuName());
        if (student1!=null&student.getPassword().equals(student1.getPassword())){
            return "show";
        }else{
            return "";
        }

    }
}
