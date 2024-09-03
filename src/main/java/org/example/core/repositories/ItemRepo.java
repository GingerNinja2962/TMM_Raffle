package org.example.core.repositories;

import org.example.core.domain.entities.Item;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ItemRepo extends JpaRepository<Item, UUID> {

    List<Item> findByName(@Param("name") String itemName);
    List<Item> findByName(@Param("name") String itemName, Sort sort);

    List<Item> findByGoldValue(@Param("goldValue") Integer value);

    @Query("SELECT i FROM Item i WHERE i.available = ?1")
    List<Item> findByAvailable(Boolean available);

    @Query("SELECT i FROM Item i WHERE i.available = ?1")
    List<Item> findByAvailable(Boolean available, Sort sort);
}
