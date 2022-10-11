package no.kristiania.devopsRecap;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CDController {

    @GetMapping(path = "/")
    public String hello() {
        return "Hello";
    }

}


