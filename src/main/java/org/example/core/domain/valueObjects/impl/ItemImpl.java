package org.example.core.domain.valueObjects.impl;

import org.example.core.domain.valueObjects.Item;

import java.time.LocalDateTime;
import java.util.UUID;

public class ItemImpl implements Item {

    private final UUID id;
    private final LocalDateTime creationDate;
    private boolean available = true;
    private String name;
    private Integer value;

    //<editor-fold desc="======== Constructors ========">
    public ItemImpl(String Name, Integer Value) {
        this.id = UUID.randomUUID();
        this.creationDate = LocalDateTime.now();
        this.name = Name;
        this.value = Value;
    }

    public ItemImpl(UUID id, LocalDateTime creationDate, Boolean available, String name, Integer value) {
        this.id = id;
        this.creationDate = creationDate;
        this.available = available;
        this.name = name;
        this.value = value;
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
        return this.creationDate;
    }
    //</editor-fold>

    //<editor-fold desc="Name">
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void changeName(String name) {
        if (this.name.isBlank())
            this.name = name;
    }
    //</editor-fold>

    //<editor-fold desc="Value">
    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public void changeValue(Integer value) {
        this.value = value;
    }
    //</editor-fold>

    //<editor-fold desc="Availability">
    @Override
    public boolean isAvailable() {
        return this.available;
    }

    @Override
    public void markAsSold() {
        this.available = false;
    }
    //</editor-fold>
    //</editor-fold>
}
