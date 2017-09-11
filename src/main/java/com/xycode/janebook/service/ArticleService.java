package com.xycode.janebook.service;

import com.xycode.janebook.mapper.TArticleMapper;
import com.xycode.janebook.model.TArticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    TArticleMapper articleMapper;

    public String addArticle(TArticle article){
        if(articleMapper.insertSelective(article)>0){
            return "success";
        }else{
            return "failed";
        }
    }

    public String delArticle(Integer id){
        if(articleMapper.deleteByPrimaryKey(id)>0){
            return "success";
        }else{
            return "failed";
        }
    }

    public String updateArticle(TArticle article){
        if(articleMapper.updateByPrimaryKeySelective(article)>0){
            return "success";
        }else{
            return "failed";
        }
    }

    public TArticle findArticle(Integer id){
        return articleMapper.selectByPrimaryKey(id);
    }

    public List<TArticle> findAnyArticle(Integer offset, Integer limit){
        return null;
    }
}
