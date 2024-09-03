package org.example.core.repositories;

import org.example.core.domain.models.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<User, UUID> {

    List<User> findByName(@Param("name") String userName);
    List<User> findByName(@Param("name") String userName, Sort sort);
}
