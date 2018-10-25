package top.yisen.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yisen.client.Result;

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
