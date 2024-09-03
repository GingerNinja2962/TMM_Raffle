package org.example.core.domain.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TMM_Items", schema = "TMM_Raffle")
public class Item {

    @Id
    private UUID ID;
    private LocalDateTime CreationDate;
    private boolean Available = true;
    private String Name;
    private Integer Value;

    //<editor-fold desc="======== Constructors ========">
    public Item() {}
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID">
    public UUID getId() {
        return this.ID;
    }

    public void setId(UUID id) {
        this.ID = id;
    }
    //</editor-fold>

    //<editor-fold desc="Creation Date">
    public LocalDateTime getCreationDate() {
        return this.CreationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.CreationDate = creationDate;
    }
    //</editor-fold>

    //<editor-fold desc="Name">
    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    //</editor-fold>

    //<editor-fold desc="Value">
    public Integer getValue() {
        return this.Value;
    }

    public void setValue(Integer value) {
        this.Value = value;
    }
    //</editor-fold>

    //<editor-fold desc="Availability">
    public boolean getAvailable() {
        return this.Available;
    }

    public void setAvailable(boolean available) {
        Available = available;
    }
    //</editor-fold>
    //</editor-fold>
}
