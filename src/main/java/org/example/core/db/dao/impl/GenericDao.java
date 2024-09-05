package org.example.core.db.dao.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.core.db.converters.Converter;
import org.example.core.db.entities.BaseEntity;
import org.example.core.db.repositories.BaseRepo;
import org.example.core.db.repositories.markers.HasDateRepo;
import org.example.core.db.repositories.markers.HasNameRepo;
import org.example.core.db.repositories.markers.HasValidityRepo;
import org.example.core.db.repositories.markers.HasValueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class GenericDao<E extends BaseEntity, P, ID> {

    private static final Logger logger = LogManager.getLogger();

    private final BaseRepo<E, ID> repo;
    private final Converter<E, P> converter;

    //<editor-fold desc="Constructor">
    @Autowired
    public GenericDao(BaseRepo<E, ID> repo, Converter<E, P> converter) {
        this.repo = repo;
        this.converter = converter;
    }
    //</editor-fold>

    //<editor-fold desc="Save">
    public E save(@NonNull E entity) {
        E savedEntity = repo.save(entity);
        logger.log(Level.INFO, "Successfully saved entity: {}", savedEntity.toString());
        return savedEntity;
    }

    public E save(@NonNull P pojo) {
        E convertedEntity = converter.convertToEntity(pojo);
        logger.log(Level.INFO, "Successfully converted pojo to entity: {}", convertedEntity.toString());
        return save(convertedEntity);
    }
    //</editor-fold>

    //<editor-fold desc="ID">
    public P findById(@NonNull ID id) {
        Optional<E> entity = repo.findById(id);
        if (entity.isPresent()) {
            logger.log(Level.INFO, "Successfully found entity: {}", entity.toString());
            return converter.convertFromEntity(entity.get());
        }
        logger.log(Level.WARN, "Failed to find entity with ID: {}", id.toString());
        return null;
    }
    //</editor-fold>

    //<editor-fold desc="Name">
    public List<P> findByName(@NonNull String name) {
        List<E> entities = ((HasNameRepo<E>) repo).findByName(name);
        logList(entities, this.getClass().getEnclosingMethod().getName());
        return converter.convertFromEntities(entities);
    }

    public List<P> findByName(@NonNull String name, @NonNull Sort sort) {
        List<E> entities = ((HasNameRepo<E>) repo).findByName(name, sort);
        logList(entities, this.getClass().getEnclosingMethod().getName());
        return converter.convertFromEntities(entities);
    }
    //</editor-fold>

    //<editor-fold desc="Value">
    public List<P> findByValue(@NonNull Integer value) {
        List<E> entities = ((HasValueRepo<E>) repo).findByValue(value);
        logList(entities, this.getClass().getEnclosingMethod().getName());
        return converter.convertFromEntities(entities);
    }

    public List<P> findByValue(@NonNull Integer value, @NonNull Sort sort) {
        List<E> entities = ((HasValueRepo<E>) repo).findByValue(value, sort);
        logList(entities, this.getClass().getEnclosingMethod().getName());
        return converter.convertFromEntities(entities);
    }
    //</editor-fold>

    //<editor-fold desc="Validity">
    public List<P> findByValidity(@NonNull Boolean validity) {
        List<E> entities = ((HasValidityRepo<E>) repo).findByValidity(validity);
        logList(entities, this.getClass().getEnclosingMethod().getName());
        return converter.convertFromEntities(entities);
    }

    public List<P> findByValidity(@NonNull Boolean validity, @NonNull Sort sort) {
        List<E> entities = ((HasValidityRepo<E>) repo).findByValidity(validity, sort);
        logList(entities, this.getClass().getEnclosingMethod().getName());
        return converter.convertFromEntities(entities);
    }
    //</editor-fold>

    //<editor-fold desc="Date">
    public List<P> findByDate(@NonNull LocalDateTime date) {
        List<E> entities = ((HasDateRepo<E>) repo).findByCreationDate(date);
        logList(entities, this.getClass().getEnclosingMethod().getName());
        return converter.convertFromEntities(entities);
    }

    public List<P> findByDate(@NonNull LocalDateTime date, @NonNull Sort sort) {
        List<E> entities = ((HasDateRepo<E>) repo).findByCreationDate(date, sort);
        logList(entities, this.getClass().getEnclosingMethod().getName());
        return converter.convertFromEntities(entities);
    }
    //</editor-fold>

    //<editor-fold desc="Logging">
    private void logList(List<E> entities, @NonNull String methodName) {
        if (entities == null || entities.isEmpty()) {
            logger.log(Level.WARN, "Method {} successfully ran but found no entities.", methodName);
            return;
        }
        StringBuilder sb = new StringBuilder();
        entities.forEach((entity) -> sb.append(String.format("%s\n}", entity.toString())));
        logger.log(Level.DEBUG, "Method {} successfully found the following entities: {}", methodName, sb.toString());
    }
    //</editor-fold>
}
