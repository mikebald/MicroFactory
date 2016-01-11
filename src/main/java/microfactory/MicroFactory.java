package main.java.microfactory;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import main.java.microfactory.core.IProxy;
import main.java.microfactory.reference.Reference;

@Mod( modid=Reference.ID, name = Reference.NAME, version = Reference.VERSION_FULL, dependencies = Reference.DEPENDS)
public final class MicroFactory {

    @Mod.Instance
    public static MicroFactory instance;

    @SidedProxy(serverSide = Reference.PROXY_SERVER, clientSide = Reference.PROXY_CLIENT )
    public static IProxy proxy;

    @Mod.EventHandler
    private void preInit( FMLPreInitializationEvent event )
    {

    }


    @Mod.EventHandler
    private void init( FMLInitializationEvent event )
    {

    }

    @Mod.EventHandler
    private void postInit( FMLPostInitializationEvent event )
    {

    }

}
