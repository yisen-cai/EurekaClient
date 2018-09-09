package top.yisen614.client.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.yisen614.client.entity.Goods;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoodsRepositoryTest {

	@Autowired
	private GoodsRepository goodsRepository;

	@Test
	public void findByStatus() {
		List<Goods> goods = goodsRepository.findByStatus(0);
		goods.forEach(goods1 -> System.out.println(goods1));
	}

	@Test
	public void insertOne() {
		Goods goods = new Goods();
		goods.setCreateTime(new Timestamp(new Date().getTime()));
		goods.setUpdateTime(new Timestamp(new Date().getTime()));
		goods.setGoodsAvatar("2.jpg");
		goods.setGoodsInfo("点心");
		goods.setGoodsName("曲奇");
		goods.setGoodsPrice(10);
		goods.setStatus(0);
		Goods goods1 = goodsRepository.save(goods);
		System.out.println(goods1);
	}
}