package com.qz.springboot.service;

import com.qz.springboot.entity.Classes;
import com.qz.springboot.mapper.ClassesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {
    @Autowired
    private ClassesMapper classesMapper;

    public void save(Classes classes) {
        classesMapper.insertSelective(classes);
    }
}
