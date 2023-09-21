package dev.danvega.codestructure.post;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }
}
