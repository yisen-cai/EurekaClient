package top.yisen.client.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Service
@FeignClient(name = "client")
public interface ProductClient {

    @PostMapping("/msg")
    String productMsg(@RequestBody Map map);

    @GetMapping("/hello/{id}")
    String sayHello(@PathVariable("id") Integer id);
}
