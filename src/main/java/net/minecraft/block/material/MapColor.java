package net.minecraft.block.material;

import net.canarymod.api.world.blocks.CanaryMapColor;

public class MapColor {

    public static final MapColor[] a = new MapColor[64];
    public static final MapColor b = new MapColor(0, 0);
    public static final MapColor c = new MapColor(1, 8368696);
    public static final MapColor d = new MapColor(2, 16247203);
    public static final MapColor e = new MapColor(3, 10987431);
    public static final MapColor f = new MapColor(4, 16711680);
    public static final MapColor g = new MapColor(5, 10526975);
    public static final MapColor h = new MapColor(6, 10987431);
    public static final MapColor i = new MapColor(7, 31744);
    public static final MapColor j = new MapColor(8, 16777215);
    public static final MapColor k = new MapColor(9, 10791096);
    public static final MapColor l = new MapColor(10, 12020271);
    public static final MapColor m = new MapColor(11, 7368816);
    public static final MapColor n = new MapColor(12, 4210943);
    public static final MapColor o = new MapColor(13, 6837042);
    public static final MapColor p = new MapColor(14, 16776437);
    public static final MapColor q = new MapColor(15, 14188339);
    public static final MapColor r = new MapColor(16, 11685080);
    public static final MapColor s = new MapColor(17, 6724056);
    public static final MapColor t = new MapColor(18, 15066419);
    public static final MapColor u = new MapColor(19, 8375321);
    public static final MapColor v = new MapColor(20, 15892389);
    public static final MapColor w = new MapColor(21, 5000268);
    public static final MapColor x = new MapColor(22, 10066329);
    public static final MapColor y = new MapColor(23, 5013401);
    public static final MapColor z = new MapColor(24, 8339378);
    public static final MapColor A = new MapColor(25, 3361970);
    public static final MapColor B = new MapColor(26, 6704179);
    public static final MapColor C = new MapColor(27, 6717235);
    public static final MapColor D = new MapColor(28, 10040115);
    public static final MapColor E = new MapColor(29, 1644825);
    public static final MapColor F = new MapColor(30, 16445005);
    public static final MapColor G = new MapColor(31, 6085589);
    public static final MapColor H = new MapColor(32, 4882687);
    public static final MapColor I = new MapColor(33, '\ud93a');
    public static final MapColor J = new MapColor(34, 1381407);
    public static final MapColor K = new MapColor(35, 7340544);
    public final int L;
    public final int M;

    // CanaryMod: wrapper
    public final CanaryMapColor wrapper;

    private MapColor(int i0, int i1) {
        if (i0 >= 0 && i0 <= 63) {
            this.M = i0;
            this.L = i1;
            a[i0] = this;
        }
        else {
            throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
        }

        // CanaryMod: wrapper
        this.wrapper = new CanaryMapColor(this);
    }
}
