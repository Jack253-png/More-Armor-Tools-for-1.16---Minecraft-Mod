package com.mccreater.morearmortools.blocks;

import net.minecraft.item.ShovelItem;
import com.mccreater.morearmortools.blocks.DemoToolMaterials;

public class WoolShovel extends ShovelItem {
    public WoolShovel(Settings settings) {
        super(DemoToolMaterials.WOOL, 1, -3.5F, settings);
    }
}
