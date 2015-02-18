package net.skessler.contact.service;

/**
 * Created by skessler on 2/18/15.
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.skessler.contact.dao.ContactDAO;
import net.skessler.contact.form.Contact;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO contactDAO;

    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Transactional
    public List<Contact> listContact() {

        return contactDAO.listContact();
    }

    @Transactional
    public void removeContact(Integer id) {
        contactDAO.removeContact(id);
    }
}
