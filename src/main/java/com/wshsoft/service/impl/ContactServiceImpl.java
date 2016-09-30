package com.wshsoft.service.impl;

import org.springframework.stereotype.Service;

import com.wshsoft.models.Contact;
import com.wshsoft.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService {
	   public Contact find(Long id){
		   Contact c= new Contact();
		   c.setId(10000L);
		   c.setName("xiejian");
		   return c;
	   }
	   
	   public void create(Contact contact){
		   
	   }
	   
	   public void update(Contact contact){
		   
	   }
}
