package com.MatiHero7.Scraplandmod.init;

import com.MatiHero7.Scraplandmod.ScraplandMod;
import cpw.mods.modlauncher.LaunchPluginHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class iteminit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ScraplandMod.MOD_ID);

    public static final RegistryObject<Item> VANADIUM = ITEMS.register("Vanadium",
            () -> new Item(new Item.Properties()));

    public static class ModCreativeTab extends ItemGroup {
        private ModCreativeTab(int index, String label) {
            super(index, label);
    }
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(VANADIUM.get());
    }
 }
}