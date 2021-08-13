package com.wzw.feign;

import com.wzw.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author wei
 * @Date 2021/8/13
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {

    @GetMapping("/provider/findAll")
    public Collection<Student> findAll();

    @GetMapping("/provider/findById/{id}")
    public Student findById(@PathVariable("id") Integer id);

    @PostMapping("/provider/save")
    public void save(@RequestBody Student student);

    @PutMapping("/provider/update")
    public void update(@RequestBody Student student);

    @DeleteMapping("/provider/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id);
}
