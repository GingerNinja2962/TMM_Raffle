package org.example.core.db.repositories;

import org.example.core.db.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepo<E extends BaseEntity, ID> extends JpaRepository<E, ID> {
}
