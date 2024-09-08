package org.example.core.domain.value_objects.impl;

import java.util.UUID;

public abstract class BaseID {

    protected UUID id;

    //<editor-fold desc="======== Constructors ========">
    protected BaseID(UUID id) {
        this.id = id;
    }

    protected BaseID() {
        this.id = UUID.randomUUID();
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    public UUID getId() {
        return this.id;
    }
    //</editor-fold>
    //</editor-fold>
}
