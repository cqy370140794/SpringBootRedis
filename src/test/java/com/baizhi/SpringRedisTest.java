package com.baizhi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SpringRedisTest {

    //为redistemplate创建对象
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testRedisTemplate(){
        //通过redistemplate向redis数据库种插入对应的键值对
        redisTemplate.opsForValue().set("ascas","asfdas");
    }
    @Test
    public void testRedisTemplates(){
        //通过redistemplate向redis数据库种插入对应的键值对
        String ascas = (String) redisTemplate.opsForValue().get("ascas");
        System.out.println(ascas);
    }

    @Test
    public void testRedisTemplatess(){
        //通过redistemplate向redis数据库种插入对应的键值对
        stringRedisTemplate.opsForValue().set("name","校长");
        String name = stringRedisTemplate.opsForValue().get("name");

        System.out.println(name);
    }



}
