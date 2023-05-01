package fam.shingler.iceboots.item;

import fam.shingler.iceboots.IceBoots;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IceBoots.MOD_ID);

    public static final RegistryObject<Item> ICEBOOTS = ITEMS.register("iceboots",
            () -> new IceBootsItem(ArmorMaterials.LEATHER, ArmorItem.Type.BOOTS,
                    new Item.Properties().stacksTo(1)));



    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
