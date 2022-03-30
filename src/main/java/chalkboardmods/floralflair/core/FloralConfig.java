package chalkboardmods.floralflair.core;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;


@Config(name = FloralFlair.MOD_ID)
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
    @Comment("Frosted Foxnip flower spawning density in game [default = 10]")
    public int frostedFoxnipDensity = 10;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Fairy Blossom flowers generating in flower forests [default = 10]")
    public int fairyBlossomDensity = 10;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Gem of the Jungle flowers in jungles [default = 12]")
    public int jungleGemDensity = 12;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Rose flowers in meadows [default = 8]")
    public int roseDensity = 8;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @Comment("The density of Muscari flowers in snowy places [default = 10]")
    public int muscariDensity = 10;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Sunset Poppy flowers in savannas [default = 10]")
    public int sunsetPoppyDensity = 10;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Purpureum flowers in swamps [default = 12]")
    public int purpureumDensity = 12;
    // Midnight_orchid
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Midnight Orchid flowers [default = 12]")
    public int midnightOrchidDensity = 12;
    // Hyacinth
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Hyacinth flowers [default = 10]")
    public int hyacinthDensity = 10;
    // Anthurium
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Anthurium flowers [default = 8]")
    public int anthuriumDensity = 8;
    // Snowfall flower
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Snow Fall flowers [default = 10]")
    public int snowFallFlowerDensity = 10;
    // Lunula
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Spiked Tulip flowers [default = 3]")
    public int spikedTulipDensity = 3;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Lunula flowers [default = 10]")
    public int lunulaDensity = 10;
    // Stonnete
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Stonnete flowers [default = 3]")
    public int stonneteDensity = 3;
    @ConfigEntry.BoundedDiscrete(max = 24L)
    @ConfigEntry.Gui.RequiresRestart
    @Comment("The density of Scilla flowers [default = 10]")
    public int scillaDensity = 10;

    public static void init() {
        AutoConfig.register(FloralConfig.class, JanksonConfigSerializer::new);
    }
    public static FloralConfig get() {
        return AutoConfig.getConfigHolder(FloralConfig.class).getConfig();
    }

}
