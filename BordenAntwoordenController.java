package com.example.demo.controler;


import com.example.demo.entity.BordenAntwoorden;
import com.example.demo.service.impl.BordenAntwoordenService;
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
@RequestMapping("/bordenantwoorden")
@AllArgsConstructor
public class BordenAntwoordenController {
        private final BordenAntwoordenService bordenAntwoordenService;


        @GetMapping("/get/alle/bordenantwoorden")
        public ResponseEntity<List<BordenAntwoorden>> allBordenAntwoorden() {
                List<BordenAntwoorden> antwoordens = bordenAntwoordenService.findAllBordenAntwoorden();
                return new ResponseEntity<>(antwoordens, HttpStatus.OK);
        }

}
