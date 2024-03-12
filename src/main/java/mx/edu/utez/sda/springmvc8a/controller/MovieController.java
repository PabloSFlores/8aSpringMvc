package mx.edu.utez.sda.springmvc8a.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
    @Secured("ROLE_ADULT")
    @GetMapping("/movie/accion")
    public String actionIndex() {
        return "movie/accion";
    }

    @Secured("ROLE_ADULT")
    @GetMapping("/movie/terror")
    public String terrorView() {
        return "movie/terror";
    }

    @Secured("ROLE_ADULT")
    @GetMapping("/movie/documental")
    public String documentalView() {
        return "movie/documental";
    }

    @Secured({"ROLE_ADULT", "ROLE_CHILD"})
    @GetMapping("/movie/animada")
    public String animadaView() {
        return "movie/animada";
    }

    @Secured({"ROLE_ADULT", "ROLE_CHILD"})
    @GetMapping("/movie/comedia")
    public String comediaView() {
        return "movie/comedia";
    }

    @Secured({"ROLE_ADULT", "ROLE_CHILD"})
    @GetMapping("/movie/educativa")
    public String educativaView() {
        return "movie/educativa";
    }
}
