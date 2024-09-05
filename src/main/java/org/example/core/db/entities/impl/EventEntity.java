package org.example.core.db.entities.impl;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.core.db.entities.BaseEntity;

import java.util.UUID;


@Entity(name = "raffle")
//@Table(name = "TMM_Raffles", schema = "TMM_Raffle")
public class EventEntity implements BaseEntity {

    @Id
    private UUID id;
    private Integer costPerTicket;
    private Integer bonusTicketCost;
    private Integer bonusTicketAmount;
    private Integer maxTicketCount;
    private Integer maxRewardsPerUser;

    //<editor-fold desc="======== Constructors ========">
    public EventEntity() {
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID Methods">
    public UUID getId() {
        return this.id;
    }

    public void setId(UUID ID) {
        this.id = ID;
    }
    //</editor-fold>

    //<editor-fold desc="Cost per Ticket">
    public Integer getCostPerTicket() {
        return this.costPerTicket;
    }

    public void setCostPerTicket(Integer costPerTicket) {
        this.costPerTicket = costPerTicket;
    }
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Cost">
    public Integer getBonusTicketCost() {
        return this.bonusTicketCost;
    }

    public void setBonusTicketCost(Integer bonusTicketCost) {
        this.bonusTicketCost = bonusTicketCost;
    }
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Amount">
    public Integer getBonusTicketAmount() {
        return this.bonusTicketAmount;
    }

    public void setBonusTicketAmount(Integer bonusTicketAmount) {
        this.bonusTicketAmount = bonusTicketAmount;
    }
    //</editor-fold>

    //<editor-fold desc="Max Ticket per User">
    public Integer getMaxTicketCount() {
        return this.maxTicketCount;
    }

    public void setMaxTicketCount(Integer maxTicketCount) {
        this.maxTicketCount = maxTicketCount;
    }
    //</editor-fold>

    //<editor-fold desc="Max Rewards per User">
    public Integer getMaxRewardsPerUser() {
        return this.maxRewardsPerUser;
    }

    public void setMaxRewardsPerUser(Integer maxRewardsPerUser) {
        this.maxRewardsPerUser = maxRewardsPerUser;
    }
    //</editor-fold>
    //</editor-fold>
}
