package org.example.core.db.entities.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.core.db.entities.BaseEntity;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
//@Table(name = "TMM_Items", schema = "TMM_Raffle")
public class ItemEntity implements BaseEntity {

    @Id
    private UUID id;
    private String name;
    private Integer goldValue;
    private Boolean available = true;
    private LocalDateTime creationDate;

    //<editor-fold desc="======== Constructors ========">
    public ItemEntity() {
    }

    public ItemEntity(UUID id, String name, Integer goldValue, Boolean available, LocalDateTime creationDate) {
        this.id = id;
        this.name = name;
        this.goldValue = goldValue;
        this.available = available;
        this.creationDate = creationDate;
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
    public Boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    //</editor-fold>
    //</editor-fold>

    @Override
    public String toString() {
        return String.format("{ID: %s, Name: %s, Value: %s, available: %s, CreationDate: %s}",
                this.id, this.name, this.goldValue, this.available, this.creationDate);
    }
}
