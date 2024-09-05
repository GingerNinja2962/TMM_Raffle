package org.example.core.db.repositories;

import org.example.core.db.entities.impl.ItemEntity;
import org.example.core.db.repositories.markers.HasDateRepo;
import org.example.core.db.repositories.markers.HasNameRepo;
import org.example.core.db.repositories.markers.HasValidityRepo;
import org.example.core.db.repositories.markers.HasValueRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo<ID> extends BaseRepo<ItemEntity, ID>, HasNameRepo<ItemEntity>,
        HasValueRepo<ItemEntity>, HasValidityRepo<ItemEntity>, HasDateRepo<ItemEntity> {
}
