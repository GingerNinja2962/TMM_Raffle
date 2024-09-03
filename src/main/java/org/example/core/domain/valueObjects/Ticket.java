package org.example.core.domain.valueObjects;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Ticket {

    UUID getId();

    LocalDateTime getCreationDate();

    boolean isValid();
    void markAsUsed();
}
