package com.telidu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telidu.model.Tourist;
import com.telidu.repo.ITouristRepo;
@Service
public class TouristService implements ITouristService {

	private ITouristRepo repo;
    
	@Autowired
	public void setRepo(ITouristRepo repo) {
		this.repo = repo;
	}

	@Override
	public String registerTourist(Tourist tourist) {
		Tourist touristId=repo.save(tourist);
		return "Tourist id saved as "+touristId.getId();
		
	}

	@Override
	public String fetchTouristById(Integer id) {
		return null;
	}

	@Override
	public List<Tourist> fetchAllTouristInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateTouristinfo(Tourist tourist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateTouristBudget(Integer id, Double budget) {
		// TODO Auto-generated method stub
		return null;
	}

}
