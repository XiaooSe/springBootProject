package com.kun.firstboot.dao;

import com.kun.firstboot.domain.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GirlRepository extends JpaRepository<Girl, Long> {
}
