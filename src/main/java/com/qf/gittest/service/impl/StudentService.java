package com.qf.gittest.service.impl;

import com.qf.gittest.dao.IStudentDao;
import com.qf.gittest.entity.Student;
import com.qf.gittest.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentDao iStudentDao;

    @Override
    public Student selectByName(String name) {
        Student student1=iStudentDao.selectByName(name);
        return student1;
    }
}
