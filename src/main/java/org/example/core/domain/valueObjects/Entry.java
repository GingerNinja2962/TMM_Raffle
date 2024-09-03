package org.example.core.domain.valueObjects;

import java.util.UUID;

public interface Entry {

    UUID getId();

    RaffleEvent getRaffleEvent();

    User getUser();

    Ticket getTicket();
}
