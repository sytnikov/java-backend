package dev.sytnikov.java_backend.application.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {
    private List<String> _users = new ArrayList<>(
            List.of("Rachel", "Ross", "Chandler", "Monica", "Phoebe")
    );

    @Override
    public List<String> getAll() {
        return _users;
    }
}
