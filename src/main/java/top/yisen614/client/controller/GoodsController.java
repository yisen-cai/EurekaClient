package top.yisen614.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yisen614.client.Result;

/**
 * Created by 蔡宜身
 * 2018/09/07
 */
@RestController
public class GoodsController {

	@GetMapping(value = "/")
	public Result getGoodList() {
		return null;
	}
}
