package org.example.core.data.entities.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.example.core.data.entities.BaseEntity;

import java.util.UUID;

@Entity(name = "user")
@Table(name = "TMM_Users", schema = "TMM_Raffle")
public class UserEntity extends BaseEntity {

    private String name;
    private Integer goldValue;

    //<editor-fold desc="======== Constructors ========">
    public UserEntity() {
    }

    public UserEntity(UUID id, String name, Integer goldValue) {
        this.id = id;
        this.name = name;
        this.goldValue = goldValue;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="Name">
    public String getName() {
        return this.name;
    }

    public void setName(String userName) {
        this.name = userName;
    }
    //</editor-fold>

    //<editor-fold desc="Gold Value">
    public Integer getGoldValue() {
        return this.goldValue;
    }

    public void setGoldValue(Integer amount) {
        this.goldValue = amount;
    }
    //</editor-fold>
    //</editor-fold>

    @Override
    public String toString() {
        return String.format("User: {ID: %s, Name: %s, GoldValue: %s}", this.id, this.name, this.goldValue);
    }
}
