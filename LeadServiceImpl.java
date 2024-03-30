package com.infomax_23.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infomax_23.entity.Billing;
import com.infomax_23.entity.Lead;
import com.infomax_23.repository.BillingRepository;
import com.infomax_23.repository.LeadRepository;




@Service
public class LeadServiceImpl implements LeadService{
@Autowired
	public LeadRepository leadRepo;


	@Override
	public void saveLeadData(Lead lead) {
		leadRepo.save(lead);
	}
	
	@Override
	public void deleteOneLead(long id) {
		leadRepo.deleteById(id);
	}
	
	@Override
	public List<Lead> listAllLeadsInfo(Lead lead) {
		List<Lead> leads=leadRepo.findAll();
		return leads;
	}
	
	
	
	
}
