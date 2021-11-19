package chalkboardmods.floralflair;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name =FloralFlair.MOD_ID)
public class FloralConfig implements ConfigData {
    @Comment("Pulse Petal flower spawning density in game [default = 3]")
    @ConfigEntry.BoundedDiscrete(min = 0L, max = 64L)
    public int pulsePetalDensity = 3;
    @ConfigEntry.BoundedDiscrete(min = 0L, max = 64L)
    @Comment("Foxnip flower spawning density in game [default = 3]")
    public int foxnipDensity = 3;
    @ConfigEntry.BoundedDiscrete(min = 0L, max = 64L)
    @Comment("Frosted Foxnip flower spawning density in game [default = 3]")
    public int frostedFoxnipDensity = 3;
    @ConfigEntry.BoundedDiscrete(min = 0L, max = 64L)
    @Comment("Fairy Blossom flower spawning density in game [default = 3]")
    public int fairyBlossomDensity = 3;
    @ConfigEntry.BoundedDiscrete(min = 0L, max = 64L)
    @Comment("Jungle Gem flower spawning density in game [default = 3]")
    public int jungleGemDensity = 3;
    @ConfigEntry.BoundedDiscrete(min = 0L, max = 64L)
    @Comment("Rose flower spawning density in game [default = 3]")
    public int roseDensity = 3;
    @ConfigEntry.BoundedDiscrete(min = 0L, max = 64L)
    @Comment("Sunset Poppy flower spawning density in game [default = 3]")
    public int sunsetPoppyDensity = 3;
    @ConfigEntry.BoundedDiscrete(min = 0L, max = 64L)
    @Comment("Muscari flower spawning density in game [default = 3]")
    public int muscariDensity = 3;

    public static void init() {
        AutoConfig.register(FloralConfig.class, JanksonConfigSerializer::new);
    }
    public static FloralConfig get() {
        return AutoConfig.getConfigHolder(FloralConfig.class).getConfig();
    }

}
