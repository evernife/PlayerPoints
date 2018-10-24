package org.black_ixx.playerpoints.storage;

import org.black_ixx.playerpoints.PlayerPoints;
import org.black_ixx.playerpoints.storage.models.YAMLStorage;

/**
 * Genereates the storage handler for any given type.
 * 
 * @author Mitsugaru.
 */
public class StorageGenerator {

    /**
     * Plugin instance.
     */
    private PlayerPoints plugin;

    /**
     * Constructor.
     * 
     * @param plugin
     *            - Plugin instance.
     */
    public StorageGenerator(PlayerPoints plugin) {
        this.plugin = plugin;
    }

    /**
     * Genereate a storage handler for the given type.
     * 
     * @param type
     *            - Storage type.
     * @return Storage handler. Returns null for unhandled storage types.
     */
    public IStorage createStorageHandlerForType(StorageType type) {
        return new YAMLStorage(plugin);
    }
}
