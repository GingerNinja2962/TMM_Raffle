package org.example.core.data.converters.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.core.data.converters.Converter;
import org.example.core.data.entities.impl.EntryEntity;
import org.example.core.domain.value_objects.Entry;
import org.example.core.domain.value_objects.impl.EntryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EntryConverter implements Converter<EntryEntity, Entry> {

    private static final Logger logger = LogManager.getLogger();

    private final UserConverter userConverter;
    private final TicketConverter ticketConverter;
    private final EventConverter eventConverter;

    @Autowired
    public EntryConverter(UserConverter userConverter, TicketConverter ticketConverter, EventConverter eventConverter) {
        this.userConverter = userConverter;
        this.ticketConverter = ticketConverter;
        this.eventConverter = eventConverter;
    }

    @Override
    public Entry convertFromEntity(@NonNull EntryEntity entity) {
        if (hasNullValues(entity, this.getClass().getEnclosingMethod().getName()))
            return null;

        Entry entry = new EntryImpl(entity.getId(), userConverter.convertFromEntity(entity.getUser()),
                ticketConverter.convertFromEntity(entity.getTicket()), eventConverter.convertFromEntity(entity.getEvent()));
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s", this.getClass().getName(),
                this.getClass().getEnclosingMethod().getName(), entity));
        return entry;
    }

    @Override
    public List<Entry> convertFromEntities(@NonNull List<EntryEntity> entities) {
        List<Entry> entries = new ArrayList<>();
        entities.forEach(entity -> {
            if (entity == null)
                return;
            Entry entry = convertFromEntity(entity);
            if (entry != null)
                entries.add(entry);
        });
        return entries;
    }

    @Override
    public EntryEntity convertToEntity(@NonNull Entry pojo) {
        if (hasNullValues(pojo, this.getClass().getEnclosingMethod().getName()))
            return null;

        EntryEntity entity = new EntryEntity(pojo.getId(), userConverter.convertToEntity(pojo.getUser()),
                ticketConverter.convertToEntity(pojo.getTicket()), eventConverter.convertToEntity(pojo.getEvent()));
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s", this.getClass().getName(),
                this.getClass().getEnclosingMethod().getName(), entity));
        return entity;
    }

    //<editor-fold desc="Null Checks">
    private boolean hasNullValues(EntryEntity entity, String methodName) {
        return checkNull(entity.getId() == null, entity.getUser() == null, entity.getTicket() == null, entity.getEvent() == null, methodName);
    }

    private boolean hasNullValues(Entry pojo, String methodName) {
        return checkNull(pojo.getId() == null, pojo.getUser() == null, pojo.getTicket() == null, pojo.getEvent() == null, methodName);
    }

    private boolean checkNull(boolean id, boolean user, boolean ticket, boolean event, String methodName) {
        boolean result = false;
        if (id) {
            logger.log(Level.ERROR, "{}'s method {} cannot convert due to 'id' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (user) {
            logger.log(Level.ERROR, "{}'s method {} cannot convert due to 'user' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (ticket) {
            logger.log(Level.ERROR, "{}'s method {} cannot convert due to 'ticket' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (event) {
            logger.log(Level.ERROR, "{}'s method {} cannot convert due to 'event' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        return result;
    }
    //</editor-fold>
}
