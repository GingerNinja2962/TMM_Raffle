package org.example.core.db.repositories;

import org.example.core.db.entities.BaseEntity;
import org.example.core.db.repositories.markers.HasDateRepo;
import org.example.core.db.repositories.markers.HasValidityRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo<E extends BaseEntity, ID> extends BaseRepo<E, ID>, HasValidityRepo<E>, HasDateRepo<E> {
}
