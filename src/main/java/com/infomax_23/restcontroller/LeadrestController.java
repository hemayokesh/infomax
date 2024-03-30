package com.infomax_23.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infomax_23.entity.Lead;
import com.infomax_23.repository.LeadRepository;

@RequestMapping("/api")
@RestController
public class LeadrestController {
	
	@Autowired
	private LeadRepository leadRepo;
	
	//http://localhost:8080/api
	@GetMapping
	public List <Lead> getallApi(){
		List<Lead>leads = leadRepo.findAll();
		return leads;
	}
	
	//http://localhost:8080/api
	@PostMapping
	public void saveapi(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	
	@PutMapping
	public void updateapi(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	
	//http://localhost:8080/api/5
	@DeleteMapping
	public void deleteapi(@PathVariable("id") long id) {
		leadRepo.deleteById(id);
	}
	
	
}
