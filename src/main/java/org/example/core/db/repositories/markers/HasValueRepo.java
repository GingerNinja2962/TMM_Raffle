package org.example.core.db.repositories.markers;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface HasValueRepo<E> {

    //<editor-fold desc="Value">
    List<E> findByValue(Integer value);

    List<E> findByValue(Integer value, Sort sort);
    //</editor-fold>
}
