package org.example.core.domain.value_objects;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Item {

    UUID getId();

    LocalDateTime getCreationDate();

    String getName();
    void changeName(String name);

    Integer getValue();
    void changeValue(Integer value);

    Boolean isAvailable();
    void markAsSold();
}
