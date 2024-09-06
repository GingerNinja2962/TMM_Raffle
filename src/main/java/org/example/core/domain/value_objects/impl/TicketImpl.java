package org.example.core.domain.value_objects.impl;

import org.example.core.domain.value_objects.Ticket;

import java.time.LocalDateTime;
import java.util.UUID;

public class TicketImpl implements Ticket {

    private final UUID id;
    private boolean validity = true;
    private final LocalDateTime issuedAt;

    //<editor-fold desc="======== Constructors ========">
    public TicketImpl() {
        this.id = UUID.randomUUID();
        this.issuedAt = LocalDateTime.now();
    }

    public TicketImpl(UUID id, boolean validity, LocalDateTime issuedAt) {
        this.id = id;
        this.validity = validity;
        this.issuedAt = issuedAt;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    @Override
    public UUID getId() {
        return this.id;
    }
    //</editor-fold>

    //<editor-fold desc="Validity">
    @Override
    public Boolean isValid() {
        return this.validity;
    }

    @Override
    public void markAsUsed() {
        validity = false;
    }
    //</editor-fold>

    //<editor-fold desc="Creation Date">
    @Override
    public LocalDateTime getCreationDate() {
        return this.issuedAt;
    }
    //</editor-fold>
    //</editor-fold>

    @Override
    public String toString() {
        return String.format("Item: {ID: %s, Validity: %s, IssuedAt: %s}",
                this.id, this.validity, this.issuedAt);
    }
}
