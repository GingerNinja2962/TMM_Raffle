package org.example.core.data.converters.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.core.data.converters.Converter;
import org.example.core.data.entities.impl.EventEntity;
import org.example.core.domain.value_objects.Event;
import org.example.core.domain.value_objects.impl.EventImpl;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EventConverter implements Converter<EventEntity, Event> {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public Event convertFromEntity(@NonNull EventEntity entity) {
        if (hasNullValues(entity, this.getClass().getEnclosingMethod().getName()))
            return null;

        Event Event = new EventImpl(entity.getId(), entity.getCostPerTicket(), entity.getBonusTicketCost(),
                entity.getBonusTicketAmount(), entity.getMaxTicketCount(), entity.getMaxRewardsPerUser());
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s", this.getClass().getName(),
                this.getClass().getEnclosingMethod().getName(), entity));
        return Event;
    }

    @Override
    public List<Event> convertFromEntities(@NonNull List<EventEntity> entities) {
        List<Event> Events = new ArrayList<>();
        entities.forEach(entity -> {
            if (entity == null)
                return;
            Event Event = convertFromEntity(entity);
            if (Event != null)
                Events.add(Event);
        });
        return Events;
    }

    @Override
    public EventEntity convertToEntity(@NonNull Event pojo) {
        if (hasNullValues(pojo, this.getClass().getEnclosingMethod().getName()))
            return null;

        EventEntity entity = new EventEntity(pojo.getId(), pojo.getCostPerTicket(), pojo.getBonusTicketCost(),
                pojo.getBonusTicketAmount(), pojo.getMaxTicketCount(), pojo.getMaxRewardsPerUser());
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s", this.getClass().getName(),
                this.getClass().getEnclosingMethod().getName(), entity));
        return entity;
    }

    //<editor-fold desc="Null Checks">
    private boolean hasNullValues(EventEntity entity, String methodName) {
        return checkNull(entity.getId() == null, entity.getCostPerTicket() == null,
                entity.getBonusTicketCost() == null, entity.getBonusTicketAmount() == null,
                entity.getMaxTicketCount() == null, entity.getMaxRewardsPerUser() == null, methodName);
    }

    private boolean hasNullValues(Event pojo, String methodName) {
        return checkNull(pojo.getId() == null, pojo.getCostPerTicket() == null,
                pojo.getBonusTicketCost() == null, pojo.getBonusTicketAmount() == null,
                pojo.getMaxTicketCount() == null, pojo.getMaxRewardsPerUser() == null, methodName);
    }

    private boolean checkNull(boolean id, boolean costPerTicket, boolean bonusTicketCost, boolean bonusTicketAmount,
                              boolean maxTicketCount, boolean maxRewardsPerUser, String methodName) {
        boolean result = false;
        if (id) {
            logger.log(Level.ERROR, "{}'s method {} cannot convert due to 'id' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (costPerTicket) {
            logger.log(Level.ERROR, "{}'s method {} cannot convert due to 'costPerTicket' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (bonusTicketCost) {
            logger.log(Level.ERROR, "{}'s method {} cannot convert due to 'bonusTicketCost' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (bonusTicketAmount) {
            logger.log(Level.ERROR, "{}'s method {} cannot convert due to 'bonusTicketAmount' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (maxTicketCount) {
            logger.log(Level.ERROR, "{}'s method {} cannot convert due to 'maxTicketCount' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (maxRewardsPerUser) {
            logger.log(Level.ERROR, "{}'s method {} cannot convert due to 'maxRewardsPerUser' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        return result;
    }
    //</editor-fold>
}
