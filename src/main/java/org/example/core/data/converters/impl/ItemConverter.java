package org.example.core.data.converters.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.core.data.converters.Converter;
import org.example.core.data.entities.impl.ItemEntity;
import org.example.core.domain.value_objects.Item;
import org.example.core.domain.value_objects.impl.ItemImpl;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemConverter implements Converter<ItemEntity, Item> {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public Item convertFromEntity(@NonNull ItemEntity entity) {
        if (hasNullValues(entity, "convertFromEntity"))
            return null;

        Item item = new ItemImpl(entity.getId(), entity.getName(), entity.getGoldValue(), entity.getValidity(), entity.getCreationDate());
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s",
                this.getClass().getName(), "convertFromEntity", entity));
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
        if (hasNullValues(pojo, "convertToEntity"))
            return null;

        ItemEntity entity = new ItemEntity(pojo.getId(), pojo.getName(), pojo.getValue(), pojo.isAvailable(), pojo.getCreationDate());
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s",
                this.getClass().getName(), "convertToEntity", entity));
        return entity;
    }

    //<editor-fold desc="Null Checks">
    private boolean hasNullValues(ItemEntity entity, String methodName) {
        return checkNull(entity.getId() == null, entity.getName() == null, entity.getGoldValue() == null, entity.getValidity() == null, entity.getCreationDate() == null, methodName);
    }

    private boolean hasNullValues(Item pojo, String methodName) {
        return checkNull(pojo.getId() == null, pojo.getName() == null, pojo.getValue() == null, pojo.isAvailable() == null, pojo.getCreationDate() == null, methodName);
    }

    private boolean checkNull(boolean id, boolean name, boolean goldValue, boolean validity, boolean creationDate, String methodName) {
        boolean result = false;
        if (id) {
            logger.log(Level.ERROR, "'{}'s method '{}' cannot convert due to 'id' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (name) {
            logger.log(Level.ERROR, "'{}'s method '{}' cannot convert due to 'name' being NULL.", this.getClass().getName(), methodName);
            result = true;
        }
        if (goldValue) {
            logger.log(Level.ERROR, "'{}'s method '{}' cannot convert due to 'goldValue' being NULL.", this.getClass().getName(), methodName);
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
