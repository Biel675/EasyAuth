package org.samo_lego.simpleauth.utils;

import me.shedaniel.architectury.ExpectPlatform;
import net.minecraft.entity.player.PlayerEntity;

public class PlatformSpecific {
    @ExpectPlatform
    public static boolean isPlayerFake(PlayerEntity player) {
        // Replaced by Architectury
        throw new AssertionError();
    }
}
