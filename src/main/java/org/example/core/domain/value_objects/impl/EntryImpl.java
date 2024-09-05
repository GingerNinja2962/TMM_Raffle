package org.example.core.domain.value_objects.impl;

import org.example.core.domain.value_objects.Entry;
import org.example.core.domain.value_objects.Event;
import org.example.core.domain.value_objects.Ticket;
import org.example.core.domain.value_objects.User;

import java.util.UUID;

public class EntryImpl implements Entry {

    private final UUID id;
    private final User user;
    private final Ticket ticket;
    private final Event event;

    //<editor-fold desc="======== Constructors ========">
    EntryImpl(User user, Ticket ticket, Event event) {
        this.id = UUID.randomUUID();
        this.user = user;
        this.ticket = ticket;
        this.event = event;
    }

    EntryImpl(UUID id, User user, Ticket ticket, Event event) {
        this.id = id;
        this.user = user;
        this.ticket = ticket;
        this.event = event;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="======== ID ========">
    public UUID getId() {
        return this.id;
    }


    //</editor-fold>

    //<editor-fold desc="======== Raffle Event ========">
    @Override
    public Event getRaffleEvent() {
        return this.event;
    }
    //</editor-fold>

    //<editor-fold desc="======== Users ========">
    @Override
    public User getUser() {
        return this.user;
    }
    //</editor-fold>

    //<editor-fold desc="======== Tickets ========">
    @Override
    public Ticket getTicket() {
        return this.ticket;
    }
    //</editor-fold>
    //</editor-fold>
}
