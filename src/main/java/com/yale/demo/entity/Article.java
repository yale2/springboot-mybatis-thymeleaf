package com.yale.demo.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author yale
 */
@Data
public class Article {

    private Integer id;
    private String title;
    private String content;
    private LocalDateTime created;
    private LocalDateTime modified;
    private String categories;
    private String tags;
    private int allowComment;
    private String thumbnail;
}
