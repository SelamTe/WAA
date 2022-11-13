package miu.edu.lab1.service.UserSer;

import miu.edu.lab1.domain.Post;
import miu.edu.lab1.domain.User;
import miu.edu.lab1.repository.UserRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserClass implements UseInteface{

    private UserRepostory  userRepostory;

@Autowired
    public UserClass(UserRepostory userRepostory) {
        this.userRepostory = userRepostory;
    }



    @Override
    public List<User> getAll() {
        return userRepostory.findAll();
    }

    @Override
    public User findViaId(Long id) {
        return userRepostory.findById(id).get();
    }

    @Override
    public User Addnew(User user) {
        return userRepostory.save(user);
    }

    @Override

    public List<Post> ViaByFor(Long id) {
    var temp = userRepostory.findById(id).get();
    var temp2=temp.getPosts();
    return temp2;

    }
}
