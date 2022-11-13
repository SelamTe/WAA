package miu.edu.lab1.controller;

import miu.edu.lab1.domain.Post;
import miu.edu.lab1.service.PostSer.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = {"http://localhost:8080"})
public class PostControler {
    @Autowired
    PostService postService;

    @ResponseStatus(HttpStatus.OK)

    @PostMapping(value = "/posts")
    public void save(@RequestBody Post post){
        postService.addPost(post);

    }

    @GetMapping("/post/{id}")
    public Post getPostById(@PathVariable("id") int id){
        return postService.getById(id);
    }

    @GetMapping("/posts")
    List <Post> getallpost(){
        return postService.getAllPost();
    }


}
