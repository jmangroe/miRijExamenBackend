package com.example.demo.service.impl;

import com.example.demo.entity.BordenAntwoorden;
import com.example.demo.repos.BordenAntwoordenRepository;
import com.example.demo.service.BordenAntwoordenServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class BordenAntwoordenService implements BordenAntwoordenServiceInt {
    private final BordenAntwoordenRepository bordenAntwoordenRepository;

    @Override
    public List<BordenAntwoorden> findAllBordenAntwoorden(){
        return bordenAntwoordenRepository.findAll();
    }

}
