package net.canarymod.api.inventory;

import net.canarymod.api.CanaryDamageSource;
import net.canarymod.api.DamageSource;
import net.canarymod.api.entity.living.EntityLiving;
import net.minecraft.enchantment.EnchantmentData;

/**
 * Enchantment wrapper implementation
 *
 * @author Jason (darkdiplomat)
 */
public class CanaryEnchantment implements Enchantment {
    private net.minecraft.enchantment.Enchantment handle;
    private short level;

    public CanaryEnchantment(Type type, short level) {
        this.handle = net.minecraft.enchantment.Enchantment.b[type.getId()];
        this.level = level;
    }

    public CanaryEnchantment(EnchantmentData data) {
        this.handle = data.b;
        this.level = (short) data.c;
    }

    public CanaryEnchantment(net.minecraft.enchantment.Enchantment handle) {
        this.handle = handle;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getWeight() {
        return getHandle().c();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getMinEnchantmentLevel() {
        return getHandle().d();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getMaxEnchantmentLevel() {
        return getHandle().b();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getMinEnchantability() {
        return getHandle().a(level);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getMaxEnchantability() {
        return getHandle().b(level);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDamageModifier(DamageSource source) {
        return getHandle().a(level, ((CanaryDamageSource) source).getHandle());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float getDamageModifier(EntityLiving entity) {
        return 0.0F;
        // TODO: I think this may have been removed.
        //return getHandle().a(level, (net.minecraft.entity.EntityLiving) ((CanaryEntity) entity).getHandle());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canStack(Enchantment other) {
        return getHandle().a(((CanaryEnchantment) other).getHandle());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean canEnchantItem(Item item) {
        return getHandle().a(((CanaryItem) item).getHandle());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Type getType() {
        return Enchantment.Type.fromId(getHandle().B);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public short getLevel() {
        return level;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setLevel(short level) {
        this.level = level;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isValid() {
        return level >= getMinEnchantmentLevel() && level <= getMaxEnchantmentLevel();
    }

    /**
     * Get the Enchantment for this wrapper
     *
     * @return
     */
    public net.minecraft.enchantment.Enchantment getHandle() {
        return handle;
    }

    public EnchantmentData getEnchantmentData() {
        return new EnchantmentData(this.handle, this.level);
    }
}
