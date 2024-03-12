package mx.edu.utez.sda.springmvc8a.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PeopleController {

    @Secured("ROLE_ADMIN")
    @GetMapping("/people/index")
    public String index() {
        return "people-index";
    }
}
