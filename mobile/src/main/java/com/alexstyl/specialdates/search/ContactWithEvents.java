package com.alexstyl.specialdates.search;

import com.alexstyl.specialdates.contact.Contact;
import com.alexstyl.specialdates.date.ContactEvent;

import java.util.List;

class ContactWithEvents {

    private final Contact contact;
    private final List<ContactEvent> events;

    ContactWithEvents(Contact contact, List<ContactEvent> events) {
        this.contact = contact;
        this.events = events;
    }

    public Contact getContact() {
        return contact;
    }

    public List<ContactEvent> getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return "ContactWithEvents{" +
                "contact=" + contact +
                ", events=" + events +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ContactWithEvents that = (ContactWithEvents) o;

        if (!contact.equals(that.contact)) {
            return false;
        }
        return events.equals(that.events);

    }

    @Override
    public int hashCode() {
        int result = contact.hashCode();
        result = 31 * result + events.hashCode();
        return result;
    }
}