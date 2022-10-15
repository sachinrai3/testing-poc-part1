package net.metrosystems.mip.testingpoc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivenessCheckController {

    @GetMapping(path = {"/.well-known/live", "/.well-known/ready"})
    public ResponseEntity<String> live() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
