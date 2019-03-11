package com.dao;

import com.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 谭志为 on 2019/2/16.
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
