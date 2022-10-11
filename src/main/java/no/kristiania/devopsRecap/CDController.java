package no.kristiania.devopsRecap;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CDController {

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
    
    @GetMapping("/secret") {
        return "Hello from secret, send nudes";
    }

}


