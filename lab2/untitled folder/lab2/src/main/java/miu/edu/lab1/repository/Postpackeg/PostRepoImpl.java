package miu.edu.lab1.repository.Postpackeg;

import miu.edu.lab1.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PostRepoImpl implements PostRepo {

   static List<Post> posts;


    static{
        posts = new ArrayList<>();
        Post post1 = new Post(1," Rozan selen","love story","Siku");
        Post post2 = new Post(2," fikrin kinatin","true story","Selam");
        Post post3 = new Post(3," how to cook","tutorial","Dani");

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

    }







    @Override
    public List<Post> getAllPost() {
        return posts;
    }

    @Override
    public void addPost(Post p) {
    posts.add(p);
    }

    @Override
    public Post getById(int id) {
        return posts.stream().filter(p->p.getId()==id).findFirst().orElse(null);
    }
}
