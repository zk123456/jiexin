package cn.itcast.jk.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: BaseDao 
 * @Description: 基础类dao
 * @author zhangkui
 * @date 2016年7月11日 下午2:01:57
 * @param <T>
 */
public interface BaseDao<T> {

	/**
	 * 查询
	* @Title: find 
	* @param params
	* @return  参数说明 
	* @return List<T>    返回类型 
	* @throws
	 */
	public List<T> find(@SuppressWarnings("rawtypes") Map params);
	/**
	 * 根据主键查询
	* @Title: get 
	* @param pk
	* @return  参数说明 
	* @return T    返回类型 
	* @throws
	 */
	public T get(Serializable pk);
	/**
	 * add
	* @Title: insert 
	* @param entity  参数说明 
	* @return void    返回类型 
	* @throws
	 */
	public void insert(T entity);
	/**
	 * update
	* @Title: update 
	* @param entity  参数说明 
	* @return void    返回类型 
	* @throws
	 */
	public void update(T entity);
	/**
	 * 根据主键删除
	* @Title: deleteById 
	* @param pk  参数说明 
	* @return void    返回类型 
	* @throws
	 */
	public void deleteById(Serializable pk);
	/**
	 * 根据主键批量删除
	* @Title: batchDelete 
	* @param pks  参数说明 
	* @return void    返回类型 
	* @throws
	 */
	public void batchDelete(Serializable[] pks);
}
