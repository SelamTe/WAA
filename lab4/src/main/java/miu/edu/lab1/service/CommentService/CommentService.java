package miu.edu.lab1.service.CommentService;

import miu.edu.lab1.domain.Comment;

import java.util.List;

public interface CommentService {

    void addComment(Comment comment);
    List<Comment>getAll();
}
