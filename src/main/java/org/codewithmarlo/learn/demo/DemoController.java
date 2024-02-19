package org.codewithmarlo.learn.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
@RequiredArgsConstructor
public class DemoController {

    @GetMapping("/admin")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from secured endpoint");
    }

//    @RolesAllowed({"USER", "ADMIN"})
    @GetMapping("/user")
    public ResponseEntity<String> sayUser() {
        return ResponseEntity.ok("Dit is een User End Point");
    }

}
