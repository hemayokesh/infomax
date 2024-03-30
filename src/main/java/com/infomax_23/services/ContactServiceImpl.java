package com.infomax_23.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.infomax_23.entity.Contact;
import com.infomax_23.repository.ContactRepository;



@Service
public class ContactServiceImpl implements ContactService{
	@Autowired
	public ContactRepository contactrepo;
	
	@Override
	public void saveContactData(Contact contact) {
		contactrepo.save(contact);
	}

}
