package net.cierniak.forge.mods;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Class showing a message when a block is broken.
 */
public class BlockBreakMessage {

    @SubscribeEvent
    public void sendMessage(BlockEvent.BreakEvent event) {
        event.getPlayer().addChatComponentMessage(
                new ChatComponentText(EnumChatFormatting.GOLD + "You broke a block!")
        );

    }
}
