package com.bjtu.redis;

public interface Limit {
    void add(String userId);

    long count(String userId);
}
