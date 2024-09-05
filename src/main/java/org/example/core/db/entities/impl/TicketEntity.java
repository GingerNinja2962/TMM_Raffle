package org.example.core.db.entities.impl;

import jakarta.persistence.Entity;
import org.example.core.db.entities.BaseEntity;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "ticket")
//@Table(name = "TMM_Tickets", schema = "TMM_Raffle")
public class TicketEntity extends BaseEntity {

    private Boolean validity;
    private LocalDateTime creationDate;

    //<editor-fold desc="======== Constructors ========">
    public TicketEntity() {
    }

    public TicketEntity(UUID id, Boolean validity, LocalDateTime creationDate) {
        this.id = id;
        this.validity = validity;
        this.creationDate = creationDate;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="Validity">
    public Boolean getValidity() {
        return this.validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
    }
    //</editor-fold>

    //<editor-fold desc="Creation Date">
    public LocalDateTime getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(LocalDateTime issuedAt) {
        this.creationDate = issuedAt;
    }
    //</editor-fold>
    //</editor-fold>
}
