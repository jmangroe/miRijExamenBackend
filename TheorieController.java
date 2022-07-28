package com.example.demo.controler;

import com.example.demo.entity.Theorie;
import com.example.demo.service.impl.TheorieService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/theorie")
@AllArgsConstructor
public class TheorieController {
    private final TheorieService theorieService;

    @GetMapping("alle/examen/vragen")
    public ResponseEntity<List<Theorie>> allTheorie() {
        List<Theorie> vragen =  theorieService.findAllTheorie();
        return new ResponseEntity<>(vragen, HttpStatus.OK);
    }
}
