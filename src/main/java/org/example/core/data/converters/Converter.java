package org.example.core.data.converters;

import org.example.core.data.entities.BaseEntity;

import java.util.List;

public interface Converter<E extends BaseEntity, P> {
    P convertFromEntity(E entity);

    List<P> convertFromEntities(List<E> entity);

    E convertToEntity(P pojo);
}
