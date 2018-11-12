package cn.ahjz.mybatis1;


import cn.ahjz.mybatis1.dao.DeptDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by wind on 2018/11/8.
 */
public class MybatisTest {

    public static void main(String[] args) throws Exception {
        //全局配置文件 只有一个
        String resource = "mybatis-config.xml";
        InputStream stream = Resources.getResourceAsStream(resource);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
        System.out.println(build);
//        获取sqlsession对象
        SqlSession session = build.openSession();

        DeptDao deptDao = session.getMapper(DeptDao.class);

        Dept dept = deptDao.selectDept(5);
        System.out.println(dept);
//
//        List<Dept> deptList = deptDao.queryAll("t_dept");
//
//        for (Dept dept : deptList) {
//            System.out.println(dept);
    }
}

