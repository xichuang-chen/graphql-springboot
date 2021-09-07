package com.tw.graphql.bookdetails;

import com.alibaba.fastjson.JSONObject;
import com.tw.graphql.dto.Author;
import com.tw.graphql.dto.Book;
import com.tw.graphql.dto.Honor;
import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GraphQLDataFetchers {
    public DataFetcher getBookByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String bookId = dataFetchingEnvironment.getArgument("id");
            List<Book> books = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                Book book = new Book();
                book.setId(1022 + i);
                book.setPageCount(33 + i);
                book.setName("cxc" + i);
                books.add(book);
            }
            return books;
        };
    }

    public DataFetcher getAuthorDataFetcher() {
        return dataFetchingEnvironment -> {
            String name = dataFetchingEnvironment.getArgument("name");
            JSONObject source = (JSONObject) JSONObject.toJSON(dataFetchingEnvironment.getSource());
            System.out.println(source);
            Author author = new Author();
            author.setName(name);
            author.setId((Integer) source.get("id"));
            return author;
        };
    }

    public DataFetcher getHonorDataFetcher() {
        return dataFetchingEnvironment -> {
            JSONObject source = (JSONObject) JSONObject.toJSON(dataFetchingEnvironment.getSource());
            Honor honor = new Honor();
            honor.setCount(2);
            honor.setDetails(Arrays.asList("Gold", "Silver"));
            return honor;
        };
    }
}
