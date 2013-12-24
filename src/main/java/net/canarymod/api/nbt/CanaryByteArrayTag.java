package net.canarymod.api.nbt;

import net.minecraft.nbt.NBTTagByteArray;

/**
 * ByteArrayTag wrapper implementation
 *
 * @author Greg (gregthegeek)
 * @author Jason (darkdiplomat)
 */
public class CanaryByteArrayTag extends CanaryBaseTag implements ByteArrayTag {

    /**
     * Constructs a new wrapper for NBTTagByteArray
     *
     * @param tag
     *         the NBTTagByteArray to wrap
     */
    public CanaryByteArrayTag(NBTTagByteArray tag) {
        super(tag);
    }

    /**
     * Constructs a new CanaryByteArrayTag and associated NBTTagByteArray
     *
     * @param name
     *         the name of the tag
     * @param value
     *         the byte array to supply the tag
     */
    public CanaryByteArrayTag(String name, byte[] value) {
        super(new NBTTagByteArray(value));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] getValue() {
        return getHandle().c();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setValue(byte[] value) {
        getHandle().a = value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ByteArrayTag copy() {
        return new CanaryByteArrayTag((NBTTagByteArray) getHandle().b());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NBTTagByteArray getHandle() {
        return (NBTTagByteArray) tag;
    }
}
