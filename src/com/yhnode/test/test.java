package com.yhnode.test;

import com.yhnode.domain.Student;
import com.yhnode.service.StudentService;
import com.yhnode.service.impl.StudentServiceImpl;
import com.yhnode.util.MybatisUtils;
import com.yhnode.util.ServiceFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class test {
    public static void main(String[] args) {


        //StudentService studentService = new StudentServiceImpl();
        StudentService studentService = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
        Student s = studentService.getByid("A0001");
        System.out.println(s);






    }
}
