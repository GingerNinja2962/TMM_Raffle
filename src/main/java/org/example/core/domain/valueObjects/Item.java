package org.example.core.domain.valueObjects;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Item {

    UUID getId();

    LocalDateTime getCreationDate();

    String getName();
    void changeName(String name);

    Integer getValue();
    void changeValue(Integer value);

    boolean isAvailable();
    void markAsSold();
}
