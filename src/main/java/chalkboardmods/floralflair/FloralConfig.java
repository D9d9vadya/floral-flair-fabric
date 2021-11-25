package chalkboardmods.floralflair;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;


@Config(name =FloralFlair.MOD_ID)
public class FloralConfig implements ConfigData {
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Pulse Petal flowers generating in forests [default = 8]")
    @ConfigEntry.BoundedDiscrete(max = 24L)
    public int pulsePetalDensity = 8;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Foxnip flowers generating in taigas [default = 8]")
    public int foxnipDensity = 8;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("Frosted Foxnip flower spawning density in game [default = 8]")
    public int frostedFoxnipDensity = 8;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Fairy Blossom flowers generating in flower forests [default = 8]")
    public int fairyBlossomDensity = 8;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Gem of the Jungle flowers in jungles [default = 12]")
    public int jungleGemDensity = 12;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Rose flowers in forests and plains [default = 8]")
    public int roseDensity = 8;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @Comment("The density of Muscari flowers in snowy places [default = 8]")
    public int muscariDensity = 8;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Sunset Poppy flowers in sunflower plains [default = 8]")
    public int sunsetPoppyDensity = 8;

    public static void init() {
        AutoConfig.register(FloralConfig.class, JanksonConfigSerializer::new);
    }
    public static FloralConfig get() {
        return AutoConfig.getConfigHolder(FloralConfig.class).getConfig();
    }

}
