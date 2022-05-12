package com.example.yin.dao;

import com.example.yin.domain.Collect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollectMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);

    int existSongId(@Param("userId") Integer userId, @Param("songId") Integer songId);

    int deleteCollect(@Param("userId") Integer userId, @Param("songId") Integer songId);

    List<Collect> collectionOfUser(Integer userId);
}