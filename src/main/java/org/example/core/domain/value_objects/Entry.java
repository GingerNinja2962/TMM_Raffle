package org.example.core.domain.value_objects;

import java.util.UUID;

public interface Entry {

    UUID getId();

    Event getRaffleEvent();

    User getUser();

    Ticket getTicket();
}
