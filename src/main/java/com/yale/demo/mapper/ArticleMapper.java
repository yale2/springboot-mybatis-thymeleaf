package com.yale.demo.mapper;

import com.yale.demo.entity.Article;

import java.util.List;

/**
 * @author yale
 */
public interface ArticleMapper {

    List<Article> findList();
}
