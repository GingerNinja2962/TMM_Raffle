package org.example.core.db.converters.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.core.db.converters.Converter;
import org.example.core.db.entities.impl.ItemEntity;
import org.example.core.domain.value_objects.Item;
import org.example.core.domain.value_objects.impl.ItemImpl;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class ItemConverter implements Converter<ItemEntity, Item> {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public Item convertFromEntity(@NonNull ItemEntity entity) {
        if (checkNullValues(entity.getId(), entity.getName(), entity.getValue(), entity.getValidity(), entity.getCreationDate(),
                this.getClass().getEnclosingMethod().getName()))
            return null;

        Item item = new ItemImpl(entity.getId(), entity.getName(), entity.getValue(), entity.getValidity(), entity.getCreationDate());
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s", this.getClass().getName(),
                this.getClass().getEnclosingMethod().getName(), entity));
        return item;
    }

    @Override
    public List<Item> convertFromEntities(@NonNull List<ItemEntity> entities) {
        List<Item> items = new ArrayList<>();
        entities.forEach(entity -> {
            if (entity == null)
                return;
            Item item = convertFromEntity(entity);
            if (item != null)
                items.add(item);
        });
        return items;
    }

    @Override
    public ItemEntity convertToEntity(@NonNull Item pojo) {
        if (checkNullValues(pojo.getId(), pojo.getName(), pojo.getValue(), pojo.isAvailable(), pojo.getCreationDate(),
                this.getClass().getEnclosingMethod().getName()))
            return null;

        ItemEntity entity = new ItemEntity(pojo.getId(), pojo.getName(), pojo.getValue(), pojo.isAvailable(), pojo.getCreationDate());
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s", this.getClass().getName(),
                this.getClass().getEnclosingMethod().getName(), entity));
        return entity;
    }

    private boolean checkNullValues(UUID id, String name, Integer goldValue, Boolean availability, LocalDateTime creationDate, String methodName) {
        boolean result = false;
        if (id == null) {
            logger.log(Level.ERROR, "{} cannot convert due to 'id' being NULL.", methodName);
            result = true;
        }
        if (name == null) {
            logger.log(Level.ERROR, "{} cannot convert due to 'name' being NULL.", methodName);
            result = true;
        }
        if (goldValue == null) {
            logger.log(Level.ERROR, "{} cannot convert due to 'goldValue' being NULL.", methodName);
            result = true;
        }
        if (availability == null) {
            logger.log(Level.ERROR, "{} cannot convert due to 'availability' being NULL.", methodName);
            result = true;
        }
        if (creationDate == null) {
            logger.log(Level.ERROR, "{} cannot convert due to 'creationDate' being NULL.", methodName);
            result = true;
        }
        return result;
    }
}
