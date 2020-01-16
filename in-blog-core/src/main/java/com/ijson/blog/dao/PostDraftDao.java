package com.ijson.blog.dao;

import com.ijson.blog.dao.entity.PostDraftEntity;

/**
 * desc:
 * version: 6.7
 * Created by cuiyongxu on 2020/1/15 12:01 PM
 */
public interface PostDraftDao {

    PostDraftEntity createOrUpdate(PostDraftEntity entity);

    PostDraftEntity find(String id);

    PostDraftEntity findByShamIdInternal(String ename, String shamId);

}