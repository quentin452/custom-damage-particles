package net.torocraft.torohealthmod.configuration.gui;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.torocraft.torohealthmod.ToroHealthMod;

import static net.torocraft.torohealthmod.configuration.ConfigurationHandler.getConfig;

public class ModGUIConfig extends GuiConfig {

    public ModGUIConfig(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(getConfig().getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                ToroHealthMod.MODID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(getConfig().toString()));
    }

}