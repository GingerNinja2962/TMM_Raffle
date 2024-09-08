package org.example.core.services;

import org.example.core.data.dao.impl.GenericDao;
import org.example.core.data.entities.impl.*;
import org.example.core.domain.value_objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SomethingService {
    // TODO find a suitable design for services
    // either one service per (Entity) or
    // one service per application aspect. (see Design file for more info)

    GenericDao<EntryEntity, Entry, UUID> entryDao;
    GenericDao<EventEntity, Event, UUID> eventDao;
    GenericDao<ItemEntity, Item, UUID> itemDao;
    GenericDao<TicketEntity, Ticket, UUID> ticketDao;
    GenericDao<UserEntity, User, UUID> userDao;

    @Autowired
    public SomethingService(GenericDao<EntryEntity, Entry, UUID> entryDao, GenericDao<EventEntity, Event, UUID> eventDao,
                            GenericDao<ItemEntity, Item, UUID> itemDao, GenericDao<TicketEntity, Ticket, UUID> ticketDao,
                            GenericDao<UserEntity, User, UUID> userDao) {
        this.entryDao = entryDao;
        this.eventDao = eventDao;
        this.itemDao = itemDao;
        this.ticketDao = ticketDao;
        this.userDao = userDao;
    }


}
