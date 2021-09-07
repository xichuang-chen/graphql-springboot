package com.tw.graphql.dto;

import lombok.Data;

@Data
public class Author {
    private int id;
    private String name;
    private Honor honor;
}
