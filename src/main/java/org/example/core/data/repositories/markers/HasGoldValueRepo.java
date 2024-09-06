package org.example.core.data.repositories.markers;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface HasGoldValueRepo<E> {

    //<editor-fold desc="Gold Value">
    List<E> findByGoldValue(Integer goldValue);

    List<E> findByGoldValue(Integer goldValue, Sort sort);
    //</editor-fold>
}
