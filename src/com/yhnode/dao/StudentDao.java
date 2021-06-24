package com.yhnode.dao;

import com.yhnode.domain.Student;
import com.yhnode.vo.StudentAndClassroomVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao {
    public Student getByid(String id);

    public void insert(Student student);

    public List<Student> selectOne(String name);

    //传递多个参数
    public List<Student> selectMulitParam(@Param("myname") String name,@Param("myage") Integer age);

    //传递多个参数，使用对象
    public List<Student> selectMulitParamTwo(Student student);

    //使用map传参
    public List<Student> selectMap(Map<String,Object> map);


    //多表查询，学生姓名和班级名称
    List<Map<String, Object>> selectMulitStudent();

    //多表查询，使用vo
    List<StudentAndClassroomVo> selectVo();

    List<StudentAndClassroomVo> selectVo1(String name);
}
