package com.yhnode.test;

import com.yhnode.dao.StudentDao;
import com.yhnode.domain.Student;
import com.yhnode.util.SqlSessionUtil;
import com.yhnode.vo.StudentAndClassroomVo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {
        StudentDao studentDao = SqlSessionUtil.getSqlSession().getMapper(StudentDao.class);

        /*
        测试单个简单参数
        Student student = studentDao.selectOne("羊五");
        System.out.println(student);*/


        //传递多个参数
        /*List<Student> students = studentDao.selectMulitParam("羊五",18);
        students.forEach(student -> System.out.println(student));*/

        /*Student student = new Student();
        student.setAge(18);
        student.setName("羊五");
        List<Student> students = studentDao.selectMulitParamTwo(student);
        students.forEach(student1 -> System.out.println(student1));*/

        /*Map map = new HashMap();
        map.put("name","羊五");
        map.put("age",18);

        List<Student> students = studentDao.selectMap(map);
        students.forEach(student -> System.out.println(student));*/

        //多表查询，查询学生的姓名和班级名称
        /*List<Map<String,Object>> mapList = studentDao.selectMulitStudent();
        for (Map<String, Object> stringObjectMap : mapList) {

            Set<String> set = stringObjectMap.keySet();
            for (String key : set) {
                System.out.println("key:"+key);
                System.out.println("value:"+stringObjectMap.get(key));
            }
            System.out.println("-------------------------------------");
        }*/

        //查询出学生和班级所有信息，加vo
        /*
            在实际项目开发中，如果需要为前端展现的数据，使用一个domain类型不足以表现出来这些数据，这时我们可以考虑
            使用两种技术来实现
            分别为：
                使用map以及使用vo
            例如我们现在的需求：
                查询出学生和班级所有信息
                得到的结果，使用学生的domain或者班级的domain都不能够封装这些结果

                所以我们可以使用map去保存这些信息
                也可以使用vo类来保存这些信息

                vo指的是我们创建出来一个类，这个类中的属性完全由我们自己去定义，属性会保存所有需要展现的信息，例如我们
                现在的这个例子，我们可以使用vo来封装所有学生与班级相关的信息
         */

       /* List<StudentAndClassroomVo> voList = studentDao.selectVo();
        for (StudentAndClassroomVo studentAndClassroomVo : voList) {
            System.out.println(studentAndClassroomVo);
        }*/

        //查询名字中带五的学生的信息
        List<StudentAndClassroomVo> voSList = studentDao.selectVo1("五");
        for (StudentAndClassroomVo studentAndClassroomVo : voSList) {
            System.out.println(studentAndClassroomVo);
        }

    }
}
