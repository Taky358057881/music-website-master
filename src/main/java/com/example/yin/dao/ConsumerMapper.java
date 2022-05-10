package com.example.yin.dao;

import com.example.yin.domain.Consumer;

import java.util.List;

public interface ConsumerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Consumer record);

    int insertSelective(Consumer record);

    Consumer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Consumer record);

    int updateByPrimaryKey(Consumer record);

    int addUser(Consumer consumer);

    List<Consumer> allUser();
}