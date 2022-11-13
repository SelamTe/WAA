package miu.edu.lab1.service.UserSer;

import miu.edu.lab1.domain.Post;
import miu.edu.lab1.domain.User;

import java.util.List;

public interface UseInteface {
    List<User> getAll();
    User findViaId(Long id);
    User Addnew(User user);
    List<Post> ViaByFor (Long id);

}
