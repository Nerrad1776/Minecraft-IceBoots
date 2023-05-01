package fam.shingler.iceboots.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.ItemStack;

public class IceBootsItem extends ArmorItem {
    public IceBootsItem(ArmorMaterials material, ArmorItem.Type slot, Properties properties) {
        super(material, slot, properties);


        }

    public boolean onEntityItemUpdate(ItemStack stack, LivingEntity entity) {
        if (entity.isOnGround()) {
            Block block = entity.getFeetBlockState().getBlock();
            if (block == Blocks.ICE || block == Blocks.PACKED_ICE || block == Blocks.FROSTED_ICE || block == Blocks.BLUE_ICE) {
               entity.noPhysics = true; //entity.setMotion(entity.getMotion().mul(1.0, 1.0, 1.0));
                return true;
            }
        }
        return false;
    }
}