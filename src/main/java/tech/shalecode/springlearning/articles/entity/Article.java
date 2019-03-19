/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.shalecode.springlearning.articles.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import lombok.Data;

/**
 *
 * @author ariemay
 */

@Entity @Data
public class Article{
    
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @NotNull @NotEmpty
    private String code;
    
    @NotNull @NotEmpty
    private String title;
    
    private String content;
    
}
