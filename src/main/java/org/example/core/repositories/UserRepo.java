package org.example.core.repositories;

import org.example.core.domain.entities.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepo extends JpaRepository<User, UUID> {

    List<User> findByUserName(String userName);
    List<User> findByUserName(String userName, Sort sort);

    List<User> findByGoldDonated(Integer goldDonated);
    List<User> findByGoldDonated(Integer goldDonated, Sort sort);
}
