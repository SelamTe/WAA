package miu.edu.lab1.controller;

import miu.edu.lab1.service.CommentService.CommentService;
import miu.edu.lab1.service.PostSer.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.events.Comment;
import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    @Autowired
    CommentService commentService;

    @Autowired
    PostService postSerice;

    @GetMapping
    public List<Comment> getComments(){
        return commentService.getAll();
    }

    @GetMapping("/{id}/posts")
    public List<Comment> getComments(@PathVariable("id") long id){
        return postService.getPostWithComments(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Comment comment){
        commentService.addComment((miu.edu.lab1.domain.Comment) comment);
    }


}
