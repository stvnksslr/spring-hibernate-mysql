package net.skessler.contact.dao;

/**
 * Created by skessler on 2/18/15.
 */
import net.skessler.contact.form.Contact;
import java.util.List;


public interface ContactDAO {

    public void addContact(Contact contact);
    public List<Contact> listContact();
    public void removeContact(Integer id);
}