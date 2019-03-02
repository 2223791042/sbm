package mr.s.sbm.controller;

import mr.s.sbm.entity.User;
import mr.s.sbm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("user")
    public String user(User user, Model model){
        userService.saveUser(user);
        model.addAttribute("user", user);
        return "user-detail";
    }
}
