package com.dudu.sieve;

import net.fabricmc.api.ModInitializer;
import net.xiaoyu233.fml.ModResourceManager;
import net.xiaoyu233.fml.reload.event.MITEEvents;

public class SieveInitializer implements ModInitializer {
    public static final String MOD_ID = "sieve";

    @Override
    public void onInitialize() {
        ModResourceManager.addResourcePackDomain(MOD_ID);

        MITEEvents.MITE_EVENT_BUS.register(new EventListener());
    }
}