package org.example.core.domain.models;

import java.util.UUID;

public interface Entry {

    UUID getId();

    RaffleEvent getRaffleEvent();

    User getUser();

    Ticket getTicket();
}
