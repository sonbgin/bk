package com.bk.service;

import com.bk.entity.Comment;

import java.util.List;

/**
 * @author songbin
 * @date 2020/10/17
 */
public interface CommentService {

    List<Comment> listComment(int blogId);

    int saveComment(Comment comment);

}
