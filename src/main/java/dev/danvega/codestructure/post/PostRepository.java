package dev.danvega.codestructure.post;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
class PostRepository {

    private final JsonPlaceholderService jsonPlaceholderService;

    PostRepository(JsonPlaceholderService jsonPlaceholderService) {
        this.jsonPlaceholderService = jsonPlaceholderService;
    }

    List<Post> findAll() {
        return jsonPlaceholderService.findAll();
    }

}
