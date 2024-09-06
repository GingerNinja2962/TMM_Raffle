package org.example.core.data.repositories;

import org.example.core.data.entities.impl.EventEntity;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepo<ID> extends BaseRepo<EventEntity, ID> {

    //<editor-fold desc="Ticket Cost">
    List<EventEntity> findByCostPerTicket(Integer costPerTicket);

    List<EventEntity> findByCostPerTicket(Integer costPerTicket, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Cost">
    List<EventEntity> findByBonusTicketCost(Integer bonusTicketCost);

    List<EventEntity> findByBonusTicketCost(Integer bonusTicketCost, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Amount">
    List<EventEntity> findByBonusTicketAmount(Integer bonusTicketAmount);

    List<EventEntity> findByBonusTicketAmount(Integer bonusTicketAmount, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Ticket Cost">
    List<EventEntity> findByMaxTicketCount(Integer maxTicketCount);

    List<EventEntity> findByMaxTicketCount(Integer maxTicketCount, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Ticket Cost">
    List<EventEntity> findByMaxRewardsPerUser(Integer maxRewardsPerUser);

    List<EventEntity> findByMaxRewardsPerUser(Integer maxRewardsPerUser, Sort sort);
    //</editor-fold>
}
