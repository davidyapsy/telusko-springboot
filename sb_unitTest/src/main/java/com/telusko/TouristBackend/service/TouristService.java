package com.telusko.TouristBackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.TouristBackend.exceptions.TouristNotFoundException;
import com.telusko.TouristBackend.model.Tourist;
import com.telusko.TouristBackend.repo.ITouristRepo;

@Service
public class TouristService implements ITouristService {
	
	private ITouristRepo repo;
	
	@Autowired
	public void setRepo(ITouristRepo repo) {
		this.repo = repo;
	}

	@Override
	public Tourist getTouristById(int id) {
		return repo.findById(id).orElseThrow(()-> new TouristNotFoundException("Tourist with id = "+ id+" is not exist."));
	}

	@Override
	public List<Tourist> getAllTourist() {
		return repo.findAll();
	}

	@Override
	public String addTourist(Tourist tourist) {
		Tourist dbTourist = repo.save(tourist);
		return "Tourist with id= "+dbTourist.getId()+" has been added successfully";
	}

	@Override
	public String updateTourist(Tourist tourist) {
		int id = tourist.getId();
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()) {
			repo.save(tourist);
			return "Tourist with id = "+id+" successfully updated";
		}
		throw new TouristNotFoundException("Tourist with id = "+ id+" is not exist.");
	}

	@Override
	public String updateTouristAmtPaid(int id, double amtPaid) {
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()) {
			Tourist tourist = optional.get();
			tourist.setAmtPaid(amtPaid);
			repo.save(tourist);
			return "Tourist with id = "+id+" successfully updated";
		}
		throw new TouristNotFoundException("Tourist with id = "+ id+" is not exist.");
	}

	@Override
	public String deleteTouristById(int id) {
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return "Tourist with id = "+id+" successfully deleted";
		}
		throw new TouristNotFoundException("Tourist with id = "+ id+" is not exist.");	
	}

}
