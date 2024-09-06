package org.example.core.data.repositories;

import org.example.core.data.entities.impl.TicketEntity;
import org.example.core.data.repositories.markers.HasDateRepo;
import org.example.core.data.repositories.markers.HasValidityRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo<ID> extends BaseRepo<TicketEntity, ID>, HasValidityRepo<TicketEntity>, HasDateRepo<TicketEntity> {
}
