package org.example.core.db.converters;

import org.example.core.db.entities.BaseEntity;

import java.util.List;

public interface Converter<E extends BaseEntity, P> {
    P convertFromEntity(E entity);

    List<P> convertFromEntities(List<E> entity);

    E convertToEntity(P pojo);
}
