package com.developer.dao;

import com.developer.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface HouseRepository extends JpaRepository<House, Long> {
}
