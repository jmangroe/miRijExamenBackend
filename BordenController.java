package com.example.demo.controler;


import com.example.demo.entity.Borden;
import com.example.demo.service.impl.BordenService;
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
@RequestMapping("/borden")
@AllArgsConstructor
public class BordenController {
    private final BordenService bordenService;

    @GetMapping("/get/alle/borden")
    public ResponseEntity<List<Borden>> allBorden() {
        List<Borden> bordens = bordenService.findAllBorden();
        return new ResponseEntity<>(bordens, HttpStatus.OK);
    }
}

