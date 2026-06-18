package com.telidu.service;

import java.util.List;

import com.telidu.model.Tourist;

public interface ITouristService {
	String registerTourist(Tourist tourist);
	Tourist fetchTouristById(Integer id);
	List<Tourist> fetchAllTouristInfo();
	String updateTouristinfo(Tourist tourist);
	String updateTouristBudget(Integer id,Double budget);
	
	

}
