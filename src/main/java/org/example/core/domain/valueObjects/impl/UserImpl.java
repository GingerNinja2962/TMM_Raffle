package org.example.core.domain.valueObjects.impl;

import org.example.core.domain.valueObjects.User;

import java.util.UUID;

public class UserImpl implements User {

    private final UUID ID;
    private final String userName;
    private Integer goldDonated;

    //<editor-fold desc="======== Constructors ========">
    UserImpl(String userName, Integer goldDonated) {
        this.ID = UUID.randomUUID();
        this.userName = userName;
        this.goldDonated = goldDonated;
    }

    UserImpl(String userName) {
        this.ID = UUID.randomUUID();
        this.userName = userName;
        this.goldDonated = 0;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    @Override
    public UUID getId() {
        return this.ID;
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
    public void setGold(Integer amount) {
        this.goldDonated = amount;
    }

    @Override
    public void addGold(Integer amount) {
        this.goldDonated += amount;
    }
    //</editor-fold>
    //</editor-fold>
}
