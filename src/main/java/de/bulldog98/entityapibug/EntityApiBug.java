package de.bulldog98.entityapibug;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;

public class EntityApiBug implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.register((world, entity, killedEntity) -> {});
    }
}
