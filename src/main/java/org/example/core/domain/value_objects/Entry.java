package org.example.core.domain.value_objects;

import java.util.UUID;

public interface Entry {

    UUID getId();

    Event getEvent();

    User getUser();

    Ticket getTicket();
}
