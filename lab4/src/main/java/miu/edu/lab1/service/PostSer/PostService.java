package miu.edu.lab1.service.PostSer;

import miu.edu.lab1.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Comment;
import java.util.List;

public interface PostService {

    List<Post> getAllPost();
    void addPost(Post p);
    Post getById(int id);


    List<Comment> getPostWithComments(long id);
}




