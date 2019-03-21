package com.dragovorn.integratedwhitelist.data;

import java.util.UUID;

public interface IDataManager {

    void associateTwitchId(UUID player);

    UUID getConnectionId(UUID player);
    UUID generateConnectionId(UUID player);
    UUID getPlayerFromConnectionId(UUID connectionId);

    long getTwitchId(UUID player);
}
