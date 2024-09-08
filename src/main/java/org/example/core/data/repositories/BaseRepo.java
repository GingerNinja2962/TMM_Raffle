package org.example.core.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepo<E, ID> extends JpaRepository<E, ID> {

    default E findByID(ID id) {
        return this.findById(id).orElse(null);
    }
}
