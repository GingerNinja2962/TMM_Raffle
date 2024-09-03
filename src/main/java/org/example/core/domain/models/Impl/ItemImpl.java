package org.example.core.domain.models.Impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.core.domain.models.Item;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class ItemImpl implements Item {

    @Id
    private UUID ID;
    private LocalDateTime CreationDate;
    private boolean Available = true;
    private String Name;
    private Integer Value;

    //<editor-fold desc="======== Constructors ========">

    public ItemImpl() {

    }

    public ItemImpl(@NonNull String Name, @NonNull Integer Value) {
        this.ID = UUID.randomUUID();
        this.CreationDate = LocalDateTime.now();
        this.Name = Name;
        this.Value = Value;
    }
    //</editor-fold>

    public void markAsSold() {
        this.Available = false;
    }

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    @Override
    public UUID getId() {
        return this.ID;
    }

    @Override
    public void setId(UUID id) {
        if (this.ID == null)
            this.ID = id;
    }
    //</editor-fold>

    //<editor-fold desc="Creation Date">
    @Override
    public LocalDateTime getCreationDate() {
        return this.CreationDate;
    }

    @Override
    public void setCreationDate(LocalDateTime creationDate) {
        if (this.CreationDate == null)
            this.CreationDate = creationDate;
    }
    //</editor-fold>

    //<editor-fold desc="Name">
    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public void setName(String name) {
        if (this.Name.isBlank())
            this.Name = name;
    }

    //</editor-fold>

    //<editor-fold desc="Value">
    @Override
    public Integer getValue() {
        return this.Value;
    }

    @Override
    public void setValue(Integer value) {
        if (this.Value == null)
            this.Value = value;
    }
    //</editor-fold>

    //<editor-fold desc="Availability">
    @Override
    public boolean isAvailable() {
        return this.Available;
    }

    @Override
    public void setAvailable(boolean available) {
        Available = available;
    }
    //</editor-fold>
    //</editor-fold>
}
