package com.yhnode.service.impl;

import com.yhnode.dao.StudentDao;
import com.yhnode.domain.Student;
import com.yhnode.service.StudentService;
import com.yhnode.util.SqlSessionUtil;

public class StudentServiceImpl implements StudentService {
    private StudentDao dao = SqlSessionUtil.getSqlSession().getMapper(StudentDao.class);

    @Override
    public Student getByid(String id) {
        Student student = dao.getByid(id);
        return student;
    }

    @Override
    public void insert(Student student) {
        dao.insert(student);
    }
}
