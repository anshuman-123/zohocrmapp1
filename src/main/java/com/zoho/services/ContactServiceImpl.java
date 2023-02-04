package com.zoho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.entities.Contacts;

import com.zoho.repositories.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveContactInformation(Contacts contact) {
		contactRepo.save(contact);

	}

	@Override
	public List<Contacts> getAllContacts() {
		List<Contacts> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contacts findContactById(long id) {
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts contact = findById.get();
		return contact;
	}

}
