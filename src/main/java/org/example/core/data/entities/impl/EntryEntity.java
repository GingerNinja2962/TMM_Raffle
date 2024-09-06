package org.example.core.data.entities.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.example.core.data.entities.BaseEntity;

import java.util.UUID;

@Entity(name = "entry")
@Table(name = "TMM_Entries", schema = "TMM_Raffle")
public class EntryEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = UserEntity.class)
    private UserEntity user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = TicketEntity.class)
    private TicketEntity ticket;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = EventEntity.class)
    private EventEntity event;

    //<editor-fold desc="======== Constructors ========">
    public EntryEntity() {
    }

    public EntryEntity(UUID id, UserEntity user, TicketEntity ticket, EventEntity event) {
        this.id = id;
        this.user = user;
        this.ticket = ticket;
        this.event = event;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="User">
    public UserEntity getUser() {
        return this.user;
    }

    public void setUser(UserEntity userEntity) {
        this.user = userEntity;
    }
    //</editor-fold>

    //<editor-fold desc="Ticket">
    public TicketEntity getTicket() {
        return this.ticket;
    }

    public void setTicket(TicketEntity ticketEntity) {
        this.ticket = ticketEntity;
    }
    //</editor-fold>

    //<editor-fold desc="Event">
    public EventEntity getEvent() {
        return this.event;
    }

    public void setEvent(EventEntity eventEntity) {
        this.event = eventEntity;
    }
    //</editor-fold>
    //</editor-fold>
}
