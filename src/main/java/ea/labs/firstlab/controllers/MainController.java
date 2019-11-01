package ea.labs.firstlab.controllers;

import ea.labs.firstlab.domains.User;
import ea.labs.firstlab.services.RoleService;
import ea.labs.firstlab.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @GetMapping({"/", "/login"})
    public String login() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String registration(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("roles", roleService.findAll());
        return "registration";
    }

    @PostMapping("/save_user")
    public String saveUser(User user) {
        user.setActive(true);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userService.save(user);
        return "redirect:/register";
    }
}
