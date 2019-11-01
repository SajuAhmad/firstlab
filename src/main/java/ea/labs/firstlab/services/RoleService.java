package ea.labs.firstlab.services;

import ea.labs.firstlab.domains.Role;

import java.util.List;

public interface RoleService {
    public Role get(Integer id);
    public List<Role> findAll();
}
