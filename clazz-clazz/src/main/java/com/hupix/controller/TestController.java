package com.hupix.controller;

import com.hupix.entity.Clazz;
import com.hupix.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clazzs")
public class TestController {

    private ClazzService clazzService;

    @Autowired
    public TestController(ClazzService clazzService) {
        this.clazzService = clazzService;
    }

    @GetMapping("/queryAll")
    public Map<String,Object> queryAll() {
        HashMap map = new HashMap();
        List<Clazz> clazzes = clazzService.queryAll();
        map.put("班级信息",clazzes);
        return map;
    }
}
