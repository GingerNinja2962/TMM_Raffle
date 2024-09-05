package org.example.core.domain.value_objects;

import java.util.UUID;

public interface User {

    UUID getId();

    String getName();

    Integer getGold();
    void addGold(Integer additionalAmount);
}
