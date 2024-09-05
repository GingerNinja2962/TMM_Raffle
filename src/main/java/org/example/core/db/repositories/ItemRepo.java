package org.example.core.db.repositories;

import org.example.core.db.entities.BaseEntity;
import org.example.core.db.repositories.markers.HasDateRepo;
import org.example.core.db.repositories.markers.HasNameRepo;
import org.example.core.db.repositories.markers.HasValidityRepo;
import org.example.core.db.repositories.markers.HasValueRepo;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ItemRepo<E extends BaseEntity, ID> extends BaseRepo<E, ID>, HasNameRepo<E>, HasValueRepo<E>, HasValidityRepo<E>, HasDateRepo<E> {

    //<editor-fold desc="Name">
    List<E> findByName(@Param("name") String itemName);

    List<E> findByName(@Param("name") String itemName, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Value">
    List<E> findByValue(@Param("goldValue") Integer value);

    List<E> findByValue(@Param("goldValue") Integer value, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Validity">
    List<E> findByValidity(@Param("available") Boolean validity);

    List<E> findByValidity(@Param("available") Boolean validity, Sort sort);
    //</editor-fold>

    //<editor-fold desc="Date">
    List<E> findByDate(@Param("creationDate") LocalDateTime creationDate);

    List<E> findByDate(@Param("creationDate") LocalDateTime creationDate, Sort sort);
    //</editor-fold>
}
