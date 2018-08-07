package com.kun.firstboot.controller;

import com.kun.firstboot.domain.entity.Girl;
import com.kun.firstboot.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/girl")
public class GirlController {

    @Autowired
    private GirlService service;

    @GetMapping("/getAll")
    public List<Girl> getAllGirls() {
        return service.listGirls();
    }
}
