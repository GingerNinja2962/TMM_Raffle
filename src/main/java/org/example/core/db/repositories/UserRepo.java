package org.example.core.db.repositories;

import org.example.core.db.entities.BaseEntity;
import org.example.core.db.repositories.markers.HasNameRepo;
import org.example.core.db.repositories.markers.HasValueRepo;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo<E extends BaseEntity, ID> extends BaseRepo<E, ID>, HasNameRepo<E>, HasValueRepo<E> {

    //<editor-fold desc="Name">
    List<E> findByName(@Param("userName") String userName);

    List<E> findByName(@Param("userName") String userName, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Value">
    List<E> findByValue(@Param("goldDonated") Integer goldDonated);

    List<E> findByValue(@Param("goldDonated") Integer goldDonated, Sort sort);
    //</editor-fold>
}
