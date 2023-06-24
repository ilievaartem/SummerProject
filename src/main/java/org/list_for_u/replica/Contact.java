package org.list_for_u.replica;

import java.time.LocalDate;

public record Contact(FullName fullName, String number, LocalDate dateBirth) {
}
