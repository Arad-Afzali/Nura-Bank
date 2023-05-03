package ir.nura_bank.controller;

import ir.nura_bank.domain.Account;
import ir.nura_bank.domain.Role;
import ir.nura_bank.domain.User;
import ir.nura_bank.service.AccountService;
import ir.nura_bank.service.RoleService;
import ir.nura_bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping(path = "/")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;
    private final RoleService roleService;
    private final AccountService accountService;

    @GetMapping
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @GetMapping("signup")
    public ModelAndView signup() {
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }

    @PostMapping("signup")
    public ModelAndView performSignup(ModelAndView modelAndView) {
        if (userService.existsByEmail((String) modelAndView.getModel().get("email")) || userService.existsBySsn((String) modelAndView.getModel().get("id")))
            return new ModelAndView("signup_failed");
        User newUser = new User();
        Account newAccount = accountService.getNewAccount();
        newAccount = accountService.save(newAccount);
        newUser.setAccount(newAccount);
        newUser.setEmail((String) modelAndView.getModel().get("email"));
//       newUser.setDateOfBirth((LocalDate) modelAndView.getModel().get("fname"));
        newUser.setFirstName((String) modelAndView.getModel().get("fname"));
        newUser.setLastName((String) modelAndView.getModel().get("lname"));
        newUser.setPassword((String) modelAndView.getModel().get("password"));
        newUser.setSsn((String) modelAndView.getModel().get("id"));
        Set<Role> role = new HashSet<>();
        role.add(roleService.findByName("USER"));
        newUser.setRoles(role);
        userService.save(newUser);
        return new ModelAndView("index");
    }

    @GetMapping("login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @GetMapping("/login-failed")
    public ModelAndView loginFailed() {
        ModelAndView modelAndView = new ModelAndView("login_failed");
        return modelAndView;
    }


}
