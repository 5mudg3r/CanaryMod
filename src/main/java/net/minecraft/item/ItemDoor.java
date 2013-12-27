package net.minecraft.item;

import net.canarymod.api.world.blocks.CanaryBlock;
import net.canarymod.hook.player.BlockPlaceHook;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemDoor extends Item {

    private Material a;

    public ItemDoor(Material material) {
        this.a = material;
        this.h = 1;
        this.a(CreativeTabs.d);
    }

    public boolean a(ItemStack itemstack, EntityPlayer entityplayer, World world, int i0, int i1, int i2, int i3, float f0, float f1, float f2) {
        if (i3 != 1) {
            return false;
        }
        else {
            ++i1;
            Block block;

            if (this.a == Material.d) {
                block = Blocks.ao;
            }
            else {
                block = Blocks.av;
            }

            if (entityplayer.a(i0, i1, i2, i3, itemstack) && entityplayer.a(i0, i1 + 1, i2, i3, itemstack)) {
                if (!block.c(world, i0, i1, i2)) {
                    return false;
                }
                else {
                    // CanaryMod: BlockPlaceHook
                    CanaryBlock clicked = (CanaryBlock) world.getCanaryWorld().getBlockAt(i0, i1, i2);
                    CanaryBlock placed = new CanaryBlock((short) Block.b(block), (short) 0, i0, i1 + 1, i2, world.getCanaryWorld());
                    BlockPlaceHook hook = (BlockPlaceHook) new BlockPlaceHook(((EntityPlayerMP) entityplayer).getPlayer(), clicked, placed).call();
                    if (hook.isCanceled()) {
                        return false;
                    }
                    //

                    int i4 = MathHelper.c((double) ((entityplayer.z + 180.0F) * 4.0F / 360.0F) - 0.5D) & 3;

                    a(world, i0, i1, i2, i4, block);
                    --itemstack.b;
                    return true;
                }
            }
            else {
                return false;
            }
        }
    }

    public static void a(World world, int i0, int i1, int i2, int i3, Block block) {
        byte b0 = 0;
        byte b1 = 0;

        if (i3 == 0) {
            b1 = 1;
        }

        if (i3 == 1) {
            b0 = -1;
        }

        if (i3 == 2) {
            b1 = -1;
        }

        if (i3 == 3) {
            b0 = 1;
        }

        int i4 = (world.a(i0 - b0, i1, i2 - b1).r() ? 1 : 0) + (world.a(i0 - b0, i1 + 1, i2 - b1).r() ? 1 : 0);
        int i5 = (world.a(i0 + b0, i1, i2 + b1).r() ? 1 : 0) + (world.a(i0 + b0, i1 + 1, i2 + b1).r() ? 1 : 0);
        boolean flag0 = world.a(i0 - b0, i1, i2 - b1) == block || world.a(i0 - b0, i1 + 1, i2 - b1) == block;
        boolean flag1 = world.a(i0 + b0, i1, i2 + b1) == block || world.a(i0 + b0, i1 + 1, i2 + b1) == block;
        boolean flag2 = false;

        if (flag0 && !flag1) {
            flag2 = true;
        }
        else if (i5 > i4) {
            flag2 = true;
        }

        world.d(i0, i1, i2, block, i3, 2);
        world.d(i0, i1 + 1, i2, block, 8 | (flag2 ? 1 : 0), 2);
        world.d(i0, i1, i2, block);
        world.d(i0, i1 + 1, i2, block);
    }
}
