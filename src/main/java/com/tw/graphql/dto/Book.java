package com.tw.graphql.dto;

import lombok.Data;

@Data
public class Book {
    private int id;
    private String name;
    private int pageCount;
    private Author author;
}
