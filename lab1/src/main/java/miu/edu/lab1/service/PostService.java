package miu.edu.lab1.service;

import miu.edu.lab1.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {

    List<Post> getAllPost();
    void addPost(Post p);
    Post getById(int id);








}




