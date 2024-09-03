package org.example.core.domain.valueObjects.impl;

import org.example.core.domain.valueObjects.Item;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;
import java.util.UUID;

public class ItemImpl implements Item {

    private final UUID ID;
    private final LocalDateTime CreationDate;
    private boolean Available = true;
    private String Name;
    private Integer Value;

    //<editor-fold desc="======== Constructors ========">
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
    //</editor-fold>

    //<editor-fold desc="Creation Date">
    @Override
    public LocalDateTime getCreationDate() {
        return this.CreationDate;
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
