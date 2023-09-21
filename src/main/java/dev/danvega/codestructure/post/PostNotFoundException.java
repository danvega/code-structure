package dev.danvega.codestructure.post;

class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(Integer id) {
        super("Post with id " + id + " not found");
    }
}
