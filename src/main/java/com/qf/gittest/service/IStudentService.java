package com.qf.gittest.service;

import com.qf.gittest.entity.Student;

public interface IStudentService {

    Student selectByName(String name);
}
