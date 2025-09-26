package com.tpo.bbdd.tpo_bdd;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "API corriendo correctamente!";
    }
}
