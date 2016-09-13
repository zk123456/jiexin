package cn.itcast.jk.dao.imp;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.jk.dao.BaseDao;

public abstract class BaseDaoImp<T> extends SqlSessionDaoSupport implements BaseDao<T>{

	@Autowired
	//mybatis-spring 1.0无需此方法；mybatis-spring1.2必须注入。
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	private String ns;		//命名空间
	public String getNs() {
		return ns;
	}
	public void setNs(String ns) {
		this.ns = ns;
	}
	
	public List<T> find(@SuppressWarnings("rawtypes") Map params) {
		List<T> list = this.getSqlSession().selectList(ns + ".find", params);
		return list;
	}

	public T get(Serializable pk) {
		return this.getSqlSession().selectOne(ns + ".get", pk);
	}

	public void insert(T entity) {
		this.getSqlSession().insert(ns + ".insert", entity);
	}

	public void update(T entity) {
		this.getSqlSession().update(ns + ".update", entity);
	}

	public void deleteById(Serializable pk) {
		this.getSqlSession().delete(ns + ".deleteById", pk);
	}

	public void batchDelete(Serializable[] pks) {
		this.getSqlSession().delete(ns + ".deletes", pks);
	}

}
