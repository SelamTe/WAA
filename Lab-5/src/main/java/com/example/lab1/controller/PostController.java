package com.example.lab1.controller;

import antlr.collections.List;
import com.example.lab1.domain.Comment;
import com.example.lab1.domain.Post;
import com.example.lab1.service.CommentService;
import com.example.lab1.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@CrossOrigin("https://localhost:3000")
public class PostController {
    @Autowired
    PostService postService;

    @Autowired
    CommentService commentService;

    @GetMapping
    public List<Post> getPosts() {
        return postService.findAll();
    }





    @GetMapping("/{id}/comments")
    public List<Post> getPosts(@PathVariable long id){
        return postService.findAll();
    }

    @PostMapping
    public void save(@RequestBody Post p) {
        postService.save(p);
    }

    @GetMapping("/filter/{title}")
    public List<Post> findAllByTitle(@PathVariable String title) {
        return postService.findAllByTitle(title);
    }

    @PostMapping("/addComment")
    public void addComment(@RequestBody Comment c) {
        commentService.save(c);
    }

}
