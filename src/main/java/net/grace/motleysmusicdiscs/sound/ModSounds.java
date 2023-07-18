package net.grace.motleysmusicdiscs.sound;

import net.grace.motleysmusicdiscs.MotleysMusicDiscs;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static final SoundEvent ALLEYESONME = registerSoundEvent("alleyesonme");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MotleysMusicDiscs.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
