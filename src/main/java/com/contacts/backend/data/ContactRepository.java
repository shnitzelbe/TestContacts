package com.contacts.backend.data;

import com.contacts.backend.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
