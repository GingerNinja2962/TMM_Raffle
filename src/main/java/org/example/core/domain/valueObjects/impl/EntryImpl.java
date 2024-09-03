package org.example.core.domain.valueObjects.impl;

import org.example.core.domain.valueObjects.Entry;
import org.example.core.domain.valueObjects.RaffleEvent;
import org.example.core.domain.valueObjects.Ticket;
import org.example.core.domain.valueObjects.User;

import java.util.UUID;

public class EntryImpl implements Entry {

    private final UUID id;
    private final User user;
    private final Ticket ticket;
    private final RaffleEvent raffleEvent;

    //<editor-fold desc="======== Constructors ========">
    EntryImpl(User user, Ticket ticket, RaffleEvent raffleEvent) {
        this.id = UUID.randomUUID();
        this.user = user;
        this.ticket = ticket;
        this.raffleEvent = raffleEvent;
    }

    EntryImpl(UUID id, User user, Ticket ticket, RaffleEvent raffleEvent) {
        this.id = id;
        this.user = user;
        this.ticket = ticket;
        this.raffleEvent = raffleEvent;
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
    public RaffleEvent getRaffleEvent() {
        return this.raffleEvent;
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
