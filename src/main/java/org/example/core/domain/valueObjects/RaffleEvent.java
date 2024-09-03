package org.example.core.domain.valueObjects;

import java.util.UUID;

public interface RaffleEvent {

    // Event ID
    UUID getId();

    // Cost per Ticket
    Integer getCostPerTicket();
    void setCostPerTicket(Integer costPerTicket);

    // Cost per Bonus Ticket (non-subtractive)
    Integer getBonusTicketCost();
    void setBonusTicketCost(Integer bonusTicketCost);

    // Amount of Bonus Tickets given per Bonus received
    Integer getBonusTicketAmount();
    void setBonusTicketAmount(Integer bonusTicketAmount);

    // Max amount of Tickets allowed per user
    Integer getMaxTicketCount();
    void setMaxTicketCount(Integer maxTicketCount);

    // Max amount of wins each user may have
    Integer getMaxRewardsPerUser();
    void setMaxRewardsPerUser(Integer maxRewardsPerUser);
}
