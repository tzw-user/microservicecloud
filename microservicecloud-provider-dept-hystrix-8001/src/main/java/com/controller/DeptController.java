package com.controller;

import com.entity.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 谭志为 on 2019/2/16.
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping(value = "/dept/add")
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @GetMapping(value = "/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept =  this.deptService.get(id);
        if(null == dept)
        {
            throw new RuntimeException("该ID："+id+"没有没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id)
    {
        Dept dept=new Dept();
        dept.setDeptno(id);
        dept.setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand");
        dept.setDb_source("no this database in MySQL");
        return dept;
    }


    @GetMapping(value = "/dept/list")
    public List<Dept> get() {
        return deptService.list();
    }

}
