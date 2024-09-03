package org.example.core.domain.valueObjects;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Item {

    UUID getId();
    void setId(UUID id);

    LocalDateTime getCreationDate();
    void setCreationDate(LocalDateTime creationDate);

    String getName();
    void setName(String name);

    Integer getValue();
    void setValue(Integer value);

    boolean isAvailable();
    void setAvailable(boolean available);
    void markAsSold();
}
