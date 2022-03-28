package net.jeffzhang.minerobot;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ClientMod implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("ClientMod");
    public static final ScheduledExecutorService EXECUTOR = Executors.newScheduledThreadPool(4);

    @Override
    public void onInitializeClient() {

    }
}
