package com.time.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.time.entity.TimeEntity;

public interface TimeRepository  extends JpaRepository<TimeEntity,Integer>{

}
