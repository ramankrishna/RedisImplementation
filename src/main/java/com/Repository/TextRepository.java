package com.Repository;

import com.Model.TextModel;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class TextRepository {

    private HashOperations hashOperations;
    private RedisTemplate redisTemplate;

    public TextRepository(RedisTemplate redisTemplate){
        this.hashOperations=redisTemplate.opsForHash();
        this.redisTemplate = redisTemplate;
    }

    public void saveText(TextModel text){
        hashOperations.put("TEXT",text.getId(),text);
    }

    public TextModel findbyId(String id){
        return (TextModel) hashOperations.get("TEXT",id);
    }

}
