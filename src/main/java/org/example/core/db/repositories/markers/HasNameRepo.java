package org.example.core.db.repositories.markers;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface HasNameRepo<E> {

    //<editor-fold desc="Name">
    List<E> findByName(String name);

    List<E> findByName(String name, Sort sort);
    //</editor-fold>
}
