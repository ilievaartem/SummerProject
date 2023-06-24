package org.list_for_u.converters;

import com.google.gson.Gson;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.list_for_u.replica.Contact;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

public class GsonConverter implements JsonConverter {
    private final Gson gson;

    @Override
    public String toJson(List<Contact> contactList) {
        return null;
    }

    @Override
    public List<Contact> fromJson(String contactList) {
        return null;
    }
}
