package com.prog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.pojo.Bank;
import com.prog.repository.BankRepo;
@Service
public class BankService {
    @Autowired
	private BankRepo repo;
	
	public void addDetails(Bank b) {
		repo.save(b);
	}
	
	public List<Bank> getAllDetails(){
		  return repo.findAll();
		
	}
	public void delete(Integer Id) {
		repo.deleteById(Id);
	}
	
	public Bank update(Integer Id) {
		Optional<Bank> update = repo.findById(Id);
		if(update.isPresent()) {
			return update.get();
		}
		return null;
	}
	
	
}
