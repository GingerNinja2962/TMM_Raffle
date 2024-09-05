package org.example.core.db.entities.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.example.core.db.entities.BaseEntity;

import java.util.UUID;

@Entity(name = "entry")
//@Table(name = "TMM_Entries", schema = "TMM_Raffle")
public class EntryEntity implements BaseEntity {

    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = UserEntity.class)
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = TicketEntity.class)
    private TicketEntity ticket;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = EventEntity.class)
    private EventEntity event;

    //<editor-fold desc="======== Constructors ========">
    public EntryEntity() {
    }
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
    public UserEntity getUser() {
        return this.user;
    }

    public void setUser(UserEntity userEntity) {
        this.user = userEntity;
    }
    //</editor-fold>

    //<editor-fold desc="======== Tickets ========">
    public TicketEntity getTicket() {
        return this.ticket;
    }

    public void setTicket(TicketEntity ticketEntity) {
        this.ticket = ticketEntity;
    }
    //</editor-fold>

    //<editor-fold desc="======== Raffle Event ========">
    public EventEntity getRaffleEvent() {
        return this.event;
    }

    public void setRaffleEvent(EventEntity eventEntity) {
        this.event = eventEntity;
    }
    //</editor-fold>
    //</editor-fold>
}
