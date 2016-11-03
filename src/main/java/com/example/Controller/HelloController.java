package com.example.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.*;


@RestController
public class HelloController {

    @CrossOrigin
    @RequestMapping("/hello")
    public Map<String, String> index() {
        Map<String, String> map = new HashMap<>();
        map.put("123","123");
        map.put("223","223");
        map.put("323","323");
        map.put("423","423");
        return map;
    }
}
