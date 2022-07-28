package com.example.demo.service.impl;

import com.example.demo.entity.Maquetten;
import com.example.demo.repos.MaquettenRepository;
import com.example.demo.service.MaquettenServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class MaquettenService implements MaquettenServiceInt {
    private final MaquettenRepository maquettenRepository;

    @Override
    public List<Maquetten> findAllMaquetten(){
        return maquettenRepository.findAll();
    }
}
