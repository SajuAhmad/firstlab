package ea.labs.firstlab.services.impl;

import ea.labs.firstlab.domains.User;
import ea.labs.firstlab.repositories.UserRepo;
import ea.labs.firstlab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }
}
