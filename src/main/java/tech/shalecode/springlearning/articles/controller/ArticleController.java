/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.shalecode.springlearning.articles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.shalecode.springlearning.articles.dao.DaoArticles;
import tech.shalecode.springlearning.articles.entity.Article;

/**
 *
 * @author ariemay
 */

@RestController @RequestMapping("/api/article")
public class ArticleController {
    @Autowired 
    private DaoArticles daoArticles;
    
    @GetMapping("/")
    public Page<Article> findArticles(Pageable page) {
        return daoArticles.findAll(page);
    }
    
}
