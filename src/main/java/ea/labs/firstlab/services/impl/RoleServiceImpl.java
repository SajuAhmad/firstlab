package ea.labs.firstlab.services.impl;

import ea.labs.firstlab.domains.Role;
import ea.labs.firstlab.repositories.RoleRepo;
import ea.labs.firstlab.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepo roleRepo;


    @Override
    public Role get(Integer id) {
        return roleRepo.findById(id).get();
    }

    @Override
    public List<Role> findAll() {
        return roleRepo.findAll();
    }
}
