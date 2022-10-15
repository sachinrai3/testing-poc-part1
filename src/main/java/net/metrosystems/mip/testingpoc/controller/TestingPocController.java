package net.metrosystems.mip.testingpoc.controller;

import net.metrosystems.mip.testingpoc.service.TestingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingPocController {

    @Autowired
    TestingService service;
    @GetMapping(  "/test")
    public ResponseEntity getResponse() {
       return new ResponseEntity<String>(service.getResponse(),HttpStatus.OK);

    }

}
