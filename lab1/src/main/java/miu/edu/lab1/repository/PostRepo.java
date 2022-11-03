package miu.edu.lab1.repository;

import miu.edu.lab1.domain.Post;

import java.util.List;

public interface PostRepo {

    List<Post> getAllPost();
    void addPost(Post p);
    Post getById(int id);
}
