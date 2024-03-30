package com.infomax_23.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infomax_23.entity.Billing;
import com.infomax_23.entity.Contact;
import com.infomax_23.entity.Lead;
import com.infomax_23.services.BillService;
import com.infomax_23.services.ContactService;
import com.infomax_23.services.LeadService;
import com.infomax_23.util.InfomaxEmail;


@Controller
public class LeadController {
	@Autowired
	public LeadService leadserv;
	
	@Autowired
	private ContactService contactserv;
	
	@Autowired
	private InfomaxEmail infomaxemail;
	
	@Autowired
	private BillService billserv;
	
	@RequestMapping("/newlead")
	public String show() {
		return "newlead";
	}
	
	
	
	@RequestMapping("/savelead")
	public String savelead(Lead lead,ModelMap model) {
		leadserv.saveLeadData(lead);
		infomaxemail.sendInfomaxEmail(lead.getEmail(), "Welcome to Infomax", "Congratulations for booking our product!!!.");
		model.addAttribute("lead",lead);
		return "leadinfo";
	}
	
	
	@RequestMapping("/savecontact")
	public String saveContact(Contact contact,@RequestParam("id")long id) {
	contactserv.saveContactData(contact);
	leadserv.deleteOneLead(id);
	return "billing";
	
	}
	
	
	@RequestMapping("/listallleads")
	public String listAllLeads(Lead lead,ModelMap model) {
		List<Lead> leads=leadserv.listAllLeadsInfo(lead);
		model.addAttribute("leads",leads);
		return "listallleads";
	}
	

	@RequestMapping("/saveleadsbill")
	public String saveLeadsbill(Billing bill) {
		billserv.saveLeadBill(bill);
		
		
		return "newlead";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
