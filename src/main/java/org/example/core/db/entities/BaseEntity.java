package org.example.core.db.entities;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.util.UUID;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    protected UUID id;

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    //</editor-fold>
    //</editor-fold>
}