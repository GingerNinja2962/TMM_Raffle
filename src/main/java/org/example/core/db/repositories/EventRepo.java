package org.example.core.db.repositories;

import org.example.core.db.entities.BaseEntity;
import org.example.core.db.repositories.markers.HasDateRepo;
import org.example.core.db.repositories.markers.HasNameRepo;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepo<E extends BaseEntity, ID> extends BaseRepo<E, ID>, HasNameRepo<E>, HasDateRepo<E> {

    //<editor-fold desc="Ticket Cost">
    List<E> findByCostPerTicket(@Param("costPerTicket") Integer costPerTicket);

    List<E> findByCostPerTicket(@Param("costPerTicket") Integer costPerTicket, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Cost">
    List<E> findByBonusTicketCost(@Param("bonusTicketCost") Integer bonusTicketCost);

    List<E> findByBonusTicketCost(@Param("bonusTicketCost") Integer bonusTicketCost, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Bonus Ticket Amount">
    List<E> findByBonusTicketAmount(@Param("bonusTicketAmount") Integer bonusTicketAmount);

    List<E> findByBonusTicketAmount(@Param("bonusTicketAmount") Integer bonusTicketAmount, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Ticket Cost">
    List<E> findByMaxTicketCount(@Param("maxTicketCount") Integer maxTicketCount);

    List<E> findByMaxTicketCount(@Param("maxTicketCount") Integer maxTicketCount, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Ticket Cost">
    List<E> findByMaxRewardsPerUser(@Param("maxRewardsPerUser") Integer maxRewardsPerUser);

    List<E> findByMaxRewardsPerUser(@Param("maxRewardsPerUser") Integer maxRewardsPerUser, Sort sort);
    //</editor-fold>
}
