package zavgorodnyaya.spring_boot.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import zavgorodnyaya.spring_boot.service.UserService;

@RequiredArgsConstructor
@Controller
public class WebController {

    private final UserService userService;

    @GetMapping("/")
    public String start(ModelMap modelMap){
        modelMap.addAttribute("users", userService.findAll());
        return "index";
    }

    @GetMapping("/save-user")
    public String save(){
        return "/add-user";
    }


    @GetMapping("/delete-user")
    public String deleteUserById() {
        return "delete-user";
    }

    @GetMapping("/update-user")
    public String update(){
        return "update-user";
    }
}