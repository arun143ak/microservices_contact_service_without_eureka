package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    //fake user lIst

    List<Contact> contactList = List.of(
            new Contact(11L, "arun@", "Arun", 1L),
            new Contact(14L, "karun@", "KArun", 1L),
            new Contact(15L, "arunk@", "ArunK", 1L),
            new Contact(12L, "kumar@", "Kumar", 2L),
            new Contact(13L, "ak@", "AK", 3L)
    );
    @Override
    public List<Contact> getContacts(Long id) {
        return contactList.stream().filter(u -> u.getUserId().equals(id)).collect(Collectors.toList());
    }
}
