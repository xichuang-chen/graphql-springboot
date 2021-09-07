package com.tw.graphql.dto;

import lombok.Data;

import java.util.List;

@Data
public class Honor {
    private int count;
    private List<String> details;
}
