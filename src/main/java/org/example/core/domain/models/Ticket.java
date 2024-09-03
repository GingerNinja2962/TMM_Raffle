package org.example.core.domain.models;

import java.time.LocalDateTime;
import java.util.UUID;

public interface Ticket {

    UUID getId();

    LocalDateTime getCreationDate();

    boolean isValid();
    void markAsUsed();
}
