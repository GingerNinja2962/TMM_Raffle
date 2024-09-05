package org.example.core.db.entities.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.core.db.entities.BaseEntity;

import java.util.UUID;

@Entity(name = "user")
//@Table(name = "TMM_Users", schema = "TMM_Raffle")
public class UserEntity implements BaseEntity {

    @Id
    private UUID id;
    private String userName;
    private Integer goldDonated;

    //<editor-fold desc="======== Constructors ========">
    public UserEntity() {
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    //</editor-fold>

    //<editor-fold desc="UserName">
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    //</editor-fold>

    //<editor-fold desc="Gold">
    public Integer getGoldDonated() {
        return this.goldDonated;
    }

    public void setGoldDonated(Integer amount) {
        this.goldDonated = amount;
    }
    //</editor-fold>
    //</editor-fold>
}
