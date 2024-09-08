package org.example.core.data.converters.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.core.data.converters.Converter;
import org.example.core.data.entities.impl.TicketEntity;
import org.example.core.domain.value_objects.Ticket;
import org.example.core.domain.value_objects.impl.TicketImpl;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TicketConverter implements Converter<TicketEntity, Ticket> {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public Ticket convertFromEntity(@NonNull TicketEntity entity) {
        if (hasNullValues(entity, "convertFromEntity"))
            return null;

        Ticket Ticket = new TicketImpl(entity.getId(), entity.getValidity(), entity.getCreationDate());
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s",
                this.getClass().getName(), "convertFromEntity", entity));
        return Ticket;
    }

    @Override
    public List<Ticket> convertFromEntities(@NonNull List<TicketEntity> entities) {
        List<Ticket> tickets = new ArrayList<>();
        entities.forEach(entity -> {
            if (entity == null)
                return;
            Ticket ticket = convertFromEntity(entity);
            if (ticket != null)
                tickets.add(ticket);
        });
        return tickets;
    }

    @Override
    public TicketEntity convertToEntity(@NonNull Ticket pojo) {
        if (hasNullValues(pojo, "convertToEntity"))
            return null;

        TicketEntity entity = new TicketEntity(pojo.getId(), pojo.isValid(), pojo.getCreationDate());
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s",
                this.getClass().getName(), "convertToEntity", entity));
        return entity;
    }

    //<editor-fold desc="Null Checks">
    private boolean hasNullValues(TicketEntity entity, String methodName) {
        return checkNull(entity.getId() == null, entity.getValidity() == null,
                entity.getCreationDate() == null, methodName);
    }

    private boolean hasNullValues(Ticket pojo, String methodName) {
        return checkNull(pojo.getId() == null, pojo.isValid() == null,
                pojo.getCreationDate() == null, methodName);
    }

    private boolean checkNull(boolean id, boolean validity, boolean creationDate, String methodName) {
        boolean result = false;
        if (id) {
            logger.log(Level.ERROR, "'{}'s method '{}' cannot convert due to 'id' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (validity) {
            logger.log(Level.ERROR, "'{}'s method '{}' cannot convert due to 'validity' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (creationDate) {
            logger.log(Level.ERROR, "'{}'s method '{}' cannot convert due to 'creationDate' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        return result;
    }
    //</editor-fold>
}
