package org.example.core.domain.value_objects;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Ticket {

    UUID getId();

    Boolean isValid();
    void markAsUsed();

    LocalDateTime getCreationDate();
}
