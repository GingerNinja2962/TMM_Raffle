package org.example.core.domain.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity(name = "user")
@Table(name = "TMM_Users", schema = "TMM_Raffle")
public class User {

    @Id
    private UUID Id;
    private String userName;
    private Integer goldDonated;

    //<editor-fold desc="======== Constructors ========">
    public User() {}
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    public UUID getId() {
        return this.Id;
    }

    public void setId(UUID id) {
        this.Id = id;
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
