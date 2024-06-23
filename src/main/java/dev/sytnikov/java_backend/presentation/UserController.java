package dev.sytnikov.java_backend.presentation;

import dev.sytnikov.java_backend.application.user.IUserService;
import dev.sytnikov.java_backend.error_handlers.BadRequest;
import dev.sytnikov.java_backend.error_handlers.ResourceNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @Autowired
    private IUserService _userService;

    @GetMapping
    public List<String> getAll() throws Exception {
//        if (true) {
//            throw new Exception("Don't be an idiot!");
//        }
        return _userService.getAll();
    }

    @GetMapping("/{name}")
    public String getById(@PathVariable String name) {
        if (true) {
            throw new ResourceNotFound("USER NOT FOUND");
        }
        String user = _userService.getAll().stream().filter(u -> name.equals(u)).findFirst().get();
        return user;
    }

    @PostMapping
    public List<String> createName(@RequestBody String name) {
        if (true) {
            throw new BadRequest("USER NOT ADDED");
        }
//        _userService.add(name);
        return null;
    }

}
