package cn.yiyang.common.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基础Dao(还需在XML文件里，有对应的SQL语句)
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年9月18日 上午9:31:36
 */
public interface BaseDao<T> {

	int save(T t);

	void save(Map<String, Object> map);

	void saveBatch(List<T> list);

	int update(T t);

	int update(Map<String, Object> map);

	int delete(Object id);

	int delete(Map<String, Object> map);

	int deleteBatch(Object[] id);

	T queryObject(Object id);
	
	List<T> queryList(Map<String, Object> map);
   
	List<T> queryListArea(Map<String, Object> map);
	
	List<T> queryList(HashMap<Object, Object> hashMap);

	public List<T> queryListForPhone(Map<String, Object> map);

	int queryTotal(Map<String, Object> map);
	
	int queryTotalSchool(Map<String, Object> map);
	
	
	int queryTotalList(Map<String, Object> map);
	
	int queryTotal();

	List<T> querList();

	List<T> selectRecommend(Map<String, Object> map);

	List<T> selectRecommendBuy(Map<String, Object> map);
	
}
