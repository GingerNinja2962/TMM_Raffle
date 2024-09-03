package org.example.core.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity(name = "entry")
//@Table(name = "TMM_Entries", schema = "TMM_Raffle")
public class Entry {

    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = User.class)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = Ticket.class)
    private Ticket ticket;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = RaffleEvent.class)
    private RaffleEvent raffleEvent;

    //<editor-fold desc="======== Constructors ========">
    public Entry() {}
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="======== ID ========">
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    //</editor-fold>

    //<editor-fold desc="======== Users ========">
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    //</editor-fold>

    //<editor-fold desc="======== Tickets ========">
    public Ticket getTicket() {
        return this.ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    //</editor-fold>

    //<editor-fold desc="======== Raffle Event ========">
    public RaffleEvent getRaffleEvent() {
        return this.raffleEvent;
    }

    public void setRaffleEvent(RaffleEvent raffleEvent) {
        this.raffleEvent = raffleEvent;
    }
    //</editor-fold>
    //</editor-fold>
}
