package demo.patientservice.controller;

import lombok.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/welcome")
public class WelcomeController {
    @Value("${app.welcome}")
    private String welcome;

    @GetMapping
    public String welcome(){
        return welcome;
    }
}
