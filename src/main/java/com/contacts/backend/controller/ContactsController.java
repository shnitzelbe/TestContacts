package com.contacts.backend.controller;

import com.contacts.backend.model.Contact;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;


public interface ContactsController {
    @RequestMapping(
            value = "/hello/contacts",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    Collection<Contact> searchContacts(@RequestParam(name = "nameFilter") String nameFilter);
}
