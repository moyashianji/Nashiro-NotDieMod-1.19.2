package com.main;

import com.nodead.event.PdFall;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.main.reference.MOD_ID;

@Mod(MOD_ID)
public class Die {
    public Die() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        PdFall.register();

        bus.addListener(this::onClientSetup);
    }


    private void setup(final FMLCommonSetupEvent event){

    }
    private void onClientSetup(FMLClientSetupEvent event){

    }

}
