package org.example.core.db.repositories.markers;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface HasValidityRepo<E> {
    List<E> findByValidity(Boolean validity);

    List<E> findByValidity(Boolean validity, Sort sort);
}
