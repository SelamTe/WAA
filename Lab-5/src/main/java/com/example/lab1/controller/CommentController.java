package com.example.lab1.controller;

import antlr.collections.List;
import com.example.lab1.domain.Comment;
import com.example.lab1.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping
    public List<Comment> getComments() {
       return comment Service.getComments();
    }


}
