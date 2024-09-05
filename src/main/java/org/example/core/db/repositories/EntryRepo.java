package org.example.core.db.repositories;

import org.example.core.db.entities.BaseEntity;
import org.example.core.db.repositories.markers.HasNameRepo;
import org.example.core.db.repositories.markers.HasValidityRepo;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EntryRepo<E extends BaseEntity, ID> extends BaseRepo<E, ID>, HasNameRepo<E>, HasValidityRepo<E> {

    //<editor-fold desc="User">
    List<E> findByUserId(@Param("user.id") UUID userId);

    List<E> findByUserId(@Param("user.id") UUID userId, Sort sort);

    List<E> findByName(@Param("user.name") String userName);

    List<E> findByName(@Param("user.name") String userName, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Ticket">
    E findByTicketId(@Param("ticket.id") UUID ticketId);

    E findByTicketId(@Param("ticket.id") UUID ticketId, Sort sort);

    List<E> findByValidity(@Param("ticket.validity") Boolean validity);

    List<E> findByValidity(@Param("ticket.validity") Boolean validity, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Event">
    List<E> findByEventId(@Param("event.id") UUID eventId);

    List<E> findByEventId(@Param("event.id") UUID eventId, Sort sort);
    //</editor-fold>
}
