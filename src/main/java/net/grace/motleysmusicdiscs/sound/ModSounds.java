package net.grace.motleysmusicdiscs.sound;

import net.grace.motleysmusicdiscs.MotleysMusicDiscs;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static final SoundEvent ALLEYESONME = registerSoundEvent("alleyesonme");
    public static final SoundEvent KOKOMO = registerSoundEvent("kokomo");
    public static final SoundEvent UNDERPRESSURE = registerSoundEvent("underpressure");
    public static final SoundEvent BUTTERCUP = registerSoundEvent("buttercup");
    public static final SoundEvent WAP = registerSoundEvent("wap");
    public static final SoundEvent BODIES = registerSoundEvent("bodies");
    public static final SoundEvent HEARTOFGLASS = registerSoundEvent("heartofglass");
    public static final SoundEvent EVERYBODY = registerSoundEvent("everybody");
    public static final SoundEvent ALLSTAR = registerSoundEvent("allstar");
    public static final SoundEvent DANCINGQUEEN = registerSoundEvent("dancingqueen");
    public static final SoundEvent FORTHEDAMAGEDCODA = registerSoundEvent("forthedamagedcoda");
    public static final SoundEvent ABOUTDAMNTIME = registerSoundEvent("aboutdamntime");
    public static final SoundEvent COMEANDGETYOURLOVE = registerSoundEvent("comeandgetyourlove");
    public static final SoundEvent ROXANNE = registerSoundEvent("roxanne");
    public static final SoundEvent BREAKMYSTRIDE = registerSoundEvent("breakmystride");
    public static final SoundEvent ANOTHERONEBITESTHEDUST = registerSoundEvent("anotheronebitesthedust");
    public static final SoundEvent GIMMEGIMMEGIMME = registerSoundEvent("gimmegimmegimme");
    public static final SoundEvent ARTHUR = registerSoundEvent("arthur");
    public static final SoundEvent KILLERQUEEN = registerSoundEvent("killerqueen");
    public static final SoundEvent BEZOSI = registerSoundEvent("bezosi");
    public static final SoundEvent BEZOSII = registerSoundEvent("bezosii");
    public static final SoundEvent RASPUTIN = registerSoundEvent("rasputin");
    public static final SoundEvent NANANA = registerSoundEvent("nanana");
    public static final SoundEvent GHOSTBUSTERS = registerSoundEvent("ghostbusters");
    public static final SoundEvent MONSTERMASH = registerSoundEvent("monstermash");
    public static final SoundEvent DREAMSWEETINSEAMAJOR = registerSoundEvent("dreamsweetinseamajor");
    public static final SoundEvent PERFUME = registerSoundEvent("perfume");
    public static final SoundEvent WELCOMETOTHEINTERNET = registerSoundEvent("welcometotheinternet");
    public static final SoundEvent HOLDINGOUTFORAHERO = registerSoundEvent("holdingoutforahero");



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MotleysMusicDiscs.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerSounds() {
        MotleysMusicDiscs.LOGGER.info("Registering Mod Sounds for " + MotleysMusicDiscs.MOD_ID );
    }
}
