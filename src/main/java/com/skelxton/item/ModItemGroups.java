package com.skelxton.item;

import com.skelxton.KupenJoeToutrialMod;
import com.skelxton.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(KupenJoeToutrialMod.MOD_ID, "ruby"), FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                    })).build());

    public static void registerItemGroups(){
        KupenJoeToutrialMod.LOGGER.info("Registering Item groups for " + KupenJoeToutrialMod.MOD_ID);
    }
}
