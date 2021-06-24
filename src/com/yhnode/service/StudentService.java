package com.yhnode.service;

import com.yhnode.domain.Student;

public interface StudentService {
    public Student getByid(String id);

    public void insert(Student student);
}
