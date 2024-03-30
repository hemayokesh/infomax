package com.infomax_23.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infomax_23.entity.Billing;
import com.infomax_23.entity.Lead;
import com.infomax_23.repository.BillingRepository;
import com.infomax_23.repository.LeadRepository;
@Service
public class BillServiceImpl implements BillService{
	
	@Autowired
	public BillingRepository billRepo;
	//public LeadRepository leadRepo;


	@Override
	public void saveLeadBill(Billing bill) {
		billRepo.save(bill);
	}
	
	
}
