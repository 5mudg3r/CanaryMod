package net.canarymod.api.entity.living.animal;

import net.canarymod.api.entity.EntityType;
import net.minecraft.entity.passive.EntityMooshroom;

/**
 * MooshroomCow wrapper implementation
 *
 * @author Jason (darkdiplomat)
 */
public class CanaryMooshroom extends CanaryCow implements Mooshroom {

    /**
     * Constructs a new wrapper for EntityMooshroom
     *
     * @param entity
     *         the EntityMooshroom to wrap
     */
    public CanaryMooshroom(EntityMooshroom entity) {
        super(entity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityType getEntityType() {
        return EntityType.MOOSHROOM;
    }

    @Override
    public String getFqName() {
        return "Mooshroom";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EntityMooshroom getHandle() {
        return (EntityMooshroom) entity;
    }
}
