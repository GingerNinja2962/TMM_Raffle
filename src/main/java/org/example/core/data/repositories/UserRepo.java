package org.example.core.data.repositories;

import org.example.core.data.entities.impl.UserEntity;
import org.example.core.data.repositories.markers.HasGoldValueRepo;
import org.example.core.data.repositories.markers.HasNameRepo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo<ID> extends BaseRepo<UserEntity, ID>, HasNameRepo<UserEntity>, HasGoldValueRepo<UserEntity> {
}
