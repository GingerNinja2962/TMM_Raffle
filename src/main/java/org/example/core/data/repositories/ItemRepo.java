package org.example.core.data.repositories;

import org.example.core.data.entities.impl.ItemEntity;
import org.example.core.data.repositories.markers.HasDateRepo;
import org.example.core.data.repositories.markers.HasGoldValueRepo;
import org.example.core.data.repositories.markers.HasNameRepo;
import org.example.core.data.repositories.markers.HasValidityRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo<ID> extends BaseRepo<ItemEntity, ID>, HasNameRepo<ItemEntity>,
        HasGoldValueRepo<ItemEntity>, HasValidityRepo<ItemEntity>, HasDateRepo<ItemEntity> {
}
