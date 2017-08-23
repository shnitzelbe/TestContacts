package com.contacts.backend.controller;


import com.contacts.backend.data.ContactService;
import com.contacts.backend.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


/**
 * Created by sergey on 14.09.16.
 */
@RestController
public class ContactsControllerImpl implements ContactsController {

    @Autowired
    private ContactService service;

    @Override
    public Collection<Contact> searchContacts(@RequestParam(required = false) String nameFilter) {
        Collection<Contact> result = service.findAllContactsByNameFilter(nameFilter);
        if(result.size() > 10 ){
            throw new NotAcceptableAException(nameFilter);
        }
        return result;
    }

}
