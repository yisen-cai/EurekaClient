package top.yisen.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import top.yisen.client.client.ProductClient;

import java.util.Map;

@Slf4j
@RestController
public class ClientController {

    @Autowired
    private ProductClient productClient;

    @PostMapping("/getInfo")
    public String getInfo(@RequestBody Map map) {
        String response = productClient.productMsg(map);
        return response;
    }

}
