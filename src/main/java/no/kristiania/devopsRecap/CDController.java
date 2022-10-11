package no.kristiania.devopsRecap;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CDController {

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
    
    @GetMapping("/secret") 
    public String hello2() {
        return "Hello from secret, send nudes";
    }

}


