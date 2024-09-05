package org.example.core.domain.value_objects.impl;

import org.example.core.domain.value_objects.Event;

import java.util.UUID;

public class EventImpl implements Event {

    private final UUID id;
    private Integer costPerTicket;
    private Integer bonusTicketCost;
    private Integer bonusTicketAmount;
    private Integer maxTicketCount;
    private Integer maxRewardsPerUser;

    //<editor-fold desc="======== Constructors ========">
    EventImpl(Integer costPerTicket, Integer bonusTicketCost, Integer bonusTicketAmount, Integer maxTicketCount, Integer maxRewardsPerUser) {
        this.id = UUID.randomUUID();
        this.costPerTicket = costPerTicket;
        this.bonusTicketCost = bonusTicketCost;
        this.bonusTicketAmount = bonusTicketAmount;
        this.maxTicketCount = maxTicketCount;
        this.maxRewardsPerUser = maxRewardsPerUser;
    }

    EventImpl(UUID id, Integer costPerTicket, Integer bonusTicketCost, Integer bonusTicketAmount, Integer maxTicketCount, Integer maxRewardsPerUser) {
        this.id = id;
        this.costPerTicket = costPerTicket;
        this.bonusTicketCost = bonusTicketCost;
        this.bonusTicketAmount = bonusTicketAmount;
        this.maxTicketCount = maxTicketCount;
        this.maxRewardsPerUser = maxRewardsPerUser;
    }
    //</editor-fold>

    //<editor-fold desc="======== Getters & Setters ========">
    //<editor-fold desc="ID Methods">
    @Override
    public UUID getId() {
        return this.id;
    }
    //</editor-fold>

    //<editor-fold desc="Cost per Ticket">
    @Override
    public Integer getCostPerTicket() {
        return this.costPerTicket;
    }

    @Override
    public void setCostPerTicket(Integer costPerTicket) {
        this.costPerTicket = costPerTicket;
    }
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Cost">
    @Override
    public Integer getBonusTicketCost() {
        return this.bonusTicketCost;
    }

    @Override
    public void setBonusTicketCost(Integer bonusTicketCost) {
        this.bonusTicketCost = bonusTicketCost;
    }
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Amount">
    @Override
    public Integer getBonusTicketAmount() {
        return this.bonusTicketAmount;
    }

    @Override
    public void setBonusTicketAmount(Integer bonusTicketAmount) {
        this.bonusTicketAmount = bonusTicketAmount;
    }
    //</editor-fold>

    //<editor-fold desc="Max Ticket per User">
    @Override
    public Integer getMaxTicketCount() {
        return this.maxTicketCount;
    }

    @Override
    public void setMaxTicketCount(Integer maxTicketCount) {
        this.maxTicketCount = maxTicketCount;
    }
    //</editor-fold>

    //<editor-fold desc="Max Rewards per User">
    @Override
    public Integer getMaxRewardsPerUser() {
        return this.maxRewardsPerUser;
    }

    @Override
    public void setMaxRewardsPerUser(Integer maxRewardsPerUser) {
        this.maxRewardsPerUser = maxRewardsPerUser;
    }
    //</editor-fold>
    //</editor-fold>
}
