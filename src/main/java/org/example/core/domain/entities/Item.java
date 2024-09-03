package org.example.core.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
//@Table(name = "TMM_Items", schema = "TMM_Raffle")
public class Item {

    @Id
    private UUID id;
    private LocalDateTime creationDate;
    private boolean available = true;
    private String name;
    private Integer goldValue;

    //<editor-fold desc="======== Constructors ========">
    public Item() {}
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
    public LocalDateTime getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
    //</editor-fold>

    //<editor-fold desc="Name">
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //</editor-fold>

    //<editor-fold desc="Gold Value">
    public Integer getGoldValue() {
        return this.goldValue;
    }

    public void setGoldValue(Integer goldValue) {
        this.goldValue = goldValue;
    }
    //</editor-fold>

    //<editor-fold desc="Availability">
    public boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    //</editor-fold>
    //</editor-fold>
}
