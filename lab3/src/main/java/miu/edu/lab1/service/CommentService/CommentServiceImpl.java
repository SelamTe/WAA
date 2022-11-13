package miu.edu.lab1.service.CommentService;

import miu.edu.lab1.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;
import java.util.List;

@Service
public class CommentServiceImpl {
    @Autowired
    CommentRepo commentRepo;

    @Override
    public void addComment(Comment comment) {
        commentRepo.save(comment);

    }
    @Override
    public List<Comment> getAll(){
        return commentRepo.findAll();
    }
}
