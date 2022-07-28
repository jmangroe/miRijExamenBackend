package com.example.demo.service.impl;

import com.example.demo.entity.Theorie;
import com.example.demo.repos.TheorieRepository;
import com.example.demo.service.TheorieServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class TheorieService implements TheorieServiceInt {
    private final TheorieRepository theorieRepository;

    @Override
    public List<Theorie> findAllTheorie(){
        return theorieRepository.findAll();
    }

}
