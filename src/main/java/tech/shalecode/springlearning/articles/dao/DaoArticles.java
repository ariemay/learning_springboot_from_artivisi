/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.shalecode.springlearning.articles.dao;

import java.awt.print.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import tech.shalecode.springlearning.articles.entity.Article;


/**
 *
 * @author ariemay
 */

public interface DaoArticles extends PagingAndSortingRepository<Article, String> {
}
