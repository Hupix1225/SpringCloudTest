package com.hupix.feign;

import com.hupix.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("STUDENT")
public interface StudentClient {

    @GetMapping("/students/queryOne/{no}")
    Student queryOne(@PathVariable("no") String no);
}
