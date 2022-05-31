package com.example.yin.dao;

import com.example.yin.domain.RankList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RankListMapper {

    int deleteByPrimaryKey(Long id);

    int insert(RankList record);

    int insertSelective(RankList record);

    RankList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RankList record);

    int updateByPrimaryKey(RankList record);

    /**
     * 查总分
     * @param songListId
     * @return
     */
    int selectScoreSum(Long songListId);

    /**
     * 查总评分人数
     * @param songListId
     * @return
     */
    int selectRankNum(Long songListId);

    /**
     * 查制定用户评分
     * @param consumerId
     * @param songListId
     * @return
     */
    int selectUserRank(@Param("consumerId") Long consumerId, @Param("songListId")  Long songListId);
}