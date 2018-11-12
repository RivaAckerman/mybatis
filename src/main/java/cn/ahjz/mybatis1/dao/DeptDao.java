package cn.ahjz.mybatis1.dao;

import cn.ahjz.mybatis1.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wind on 2018/11/9.
 */
public interface DeptDao {

    public Dept selectDept(int id);

    public List<Dept> queryAll(@Param("tableName") String tableName);

    public void login(@Param("name") String name,@Param("password") String password);
}
