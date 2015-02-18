package net.skessler.contact.service;

/**
 * Created by skessler on 2/18/15.
 */
import java.util.List;

import net.skessler.contact.form.Contact;

public interface ContactService {

    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}