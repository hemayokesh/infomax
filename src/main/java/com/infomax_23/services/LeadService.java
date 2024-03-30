package com.infomax_23.services;

import java.util.List;

import com.infomax_23.entity.Billing;
import com.infomax_23.entity.Lead;

public interface LeadService {
	public void saveLeadData(Lead lead);
	public void deleteOneLead(long id);
	public List<Lead> listAllLeadsInfo(Lead lead);
	
}
