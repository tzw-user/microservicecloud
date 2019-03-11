package com.service;

import com.entity.Dept;

import java.util.List;

/**
 * Created by 谭志为 on 2019/2/16.
 */
public interface DeptService {

    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();

}
