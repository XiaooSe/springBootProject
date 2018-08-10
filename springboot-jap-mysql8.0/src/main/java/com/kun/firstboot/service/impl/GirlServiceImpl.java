package com.kun.firstboot.service.impl;

import com.kun.firstboot.dao.GirlRepository;
import com.kun.firstboot.domain.entity.Girl;
import com.kun.firstboot.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GirlServiceImpl implements GirlService {

    private final GirlRepository dao;

    @Autowired
    public GirlServiceImpl(GirlRepository dao) {
        this.dao = dao;
    }

    @Override
    public List<Girl> listGirls() {
        return dao.findAll();
    }
}
