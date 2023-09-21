package dev.danvega.codestructure.service;

import dev.danvega.codestructure.model.Post;
import dev.danvega.codestructure.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
        return List.of(new Post(1,1,"First Post Title","First Post Body"));
    }
}
