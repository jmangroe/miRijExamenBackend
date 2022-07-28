package com.example.demo.controler;

import com.example.demo.entity.TheorieAntwoorden;
import com.example.demo.service.impl.TheorieAntwoordenService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/theorieantwoorden")
@AllArgsConstructor
public class TheorieAntwoordenController {
    private final TheorieAntwoordenService theorieAntwoordenService;


    @GetMapping("/get/alle/theorieantwoorden")
    public ResponseEntity<List<TheorieAntwoorden>> allTheorieAntwoorden() {
        List<TheorieAntwoorden> antwoorden =  theorieAntwoordenService.findAllTheorieAntwoorden();
        return new ResponseEntity<>(antwoorden, HttpStatus.OK);
    }
}
