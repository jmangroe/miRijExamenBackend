package com.example.demo.controler;

import com.example.demo.entity.Maquetten;
import com.example.demo.service.impl.MaquettenService;
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
@RequestMapping("/maquetten")
@AllArgsConstructor
public class MaquettenController {
    private final MaquettenService maquettenService;


    @GetMapping("/get/alle/maquetten")
    public ResponseEntity<List<Maquetten>> allMaquetten() {
        List<Maquetten> maquetten = maquettenService.findAllMaquetten();
        return new ResponseEntity<>(maquetten, HttpStatus.OK);
    }
}
