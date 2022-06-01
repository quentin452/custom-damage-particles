package net.torocraft.torohealthmod.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.entity.EntityLivingBase;
import net.torocraft.torohealthmod.configuration.ConfigurationHandler;

public class CommonProxy {
    public void displayDamageDealt(EntityLivingBase entityLiving) {
    }

    public void preInit(FMLPreInitializationEvent e) {
        String configDir = e.getModConfigurationDirectory().toString();
        ConfigurationHandler.init(configDir);
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    }

    public void init(FMLInitializationEvent e) {
    }
}
