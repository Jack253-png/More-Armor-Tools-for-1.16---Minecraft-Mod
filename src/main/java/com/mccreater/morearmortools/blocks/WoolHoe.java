package com.mccreater.morearmortools.blocks;

import net.minecraft.item.HoeItem;
import com.mccreater.morearmortools.blocks.DemoToolMaterials;

public class WoolHoe extends HoeItem {
    protected WoolHoe(Settings settings) {
        super(DemoToolMaterials.WOOL, 1, -3.5F, settings);
    }
}
