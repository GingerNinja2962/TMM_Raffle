package org.example.core.db.repositories;

import org.example.core.db.entities.BaseEntity;
import org.example.core.db.repositories.markers.HasDateRepo;
import org.example.core.db.repositories.markers.HasValidityRepo;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TicketRepo<E extends BaseEntity, ID> extends BaseRepo<E, ID>, HasValidityRepo<E>, HasDateRepo<E> {

    //<editor-fold desc="Date">
    List<E> findByDate(@Param("issuedAt") LocalDateTime issuedAt);

    List<E> findByDate(@Param("issuedAt") LocalDateTime issuedAt, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Validity">
    List<E> findByValidity(@Param("validity") Boolean validity);

    List<E> findByValidity(@Param("validity") Boolean validity, Sort sort);
    //</editor-fold>
}
