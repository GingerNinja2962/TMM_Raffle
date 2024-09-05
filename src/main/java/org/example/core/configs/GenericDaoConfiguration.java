package org.example.core.configs;

import org.example.core.db.converters.Converter;
import org.example.core.db.dao.impl.GenericDao;
import org.example.core.db.entities.impl.*;
import org.example.core.db.repositories.EntryRepo;
import org.example.core.domain.value_objects.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class GenericDaoConfiguration {

    @Autowired
    private EntryRepo<EntryEntity, UUID> entryRepo;
    @Autowired
    private Converter<EntryEntity, Entry> entryConverter;

    @Autowired
    private EntryRepo<EventEntity, UUID> eventRepo;
    @Autowired
    private Converter<EventEntity, Event> eventConverter;

    @Autowired
    private EntryRepo<ItemEntity, UUID> itemRepo;
    @Autowired
    private Converter<ItemEntity, Item> itemConverter;

    @Autowired
    private EntryRepo<TicketEntity, UUID> ticketRepo;
    @Autowired
    private Converter<TicketEntity, Ticket> ticketConverter;

    @Autowired
    private EntryRepo<UserEntity, UUID> userRepo;
    @Autowired
    private Converter<UserEntity, User> userConverter;

    @Bean
    public GenericDao<EntryEntity, Entry, UUID> entryDao() {
        return new GenericDao<>(entryRepo, entryConverter);
    }

    @Bean
    public GenericDao<EventEntity, Event, UUID> eventDao() {
        return new GenericDao<>(eventRepo, eventConverter);
    }

    @Bean
    public GenericDao<ItemEntity, Item, UUID> itemDao() {
        return new GenericDao<>(itemRepo, itemConverter);
    }

    @Bean
    public GenericDao<TicketEntity, Ticket, UUID> ticketDao() {
        return new GenericDao<>(ticketRepo, ticketConverter);
    }

    @Bean
    public GenericDao<UserEntity, User, UUID> userDao() {
        return new GenericDao<>(userRepo, userConverter);
    }
}
