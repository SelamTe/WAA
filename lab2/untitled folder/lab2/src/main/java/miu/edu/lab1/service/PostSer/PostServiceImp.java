package miu.edu.lab1.service.PostSer;

import miu.edu.lab1.domain.Post;
import miu.edu.lab1.repository.Postpackeg.PostRepo;
import miu.edu.lab1.service.PostSer.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImp  implements PostService {

    @Autowired
    public PostRepo postRepo;
    @Override
    public List<Post> getAllPost() {
        return postRepo.getAllPost();
    }

    @Override
    public void addPost(Post p) {
        postRepo.addPost(p);
    }

    @Override
    public Post getById(int id) {
        return postRepo.getById(id);
    }
}
