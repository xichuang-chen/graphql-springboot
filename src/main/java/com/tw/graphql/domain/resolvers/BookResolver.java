package com.tw.graphql.domain.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.tw.graphql.dto.Author;
import com.tw.graphql.dto.Book;
import org.checkerframework.checker.units.qual.A;
import org.springframework.stereotype.Component;

@Component
public class BookResolver  implements GraphQLQueryResolver{
    public Book bookById(int id) {
        Book book = new Book();
        book.setId(1022);
        book.setName("cxc");
        book.setPageCount(100);
        book.setAuthor(author());
        return book;
    }

    public Author author() {
        Author author = new Author();
        author.setId(295);
        author.setFirstName("hello");
        author.setLastName("graphql");
        return author;
    }
}
