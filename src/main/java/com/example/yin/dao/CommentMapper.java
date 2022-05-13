package com.example.yin.dao;

import com.example.yin.domain.Comment;

import java.util.List;

public interface CommentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKey(Comment record);

    int updateCommentMsg(Comment record);

    int deleteComment(Integer id);

    List<Comment> commentOfSongId(Integer songId);

    List<Comment> commentOfSongListId(Integer songListId);
}