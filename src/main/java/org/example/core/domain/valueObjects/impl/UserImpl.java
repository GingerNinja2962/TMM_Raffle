package org.example.core.domain.valueObjects.impl;

import org.example.core.domain.valueObjects.User;

import java.util.UUID;

public class UserImpl implements User {

    private final UUID id;
    private final String userName;
    private Integer goldDonated;

    //<editor-fold desc="======== Constructors ========">
    UserImpl(String userName, Integer goldDonated) {
        this.id = UUID.randomUUID();
        this.userName = userName;
        this.goldDonated = goldDonated;
    }

    UserImpl(UUID id, String userName, Integer goldDonated) {
        this.id = id;
        this.userName = userName;
        this.goldDonated = goldDonated;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    @Override
    public UUID getId() {
        return this.id;
    }
    //</editor-fold>

    //<editor-fold desc="Name">
    @Override
    public String getName() {
        return this.userName;
    }
    //</editor-fold>

    //<editor-fold desc="Gold">
    @Override
    public Integer getGold() {
        return this.goldDonated;
    }

    @Override
    public void addGold(Integer amount) {
        this.goldDonated += amount;
    }
    //</editor-fold>
    //</editor-fold>
}
