package com.yale.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yale.demo.entity.Article;
import com.yale.demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author yale
 */
@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("listArticles")
    public String listArticles(Model model,
                               @RequestParam(value = "pageNum", defaultValue = "1", required = false) Integer pageNum,
                               @RequestParam(value = "pageSize", defaultValue = "2", required = false) Integer pageSize) {
        if (null == pageNum || pageNum <= 0) {
            pageNum=1;
        }
        if (null == pageSize || pageSize <= 0) {
            pageNum=2;
        }
        System.out.println("当前页是："+pageNum+"显示条数是："+pageSize);
        try{
            PageHelper.startPage(pageNum,pageSize);
            List<Article> articles = articleService.findList();
            PageInfo<Article> pageInfo=new PageInfo<>(articles,pageSize);
            model.addAttribute("pageInfo",pageInfo);
            model.addAttribute("articles", articles);
        }finally {
            PageHelper.clearPage();
        }

        return "client/index";
    }
}
