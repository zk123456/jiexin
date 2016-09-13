package cn.itcast.jk.dao.imp;

import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;

public class FactoryDaoImp extends BaseDaoImp<Factory> implements FactoryDao{

	//默认构造中设置命名空间
	public FactoryDaoImp() {
		super.setNs("cn.itcast.jk.mapper.FactoryMapper");
	}
}
