package cn.itcast.jk.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: BaseDao 
 * @Description: ������dao
 * @author zhangkui
 * @date 2016��7��11�� ����2:01:57
 * @param <T>
 */
public interface BaseDao<T> {

	/**
	 * ��ѯ
	* @Title: find 
	* @param params
	* @return  ����˵�� 
	* @return List<T>    �������� 
	* @throws
	 */
	public List<T> find(@SuppressWarnings("rawtypes") Map params);
	/**
	 * ����������ѯ
	* @Title: get 
	* @param pk
	* @return  ����˵�� 
	* @return T    �������� 
	* @throws
	 */
	public T get(Serializable pk);
	/**
	 * add
	* @Title: insert 
	* @param entity  ����˵�� 
	* @return void    �������� 
	* @throws
	 */
	public void insert(T entity);
	/**
	 * update
	* @Title: update 
	* @param entity  ����˵�� 
	* @return void    �������� 
	* @throws
	 */
	public void update(T entity);
	/**
	 * ��������ɾ��
	* @Title: deleteById 
	* @param pk  ����˵�� 
	* @return void    �������� 
	* @throws
	 */
	public void deleteById(Serializable pk);
	/**
	 * ������������ɾ��
	* @Title: batchDelete 
	* @param pks  ����˵�� 
	* @return void    �������� 
	* @throws
	 */
	public void batchDelete(Serializable[] pks);
}
