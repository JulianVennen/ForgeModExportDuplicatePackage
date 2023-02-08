package me.vennen.modb;

import com.mojang.logging.LogUtils;
import me.vennen.common.CommonClass;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(ExampleMod.MODID)
public class ExampleMod
{
    public static final String MODID = "testmodb";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ExampleMod()
    {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        CommonClass.printSomething(LOGGER);
    }
}
