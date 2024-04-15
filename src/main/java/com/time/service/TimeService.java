package com.time.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.time.dao.TimeDao;
import com.time.entity.TimeEntity;

@Service
public class TimeService {

	@Autowired
	TimeDao td;
	
	public String post100(List<TimeEntity> a) {
		return td.post100(a);
	}
	
	public List<TimeEntity> get100(){
		 return td.get100();
	}
}

