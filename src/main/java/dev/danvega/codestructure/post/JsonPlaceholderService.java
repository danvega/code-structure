package dev.danvega.codestructure.post;

import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

interface JsonPlaceholderService {

    @GetExchange("/posts")
    List<Post> findAll();

}
