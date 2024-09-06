package org.example.core.data.converters.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.core.data.converters.Converter;
import org.example.core.data.entities.impl.UserEntity;
import org.example.core.domain.value_objects.User;
import org.example.core.domain.value_objects.impl.UserImpl;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserConverter implements Converter<UserEntity, User> {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public User convertFromEntity(@NonNull UserEntity entity) {
        if (hasNullValues(entity, "convertFromEntity"))
            return null;

        User user = new UserImpl(entity.getId(), entity.getName(), entity.getGoldValue());
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s",
                this.getClass().getName(), "convertFromEntity", entity));
        return user;
    }

    @Override
    public List<User> convertFromEntities(@NonNull List<UserEntity> entities) {
        List<User> users = new ArrayList<>();
        entities.forEach(entity -> {
            if (entity == null)
                return;
            User user = convertFromEntity(entity);
            if (user != null)
                users.add(user);
        });
        return users;
    }

    @Override
    public UserEntity convertToEntity(@NonNull User pojo) {
        if (hasNullValues(pojo, "convertToEntity"))
            return null;

        UserEntity entity = new UserEntity(pojo.getId(), pojo.getName(), pojo.getGold());
        logger.log(Level.DEBUG, String.format("%s's method %s successfully created -> %s",
                this.getClass().getName(), "convertToEntity", entity));
        return entity;
    }

    //<editor-fold desc="Null Checks">
    private boolean hasNullValues(UserEntity entity, String methodName) {
        return checkNull(entity.getId() == null, entity.getName() == null, entity.getGoldValue() == null, methodName);
    }

    private boolean hasNullValues(User pojo, String methodName) {
        return checkNull(pojo.getId() == null, pojo.getName() == null, pojo.getGold() == null, methodName);
    }

    private boolean checkNull(boolean id, boolean name, boolean goldValue, String methodName) {
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
        return result;
    }
    //</editor-fold>
}
