package chalkboardmods.floralflair;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name =FloralFlair.MOD_ID)
public class FloralConfig implements ConfigData {
    @Comment("The density of Pulse Petal flowers generating in forests [default = 32]")
    @ConfigEntry.BoundedDiscrete(max = 64L)
    public int pulsePetalDensity = 32;
    @ConfigEntry.BoundedDiscrete(max = 64L)
    @Comment("The density of Foxnip flowers generating in taigas [default = 32]")
    public int foxnipDensity = 32;
    @ConfigEntry.BoundedDiscrete(max = 64L)
    @Comment("Frosted Foxnip flower spawning density in game [default = 32]")
    public int frostedFoxnipDensity = 32;
    @ConfigEntry.BoundedDiscrete(max = 42L)
    @Comment("The density of Fairy Blossom flowers generating in flower forests [default = 16]")
    public int fairyBlossomDensity = 16;
    @ConfigEntry.BoundedDiscrete(max = 64L)
    @Comment("The density of Gem of the Jungle flowers in jungles [default = 32]")
    public int jungleGemDensity = 32;
    @ConfigEntry.BoundedDiscrete(max = 64L)
    @Comment("The density of Rose flowers in forests and plains [default = 32]")
    public int roseDensity = 32;
    @ConfigEntry.BoundedDiscrete(max = 64L)
    @Comment("The density of Sunset Poppy flowers in sunflower plains [default = 32]")
    public int sunsetPoppyDensity = 32;
    @ConfigEntry.BoundedDiscrete(max = 42L)
    @Comment("The density of Muscari flowers in snowy places [default = 16]")
    public int muscariDensity = 16;

    public static void init() {
        AutoConfig.register(FloralConfig.class, JanksonConfigSerializer::new);
    }
    public static FloralConfig get() {
        return AutoConfig.getConfigHolder(FloralConfig.class).getConfig();
    }

}
