package org.example.core.db.repositories.markers;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;

import java.time.LocalDateTime;
import java.util.List;

@NoRepositoryBean
public interface HasDateRepo<E> {
    List<E> findByDate(LocalDateTime issuedAt);

    List<E> findByDate(LocalDateTime issuedAt, Sort sort);
}
