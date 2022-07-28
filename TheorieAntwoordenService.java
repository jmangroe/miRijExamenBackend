package com.example.demo.service.impl;

import com.example.demo.entity.TheorieAntwoorden;
import com.example.demo.repos.TheorieAntwoordenRepository;
import com.example.demo.service.TheorieAntwoordenServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class TheorieAntwoordenService implements TheorieAntwoordenServiceInt {
    private final TheorieAntwoordenRepository theorieAntwoordenRepository;

    @Override
    public List<TheorieAntwoorden> findAllTheorieAntwoorden(){
        return theorieAntwoordenRepository.findAll();
    }
}
