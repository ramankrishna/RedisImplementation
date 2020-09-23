package com.Model;


import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@RedisHash("text")
public class TextModel implements Serializable {

    @Indexed String id;
    String text;

    @Override
    public String toString() {
        return "TextModel{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                '}';
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
