package org.example.core.domain.valueObjects;

import java.util.UUID;

public interface User {

    UUID getId();

    String getName();

    Integer getGold();
    void setGold(Integer amount);
    void addGold(Integer additionalAmount);
}
