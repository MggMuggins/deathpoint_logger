package com.mggmuggins.deathpointlogger;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChunkCoordinates;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

public class DeathpointEventHandler {
    @SubscribeEvent
    public void onDeath(LivingDeathEvent event) {
        Entity entity = event.entity;
        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            ChunkCoordinates coords = player.getPlayerCoordinates();
            String message = "Deathpoint logged at x" + coords.posX + ", y" + coords.posY + ", z" + coords.posZ;
            //Other stuff here
            player.addChatComponentMessage(new ChatComponentText(message));
        }
    }
}
