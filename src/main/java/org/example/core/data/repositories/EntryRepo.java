package org.example.core.data.repositories;

import org.example.core.data.entities.impl.EntryEntity;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EntryRepo<ID> extends BaseRepo<EntryEntity, ID> {

    //<editor-fold desc="User">
    List<EntryEntity> findByUserId(UUID userId);

    List<EntryEntity> findByUserId(UUID userId, Sort sort);

    List<EntryEntity> findByUserName(String userName);

    List<EntryEntity> findByUserName(String userName, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Ticket">
    EntryEntity findByTicketId(UUID ticketId);

    EntryEntity findByTicketId(UUID ticketId, Sort sort);

    List<EntryEntity> findByTicketValidity(Boolean ticketValidity);

    List<EntryEntity> findByTicketValidity(Boolean ticketValidity, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Event">
    List<EntryEntity> findByEventId(UUID eventId);

    List<EntryEntity> findByEventId(UUID eventId, Sort sort);
    //</editor-fold>
}
