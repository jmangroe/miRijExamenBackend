package com.example.demo.service.impl;

import com.example.demo.entity.MaquettenAntwoorden;
import com.example.demo.repos.MaquettenAntwoordenRepository;
import com.example.demo.service.MaquettenAntwoordenServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class MaquettenAntwoordenService implements MaquettenAntwoordenServiceInt {
    private final MaquettenAntwoordenRepository maquettenAntwoordenRepository;

    public List<MaquettenAntwoorden> findAllMaquettenAntwoorden(){
        return maquettenAntwoordenRepository.findAll();
    }

}
