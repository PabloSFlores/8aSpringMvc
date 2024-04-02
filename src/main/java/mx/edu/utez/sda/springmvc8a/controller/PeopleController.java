package mx.edu.utez.sda.springmvc8a.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.ArrayList;

@Controller
public class PeopleController {
    String UNA_VARIABLE_MAL_DECLARADA = "x";

    @Secured("ROLE_ADMIN")
    @GetMapping("/people/index")
    public String index() {
        String x = "";
        while (x != null){
            // hola
        }

        return "people-index";
    }
//    public String index() {
//        return "people-index";
//    }
//    public String index() {
//        return "people-index";
//    }
}
