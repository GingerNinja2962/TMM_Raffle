package org.example.core.domain.value_objects.impl;

import org.example.core.domain.value_objects.Entry;
import org.example.core.domain.value_objects.Event;
import org.example.core.domain.value_objects.Ticket;
import org.example.core.domain.value_objects.User;

import java.util.UUID;

public class EntryImpl extends BaseID implements Entry {

    private final User user;
    private final Ticket ticket;
    private final Event event;

    //<editor-fold desc="======== Constructors ========">
    public EntryImpl(User user, Ticket ticket, Event event) {
        this.id = UUID.randomUUID();
        this.user = user;
        this.ticket = ticket;
        this.event = event;
    }

    public EntryImpl(UUID id, User user, Ticket ticket, Event event) {
        this.id = id;
        this.user = user;
        this.ticket = ticket;
        this.event = event;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="User">
    @Override
    public User getUser() {
        return this.user;
    }
    //</editor-fold>

    //<editor-fold desc="Ticket">
    @Override
    public Ticket getTicket() {
        return this.ticket;
    }
    //</editor-fold>

    //<editor-fold desc="Event">
    @Override
    public Event getEvent() {
        return this.event;
    }
    //</editor-fold>
    //</editor-fold>

    @Override
    public String toString() {
        return String.format("Entry: {ID: %s, User ID: %s, Ticket ID: %s, Event ID: %s}",
                this.id, this.user.getId(), this.ticket.getId(), this.event.getId());
    }
}
