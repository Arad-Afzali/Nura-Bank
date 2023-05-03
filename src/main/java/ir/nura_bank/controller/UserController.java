package ir.nura_bank.controller;

import ir.nura_bank.service.AccountService;
import ir.nura_bank.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

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

        modelAndView.getModel().get("email")


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
