package org.example.core.domain.valueObjects.impl;

import org.example.core.domain.valueObjects.Ticket;

import java.time.LocalDateTime;
import java.util.UUID;

public class TicketImpl implements Ticket {

    private final UUID ID;
    private final LocalDateTime issuedAt;
    private boolean validity;

    //<editor-fold desc="======== Constructors ========">
    TicketImpl() {
        this.ID = UUID.randomUUID();
        this.issuedAt = LocalDateTime.now();
        this.validity = true;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    @Override
    public UUID getId() {
        return this.ID;
    }
    //</editor-fold>

    //<editor-fold desc="Creation Date">
    @Override
    public LocalDateTime getCreationDate() {
        return this.issuedAt;
    }
    //</editor-fold>

    //<editor-fold desc="Validity">
    @Override
    public boolean isValid() {
        return this.validity;
    }

    @Override
    public void markAsUsed() {
        validity = false;
    }
    //</editor-fold>
    //</editor-fold>
}
