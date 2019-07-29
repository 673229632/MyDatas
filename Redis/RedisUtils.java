package com.ustcsoft.pdqc.newweb.statistical.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ustcsoft.pdqc.newweb.shiyanshijiancha.form.ShiyanshiJianchaForm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.*;

public class RedisUtils {

    private static final Logger logger = LoggerFactory.getLogger(RedisUtils.class);

    private static final JedisPool jedisPool = new JedisPool();

    /**
     * 返回hash中指定存储位置的值
     *
     * @param key
     * @param fieid
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> T hget(String key, String fieid, T obj) {
        Jedis jedis = null;
        try {
            logger.info("hget >> key+fieid:{}", key + "+" + fieid);
            jedis = jedisPool.getResource();
            String hget = jedis.hget(key, fieid);
            ObjectMapper om = new ObjectMapper();
            T t = (T) om.readValue(hget, obj.getClass());
            return t;
        } catch (Exception e) {
            logger.error("Jedis hget 异常: " + e.getMessage());
            return null;
        } finally {
            closeRedis(jedis);
        }
    }


    /**
     * 获取hash中value的集合,指定返回的集合类型
     *
     * @param key
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> List<T> hvals(String key, T obj) {
        Jedis jedis = null;
        try {
            logger.info("hvals >> key:{}", key);
            jedis = jedisPool.getResource();
            List<String> hvals = jedis.hvals(key);
            Iterator<String> iterator = hvals.iterator();
            List<T> returnList = new ArrayList<>();
            ObjectMapper om = new ObjectMapper();
            while (iterator.hasNext()) {
                String next = iterator.next();
                T t = (T) om.readValue(next, obj.getClass());
                returnList.add(t);
            }
            return returnList;
        } catch (Exception e) {
            logger.error("Jedis hvals fail >> e:{}", e.getMessage());
            return null;
        } finally {
            closeRedis(jedis);
        }
    }

    /**
     * 以Map的形式返回hash中的存储和值
     *
     * @param key
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> Map<String, T> hgetAll(String key, T obj) {
        Jedis jedis = null;
        try {
            logger.info("hget >> key+obj:{}", key + "+" + obj);
            jedis = jedisPool.getResource();
            Map<String, String> map = jedis.hgetAll(key);
            Map<String, T> returnMap = new HashMap<>();
            ObjectMapper om = new ObjectMapper();
            for (Map.Entry<String, String> e : map.entrySet()) {
                T t = (T) om.readValue(e.getValue(), obj.getClass());
                returnMap.put(e.getKey(), t);
            }
            return returnMap;
        } catch (Exception e) {
            logger.error("Jedis hget fail >> e:{}" + e.getMessage());
            return null;
        } finally {
            closeRedis(jedis);
        }
    }

    /**
     * 关闭jedis连接池
     *
     * @param jedis
     */
    private static void closeRedis(Jedis jedis) {
        if (jedis != null) {
            try {
                jedis.close();
            } catch (Exception e) {
                logger.error("Jedis关闭异常" + e.getMessage());
            }
        }
    }

    // 测试主函数
    public static void main(String[] args) {

        //调用hget方法
        ShiyanshiJianchaForm demoDTO = hget("key", "fieid", new ShiyanshiJianchaForm());

        //调用hvals方法
        List<ShiyanshiJianchaForm> demoListDTOS = hvals("key", new ShiyanshiJianchaForm());

        //调用hgetAll方法
        Map<String, ShiyanshiJianchaForm> stringDemoDTOMap = hgetAll("key", new ShiyanshiJianchaForm());
    }
}
