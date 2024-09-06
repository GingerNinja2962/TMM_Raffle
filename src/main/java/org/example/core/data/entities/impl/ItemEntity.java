package org.example.core.data.entities.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.example.core.data.entities.BaseEntity;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TMM_Items", schema = "TMM_Raffle")
public class ItemEntity extends BaseEntity {

    private String name;
    private Integer goldValue;
    private Boolean validity = true;
    private LocalDateTime creationDate;

    //<editor-fold desc="======== Constructors ========">
    public ItemEntity() {
    }

    public ItemEntity(UUID id, String name, Integer goldValue, Boolean validity, LocalDateTime creationDate) {
        this.id = id;
        this.name = name;
        this.goldValue = goldValue;
        this.validity = validity;
        this.creationDate = creationDate;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
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

    //<editor-fold desc="Validity">
    public Boolean getValidity() {
        return this.validity;
    }

    public void setValidity(boolean available) {
        this.validity = available;
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
    //</editor-fold>

    @Override
    public String toString() {
        return String.format("{ID: %s, Name: %s, Value: %s, available: %s, CreationDate: %s}",
                this.id, this.name, this.goldValue, this.validity, this.creationDate);
    }
}
