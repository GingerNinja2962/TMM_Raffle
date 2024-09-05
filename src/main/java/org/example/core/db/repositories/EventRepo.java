package org.example.core.db.repositories;

import org.example.core.db.entities.BaseEntity;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepo<E extends BaseEntity, ID> extends BaseRepo<E, ID> {

    //<editor-fold desc="Ticket Cost">
    List<E> findByCostPerTicket(Integer costPerTicket);

    List<E> findByCostPerTicket(Integer costPerTicket, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Cost">
    List<E> findByBonusTicketCost(Integer bonusTicketCost);

    List<E> findByBonusTicketCost(Integer bonusTicketCost, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Amount">
    List<E> findByBonusTicketAmount(Integer bonusTicketAmount);

    List<E> findByBonusTicketAmount(Integer bonusTicketAmount, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Ticket Cost">
    List<E> findByMaxTicketCount(Integer maxTicketCount);

    List<E> findByMaxTicketCount(Integer maxTicketCount, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Ticket Cost">
    List<E> findByMaxRewardsPerUser(Integer maxRewardsPerUser);

    List<E> findByMaxRewardsPerUser(Integer maxRewardsPerUser, Sort sort);
    //</editor-fold>
}
