package com.wshsoft.service;

import org.springframework.stereotype.Service;

import com.wshsoft.models.Contact;
@Service
public interface ContactService {
   public Contact find(Long id);
   
   public void create(Contact contact);
   
   public void update(Contact contact);
   
}
