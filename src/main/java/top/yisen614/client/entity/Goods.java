package top.yisen614.client.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;

//import lombok.Data;

/**
 * Created by 蔡宜身
 * 2018/09/07
 */
@Data
@Entity
@Table(name = "t_goods")
public class Goods {
	@Id
	@GenericGenerator(name = "user-uuid", strategy = "uuid")
	@GeneratedValue(generator = "user-uuid")
	@Column(columnDefinition = "char(32)")
	private String goodsId;
	private String goodsName;
	private String goodsInfo;
	private Integer goodsPrice;
	private String goodsAvatar;
	private Timestamp createTime;
	private Timestamp updateTime;
	private Integer status;
}
