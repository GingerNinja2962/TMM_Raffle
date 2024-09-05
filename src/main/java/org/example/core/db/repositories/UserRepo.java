package org.example.core.db.repositories;

import org.example.core.db.entities.BaseEntity;
import org.example.core.db.repositories.markers.HasNameRepo;
import org.example.core.db.repositories.markers.HasValueRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo<E extends BaseEntity, ID> extends BaseRepo<E, ID>, HasNameRepo<E>, HasValueRepo<E> {
}
