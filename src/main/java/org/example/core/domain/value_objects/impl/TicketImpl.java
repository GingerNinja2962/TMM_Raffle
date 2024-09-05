package org.example.core.domain.value_objects.impl;

import org.example.core.domain.value_objects.Ticket;

import java.time.LocalDateTime;
import java.util.UUID;

public class TicketImpl implements Ticket {

    private final UUID id;
    private final LocalDateTime issuedAt;
    private boolean validity = true;

    //<editor-fold desc="======== Constructors ========">
    TicketImpl() {
        this.id = UUID.randomUUID();
        this.issuedAt = LocalDateTime.now();
    }

    TicketImpl(UUID id, LocalDateTime issuedAt, boolean validity) {
        this.id = id;
        this.issuedAt = issuedAt;
        this.validity = validity;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    @Override
    public UUID getId() {
        return this.id;
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
