package cn.itcast.jk.dao.imp;

import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;

public class FactoryDaoImp extends BaseDaoImp<Factory> implements FactoryDao{

	//Ĭ�Ϲ��������������ռ�
	public FactoryDaoImp() {
		super.setNs("cn.itcast.jk.mapper.FactoryMapper");
	}
}
