package com.yale.demo.service;

import com.yale.demo.entity.Article;
import com.yale.demo.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yale
 */
@Service
public class ArticleService {

    @Autowired
    private  ArticleMapper articleMapper;

    public List<Article> findList(){
        return articleMapper.findList();
    }
}
