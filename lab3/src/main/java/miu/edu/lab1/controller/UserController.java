package miu.edu.lab1.controller;

import miu.edu.lab1.domain.User;
import miu.edu.lab1.service.UserSer.UserClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = {"http://localhost:8080"})
public class UserController {


  private UserClass aClass;
@Autowired
public UserController(UserClass aClass) {
        this.aClass = aClass;
    }


    @PostMapping(value = "/users")
    public void save(@RequestBody User post){
        aClass.Addnew(post);

    }

    @GetMapping("/users/{id}")
    public User getPostById(@PathVariable("id") Long id){
        return aClass.findViaId(id);
    }


}
