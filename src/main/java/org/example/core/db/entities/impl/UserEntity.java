package org.example.core.db.entities.impl;

import jakarta.persistence.Entity;
import org.example.core.db.entities.BaseEntity;

import java.util.UUID;

@Entity(name = "user")
//@Table(name = "TMM_Users", schema = "TMM_Raffle")
public class UserEntity extends BaseEntity {

    private String name;
    private Integer value;

    //<editor-fold desc="======== Constructors ========">
    public UserEntity() {
    }

    public UserEntity(UUID id, String name, Integer value) {
        this.id = id;
        this.name = name;
        this.value = value;
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

    //<editor-fold desc="Value">
    public Integer getValue() {
        return this.value;
    }

    public void setValue(Integer amount) {
        this.value = amount;
    }
    //</editor-fold>
    //</editor-fold>
}
