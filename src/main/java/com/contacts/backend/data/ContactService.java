package com.contacts.backend.data;

import com.contacts.backend.model.Contact;

import java.util.List;

/**
 * @author Serhii_Malykhin
 */

public interface ContactService {
    List<Contact> findAllContactsByNameFilter(String nameFilter);
}
