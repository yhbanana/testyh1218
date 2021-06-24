package com.yhnode.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private static InputStream in;
    private static SqlSessionFactory factory;

    static {
        String url = "mybatis-config.xml";
        try {
            in = Resources.getResourceAsStream(url);
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();
    public static SqlSession getSqlSession(){
        SqlSession sqlSession=t.get();
        if (sqlSession==null){
            sqlSession = factory.openSession();
            t.set(sqlSession);
        }
        return sqlSession;
    }

    //关闭sqlSession对象
    public static void myClose(SqlSession session){
        if (session!=null){
            session.close();
            //必须加
            t.remove();
        }
    }
}
