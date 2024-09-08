package org.example.core.data.repositories.markers;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;

import java.time.LocalDateTime;
import java.util.List;

@NoRepositoryBean
public interface HasDateRepo<E> {

    //<editor-fold desc="Date">
    List<E> findByCreationDate(LocalDateTime creationDate);

    List<E> findByCreationDate(LocalDateTime creationDate, Sort sort);
    //</editor-fold>
}
