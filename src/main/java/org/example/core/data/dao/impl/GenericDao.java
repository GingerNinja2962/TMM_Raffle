package org.example.core.data.dao.impl;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.core.data.converters.Converter;
import org.example.core.data.entities.BaseEntity;
import org.example.core.data.repositories.BaseRepo;
import org.example.core.data.repositories.markers.HasDateRepo;
import org.example.core.data.repositories.markers.HasGoldValueRepo;
import org.example.core.data.repositories.markers.HasNameRepo;
import org.example.core.data.repositories.markers.HasValidityRepo;
import org.springframework.data.domain.Sort;
import org.springframework.lang.NonNull;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class GenericDao<E extends BaseEntity, P, ID> {

    private static final Logger logger = LogManager.getLogger();

    private final BaseRepo<E, ID> repo;
    private final Converter<E, P> converter;

    //<editor-fold desc="Constructor">
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

    //<editor-fold desc="Find All">
    public List<P> findAll() {
        List<E> entities = repo.findAll();
        logList(entities, "findAll");
        return converter.convertFromEntities(entities);
    }
    //</editor-fold>

    //<editor-fold desc="ID">
    public P findById(@NonNull ID id) {
        Optional<E> entity = repo.findById(id);
        if (entity.isPresent()) {
            logger.log(Level.INFO, "Successfully found entity: {}", entity.toString());
            return converter.convertFromEntity(entity.get());
        }
        logger.log(Level.WARN, "Method 'findById' Failed to find entity with ID: {}", id.toString());
        return null;
    }
    //</editor-fold>

    //<editor-fold desc="Name">
    public List<P> findByName(@NonNull String name) {
        List<E> entities = ((HasNameRepo<E>) repo).findByName(name);
        logList(entities, "findByName");
        return converter.convertFromEntities(entities);
    }

    public List<P> findByName(@NonNull String name, @NonNull Sort sort) {
        List<E> entities = ((HasNameRepo<E>) repo).findByName(name, sort);
        logList(entities, "findByName");
        return converter.convertFromEntities(entities);
    }
    //</editor-fold>

    //<editor-fold desc="Gold Value">
    public List<P> findByGoldValue(@NonNull Integer goldValue) {
        List<E> entities = ((HasGoldValueRepo<E>) repo).findByGoldValue(goldValue);
        logList(entities, "findByGoldValue");
        return converter.convertFromEntities(entities);
    }

    public List<P> findByGoldValue(@NonNull Integer goldValue, @NonNull Sort sort) {
        List<E> entities = ((HasGoldValueRepo<E>) repo).findByGoldValue(goldValue, sort);
        logList(entities, "findByGoldValue");
        return converter.convertFromEntities(entities);
    }
    //</editor-fold>

    //<editor-fold desc="Validity">
    public List<P> findByValidity(@NonNull Boolean validity) {
        List<E> entities = ((HasValidityRepo<E>) repo).findByValidity(validity);
        logList(entities, "findByValidity");
        return converter.convertFromEntities(entities);
    }

    public List<P> findByValidity(@NonNull Boolean validity, @NonNull Sort sort) {
        List<E> entities = ((HasValidityRepo<E>) repo).findByValidity(validity, sort);
        logList(entities, "findByValidity");
        return converter.convertFromEntities(entities);
    }
    //</editor-fold>

    //<editor-fold desc="Date">
    public List<P> findByDate(@NonNull LocalDateTime date) {
        List<E> entities = ((HasDateRepo<E>) repo).findByCreationDate(date);
        logList(entities, "findByDate");
        return converter.convertFromEntities(entities);
    }

    public List<P> findByDate(@NonNull LocalDateTime date, @NonNull Sort sort) {
        List<E> entities = ((HasDateRepo<E>) repo).findByCreationDate(date, sort);
        logList(entities, "findByDate");
        return converter.convertFromEntities(entities);
    }
    //</editor-fold>

    //<editor-fold desc="Logging">
    private void logList(List<E> entities, String methodName) {
        if (entities == null || entities.isEmpty()) {
            logger.log(Level.WARN, "Method '{}' successfully ran but found no entities.", methodName);
            return;
        }
        StringBuilder sb = new StringBuilder();
        entities.forEach((entity) -> sb.append(String.format("%s\n", entity.toString())));
        logger.log(Level.DEBUG, "Method '{}' successfully found the following entities: {}", methodName, sb.toString());
    }
    //</editor-fold>
}