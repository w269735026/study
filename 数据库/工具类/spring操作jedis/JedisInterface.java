package com.wwl.util.jedis;
/**
 * redis接口类方法
 * @author Administrator
 *
 */
public interface JedisInterface {
	/**
	 * 添加String数据类型
	 * @param key
	 * @param value
	 * @return
	 */
	String set(String key, String value);
	/**
	 * 获取String数据类型
	 * @param key
	 * @return
	 */
	String get(String key);
	/**
	 * 检查给定 key是否存在，存在返回 1 ，否则返回 0 
	 * @param key
	 * @return
	 */
	Boolean exists(String key);
	/**
	 * 给定 key 设置生存时间，当 key 过期时(生存时间为 0 )，它会被自动删除
	 * @param key
	 * @param seconds 单位:秒
	 * @return
	 */
	Long expire(String key, int seconds);
	/**
	 * 以秒为单位返回 key 的剩余过期时间
	 * @param key
	 * @return
	 */
	Long ttl(String key);
	/**
	 * 对存储在指定key的数值执行原子的加1操作
	 * @param key
	 * @return
	 */
	Long incr(String key);
	/**
	 * 为哈希表（散列类型）中的字段赋值
	 * @param key   键
	 * @param field 值中的key
	 * @param value 值
	 * @return
	 */
	Long hset(String key, String field, String value);
	/**
	 * 取数据类型（散列类型）哈希表的值
	 * @param key
	 * @param field
	 * @return
	 */
	String hget(String key, String field);
	/**
	 * 删除数据类型哈希表（散列类型）
	 * @param key
	 * @param field 可变参数   可以数组
	 * @return
	 */
	Long hdel(String key, String... field);
}
