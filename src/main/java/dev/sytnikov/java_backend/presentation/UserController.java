package dev.sytnikov.java_backend.presentation;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private List<String>_users = new ArrayList<>(
                List.of("Rachel", "Ross", "Chandler", "Monica", "Phoebe")
            );

    @GetMapping
    public List<String> getAll() {
        return _users;
    }

    @GetMapping("/{name}")
    public String getById(@PathVariable String name) {
        String user = _users.stream().filter(u -> name.equals(u)).findFirst().get();
        return user;
    }

    @PostMapping
    public List<String> createName(@RequestBody String name) {
        _users.add(name);
        return _users;
    }

}
