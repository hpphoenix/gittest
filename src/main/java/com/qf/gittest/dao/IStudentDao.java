package com.qf.gittest.dao;

import com.qf.gittest.entity.Student;

public interface IStudentDao  {

    public Student selectByName(String name);
}
