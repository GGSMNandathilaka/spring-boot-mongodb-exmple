package com.sparawhawk.mongodb.springbootmongodbexmple.resource;

import com.sparawhawk.mongodb.springbootmongodbexmple.document.Users;
import com.sparawhawk.mongodb.springbootmongodbexmple.repository.UsersRepository;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
    private UsersRepository usersRepository;

    public UsersResource(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Users> getUser(@PathVariable("id") Integer id){
        return usersRepository.findById(id);
    }

    @GetMapping("/city/{city}")
    public List<Users> getUsersByAddress(@PathVariable("city") String city)
    {
        return usersRepository.findByCity(city);
    }

    @PostMapping("/")
    public void saveUsers(@RequestBody List<Users> users){
        usersRepository.saveAll(users);
    }
}
