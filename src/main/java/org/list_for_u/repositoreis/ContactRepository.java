package org.list_for_u.repositoreis;

import org.list_for_u.replica.Contact;
import java.util.List;
public interface ContactRepository {
    void addContact(Contact contact);
    void updateContact(Contact contact);
    void readContact(Contact contact);
    void deleteContact(Contact contact);
    List <Contact> searchContact(String search);
    void saveContacts();
}
