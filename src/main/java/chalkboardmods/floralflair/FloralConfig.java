package chalkboardmods.floralflair;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name =FloralFlair.MOD_ID)
public class FloralConfig implements ConfigData {
    @Comment("Pulse Petal flower spawning density in game [default = 3]")
    public static int pulsePetalDensity = 3;
    public static int foxnipDensity = 3;
    public static int fairyBlossomDensity = 3;
    public static int jungleGemDensity = 3;
    public static int roseDensity = 3;
    public static int sunsetPoppyDensity = 3;
    public static int muscariDensity = 3;



}
