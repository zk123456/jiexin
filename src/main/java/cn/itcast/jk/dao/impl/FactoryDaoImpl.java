package cn.itcast.jk.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;

/**
 * @Description:生产厂家的实现类
 * @Author:	nutony
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014-7-1
 */
@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao {
	//默认构造中设置命名空间
	public FactoryDaoImpl() {
		super.setNs("cn.itcast.jk.mapper.FactoryMapper");
	}
}
