package com.service;

import com.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Created by 谭志为 on 2019/2/19.
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @PostMapping(value = "/dept/add")
    public boolean add(Dept dept);

    @GetMapping(value = "/dept/get/{id}")
    public Dept    get(@PathVariable("id") Long id);

    @GetMapping(value = "/dept/list")
    public List<Dept> list();
}
