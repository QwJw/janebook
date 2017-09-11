package com.xycode.janebook.controller;

import com.xycode.janebook.model.TArticle;
import com.xycode.janebook.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class ArticleController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/article/")
    public String addArticle(@RequestBody  TArticle article){
        return articleService.addArticle(article);
    }

    @GetMapping("/article/{id}")
    public TArticle getArticle(@PathVariable("id") Integer id){
        return articleService.findArticle(id);
    }

    //?limit=10：指定返回记录的数量
    //?offset=10：指定返回记录的开始位置。
    @GetMapping("/articles")
    public List<TArticle> getArticles(Integer offset, Integer limit){
        return articleService.findAnyArticle(offset, limit);
    }


    @PutMapping("/article")
    public String updateArticle(@RequestBody TArticle article){
        return articleService.updateArticle(article);
    }

    @DeleteMapping("/article/{id}")
    public String delArticle(@PathVariable Integer id){
        return articleService.delArticle(id);
    }



}
