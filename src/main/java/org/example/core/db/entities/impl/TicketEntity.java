package org.example.core.db.entities.impl;

import jakarta.persistence.Entity;
import org.example.core.db.entities.BaseEntity;

import java.time.LocalDateTime;

@Entity(name = "ticket")
//@Table(name = "TMM_Tickets", schema = "TMM_Raffle")
public class TicketEntity extends BaseEntity {

    private LocalDateTime creationDate;
    private Boolean validity;

    //<editor-fold desc="======== Constructors ========">
    public TicketEntity() {
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="Creation Date">
    public LocalDateTime getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(LocalDateTime issuedAt) {
        this.creationDate = issuedAt;
    }
    //</editor-fold>

    //<editor-fold desc="Validity">
    public Boolean getValidity() {
        return this.validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
    }
    //</editor-fold>
    //</editor-fold>
}
