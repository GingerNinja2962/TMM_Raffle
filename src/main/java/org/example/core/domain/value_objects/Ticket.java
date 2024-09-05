package org.example.core.domain.value_objects;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Ticket {

    UUID getId();

    LocalDateTime getCreationDate();

    boolean isValid();
    void markAsUsed();
}
