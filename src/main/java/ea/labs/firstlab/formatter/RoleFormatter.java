package ea.labs.firstlab.formatter;

import ea.labs.firstlab.domains.Role;
import ea.labs.firstlab.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class RoleFormatter implements Formatter<Role> {
    @Autowired
    RoleService roleService;

    @Override
    public Role parse(String s, Locale locale) throws ParseException {
        System.out.println("-----------" + s);
        System.out.println(roleService.get(Integer.parseInt(s)));
        return roleService.get(Integer.parseInt(s));
    }

    @Override
    public String print(Role role, Locale locale) {
        return null;
    }
}
