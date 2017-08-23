package com.contacts.backend.data;

import com.contacts.backend.data.ContactService;
import com.contacts.backend.model.Contact;
import com.contacts.backend.data.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Iterator;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository repository;

    @Override
    public List<Contact> findAllContactsByNameFilter(String nameFilter) {

        List<Contact> result =  repository.findAll();
        if(nameFilter != null && !nameFilter.isEmpty()){
               for (Iterator<Contact> it = result.listIterator(); it.hasNext(); ){
                   Contact contact = it.next();
                   if(contact.getName().matches(nameFilter)){
                       it.remove();
                   }
               }
        }
        return result;
    }
}
