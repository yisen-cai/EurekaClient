package top.yisen.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
public class Controller {

    @PostMapping(value = "/msg")
    public String msg(@RequestBody Map map) {
        return map.get("info").toString();
    }

    @GetMapping(value = "/hello/{id}")
    public String hello(@PathVariable("id") Integer id) {
        return "hello world" + id;
    }
}
