package org.example.core.domain.models.Impl;

import org.example.core.domain.models.Entry;
import org.example.core.domain.models.RaffleEvent;
import org.example.core.domain.models.Ticket;
import org.example.core.domain.models.User;

import java.util.UUID;

public class EntryImpl implements Entry {

    private final UUID ID;
    private final User user;
    private final Ticket ticket;
    private final RaffleEvent raffleEvent;

    //<editor-fold desc="======== Constructors ========">
    EntryImpl(User user, Ticket ticket, RaffleEvent raffleEvent) {
        ID = UUID.randomUUID();
        this.user = user;
        this.ticket = ticket;
        this.raffleEvent = raffleEvent;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="======== ID ========">
    public UUID getId() {
        return this.ID;
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
