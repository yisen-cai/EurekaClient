package top.yisen614.client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.yisen614.client.entity.Goods;

import java.util.List;

/**
 * Created by 蔡宜身
 * 2018/09/07
 */

public interface GoodsRepository extends JpaRepository<Goods, String> {
	List<Goods> findByStatus(Integer status);
}
