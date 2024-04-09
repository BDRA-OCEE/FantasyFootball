package Module3Project.FantasyFootball.Auth_User;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserRepository userRepository;
    private UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "auth/UserLogin";
    }

    @GetMapping("/logout")
    public String logout() {
        return "auth/UserLogout";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("userDTO", new UserDTO());
        return "auth/UserRegister";
    }

    @PostMapping("/submit")
    public String submitUser(@Valid UserDTO userDTO, BindingResult bindingResult, Model model){
        return userService.submit(userDTO, bindingResult, model);
    }
}
