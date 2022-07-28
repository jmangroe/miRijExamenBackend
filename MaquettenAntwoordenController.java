package com.example.demo.controler;

import com.example.demo.entity.MaquettenAntwoorden;
import com.example.demo.service.impl.MaquettenAntwoordenService;
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
@RequestMapping("/maquettenantwoorden")
@AllArgsConstructor
public class MaquettenAntwoordenController {
    private final MaquettenAntwoordenService maquettenAntwoordenService;


    @GetMapping("/get/all/maquettenantwoorden")
    public ResponseEntity<List<MaquettenAntwoorden>> allMaquettenAntwoorden() {
        List<MaquettenAntwoorden> antwoorden = maquettenAntwoordenService.findAllMaquettenAntwoorden();
        return new ResponseEntity<>(antwoorden, HttpStatus.OK);
    }


}
