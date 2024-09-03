package org.example.core.domain.models;

import java.util.UUID;

public interface RaffleEvent {

    // Event ID
    UUID getId();

    // Cost per Ticket
    int getCostPerTicket();
    void setCostPerTicket(int costPerTicket);

    // Cost per Bonus Ticket (non-subtractive)
    int getBonusTicketCost();
    void setBonusTicketCost(int bonusTicketCost);

    // Amount of Bonus Tickets given per Bonus received
    int getBonusTicketAmount();
    void setBonusTicketAmount(int bonusTicketAmount);

    // Max amount of Tickets allowed per user
    int getMaxTicketCount();
    void setMaxTicketCount(int maxTicketCount);

    // Max amount of wins each user may have
    int getMaxRewardsPerUser();
    void setMaxRewardsPerUser(int maxRewardsPerUser);
}
