package org.example.core.domain.value_objects.impl;

import org.example.core.domain.value_objects.Item;

import java.time.LocalDateTime;
import java.util.UUID;

public class ItemImpl implements Item {

    private final UUID id;
    private final LocalDateTime creationDate;
    private Boolean available = true;
    private String name;
    private Integer value;

    //<editor-fold desc="======== Constructors ========">
    public ItemImpl(String Name, Integer Value) {
        this.id = UUID.randomUUID();
        this.creationDate = LocalDateTime.now();
        this.name = Name;
        this.value = Value;
    }

    public ItemImpl(UUID id, String name, Integer value, Boolean available, LocalDateTime creationDate) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.available = available;
        this.creationDate = creationDate;
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
    public Boolean isAvailable() {
        return this.available;
    }

    @Override
    public void markAsSold() {
        this.available = false;
    }
    //</editor-fold>
    //</editor-fold>

    @Override
    public String toString() {
        return String.format("Item: {ID: %s, Name: %s, Value: %s, Availability: %s, CreationDate: %s}",
                this.id, this.name, this.value, this.available, this.creationDate);
    }
}
