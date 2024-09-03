package org.example.core.domain.valueObjects.impl;

import org.example.core.domain.valueObjects.RaffleEvent;

import java.util.UUID;

public class RaffleEventImpl implements RaffleEvent {

    private final UUID ID;
    private int costPerTicket;
    private int bonusTicketCost;
    private int bonusTicketAmount;
    private int maxTicketCount;
    private int maxRewardsPerUser;

    //<editor-fold desc="======== Constructors ========">
    RaffleEventImpl(int costPerTicket, int bonusTicketCost, int maxTicketCount, int maxRewardsPerUser) {
        this.ID = UUID.randomUUID();
        this.costPerTicket = costPerTicket;
        this.bonusTicketCost = bonusTicketCost;
        this.maxTicketCount = maxTicketCount;
        this.maxRewardsPerUser = maxRewardsPerUser;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID Methods">
    @Override
    public UUID getId() {
        return this.ID;
    }
    //</editor-fold>

    //<editor-fold desc="Cost per Ticket">
    @Override
    public int getCostPerTicket() {
        return this.costPerTicket;
    }

    @Override
    public void setCostPerTicket(int costPerTicket) {
        this.costPerTicket = costPerTicket;
    }
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Cost">
    @Override
    public int getBonusTicketCost() {
        return this.bonusTicketCost;
    }

    @Override
    public void setBonusTicketCost(int bonusTicketCost) {
        this.bonusTicketCost = bonusTicketCost;
    }
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Amount">
    @Override
    public int getBonusTicketAmount() {
        return this.bonusTicketAmount;
    }

    @Override
    public void setBonusTicketAmount(int bonusTicketAmount) {
        this.bonusTicketAmount = bonusTicketAmount;
    }
    //</editor-fold>

    //<editor-fold desc="Max Ticket per User">
    @Override
    public int getMaxTicketCount() {
        return this.maxTicketCount;
    }

    @Override
    public void setMaxTicketCount(int maxTicketCount) {
        this.maxTicketCount = maxTicketCount;
    }
    //</editor-fold>

    //<editor-fold desc="Max Rewards per User">
    @Override
    public int getMaxRewardsPerUser() {
        return this.maxRewardsPerUser;
    }

    @Override
    public void setMaxRewardsPerUser(int maxRewardsPerUser) {
        this.maxRewardsPerUser = maxRewardsPerUser;
    }
    //</editor-fold>
    //</editor-fold>
}
