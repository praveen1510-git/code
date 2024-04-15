package com.time.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.time.entity.TimeEntity;
import com.time.repository.TimeRepository;

@Repository

public class TimeDao {
	
	@Autowired
	TimeRepository tr;
	public String post100(List<TimeEntity> a) {
		 tr.saveAll(a);
		 return "posted successfully";
	}
	
	public List<TimeEntity> get100(){
		return tr.findAll();
	}
	

}
