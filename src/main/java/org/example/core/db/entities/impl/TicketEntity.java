package org.example.core.db.entities.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.core.db.entities.BaseEntity;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "ticket")
//@Table(name = "TMM_Tickets", schema = "TMM_Raffle")
public class TicketEntity implements BaseEntity {

    @Id
    private UUID id;
    private LocalDateTime issuedAt;
    private Boolean validity;

    //<editor-fold desc="======== Constructors ========">
    public TicketEntity() {
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    //</editor-fold>

    //<editor-fold desc="Creation Date">
    public LocalDateTime getIssuedAt() {
        return this.issuedAt;
    }

    public void setIssuedAt(LocalDateTime issuedAt) {
        this.issuedAt = issuedAt;
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
