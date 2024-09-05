package org.example.core.db.repositories;

import org.example.core.db.entities.BaseEntity;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EntryRepo<E extends BaseEntity, ID> extends BaseRepo<E, ID> {

    //<editor-fold desc="User">
    List<E> findByUserId(UUID userId);

    List<E> findByUserId(UUID userId, Sort sort);

    List<E> findByUserName(String userName);

    List<E> findByUserName(String userName, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Ticket">
    E findByTicketId(UUID ticketId);

    E findByTicketId(UUID ticketId, Sort sort);

    List<E> findByTicketValidity(Boolean ticketValidity);

    List<E> findByTicketValidity(Boolean ticketValidity, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Event">
    List<E> findByEventId(UUID eventId);

    List<E> findByEventId(UUID eventId, Sort sort);
    //</editor-fold>
}
