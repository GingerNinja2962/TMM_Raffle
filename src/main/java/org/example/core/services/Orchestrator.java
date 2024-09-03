package org.example.core.services;

import org.example.core.domain.models.Impl.ItemImpl;
import org.example.core.domain.models.Impl.UserImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Orchestrator {

    private final Map<UUID, ItemImpl> GiveAwayItems = new HashMap<>();
    private final Map<UUID, UserImpl> Users = new HashMap<>();

    public void GiveAwayItem(UUID uuid, ItemImpl itemImpl) {
        // TODO impl
    }
}
