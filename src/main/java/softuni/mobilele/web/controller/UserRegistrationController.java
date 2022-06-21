package softuni.mobilele.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import softuni.mobilele.model.dto.UserRegistrationDto;
import softuni.mobilele.service.UserService;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserRegistrationController {
    private final UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String registerUser() {
        return "auth-register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid UserRegistrationDto userRegistrationDto,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("userRegistrationDto", userRegistrationDto);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userModel",
                    bindingResult);
            return "redirect:/users/register";
        }
        this.userService.registerAndLogin(userRegistrationDto);

        return "redirect:/";
    }
}
