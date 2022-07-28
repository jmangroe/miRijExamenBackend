package com.example.demo.service.impl;


import com.example.demo.entity.Borden;
import com.example.demo.repos.BordenRepository;
import com.example.demo.service.BordenServiceInt;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class BordenService implements BordenServiceInt {
    private final BordenRepository bordenRepository;

    @Override
    public List<Borden> findAllBorden(){
        return bordenRepository.findAll();
    }

}
