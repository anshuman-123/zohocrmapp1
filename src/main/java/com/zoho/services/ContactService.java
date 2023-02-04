package com.zoho.services;

import java.util.List;

import com.zoho.entities.Contacts;


public interface ContactService {
   public void saveContactInformation(Contacts contacts);
   public List<Contacts> getAllContacts();
public Contacts findContactById(long id);
}
