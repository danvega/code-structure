package dev.danvega.codestructure.controller;

import dev.danvega.codestructure.model.Post;
import dev.danvega.codestructure.service.PostService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    public List<Post> findAll() {
        return postService.findAll();
    }
}
