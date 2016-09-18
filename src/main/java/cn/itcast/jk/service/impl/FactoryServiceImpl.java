package cn.itcast.jk.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.jk.dao.FactoryDao;
import cn.itcast.jk.domain.Factory;
import cn.itcast.jk.service.FactoryService;

@Service
public class FactoryServiceImpl implements FactoryService {

	@Autowired
	FactoryDao factoryDao;

	public List<Factory> find(Map paraMap) {
		return factoryDao.find(paraMap);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.itcast.jk.service.FactoryService#get(java.io.Serializable)
	 */
	public Factory get(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insert(Factory entity) {
		factoryDao.insert(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.itcast.jk.service.FactoryService#update(cn.itcast.jk.domain.Factory)
	 */
	public void update(Factory entity) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.itcast.jk.service.FactoryService#deleteById(java.io.Serializable)
	 */
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.itcast.jk.service.FactoryService#delete(java.io.Serializable[])
	 */
	public void delete(Serializable[] ids) {
		// TODO Auto-generated method stub

	}

}
