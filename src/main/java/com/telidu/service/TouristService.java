package com.telidu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telidu.exception.TouristNotFoundException;
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
		return "Tourist id saved as "+ touristId.getId();
		
	}

	@Override
	public Tourist fetchTouristById(Integer id) {
		return repo.findById(id).orElseThrow(()->new TouristNotFoundException("Tourist with given id is not found"));
	}

	@Override
	public List<Tourist> fetchAllTouristInfo() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String updateTouristinfo(Tourist tourist) {
		// TODO Auto-generated method stub
		
		Optional<Tourist> optional = repo.findById(tourist.getId());
		if(optional.isPresent()) {
			repo.save(tourist);
			return "Toursit info updated successfully";
		}
		throw new TouristNotFoundException("not found");
		
	}
	

	@Override
	public String updateTouristBudget(Integer id, Double budget) {
		// TODO Auto-generated method stub
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()) {
			Tourist tourist=optional.get();
			tourist.setBudget(budget);
			repo.save(tourist);
			return "successfully updated";
		}
		throw new TouristNotFoundException("not found");
	}

	@Override
	public String deleteTouristInfoById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return "Tourist id for the given id is successfully deleted";
		}
		throw new TouristNotFoundException("not found");
	}

}
