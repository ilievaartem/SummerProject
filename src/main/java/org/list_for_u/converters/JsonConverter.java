package org.list_for_u.converters;

import org.list_for_u.replica.Contact;

import java.util.List;

public interface JsonConverter {
    String toJson(List<Contact> contactList);
    List<Contact> fromJson(String contactList);
}
