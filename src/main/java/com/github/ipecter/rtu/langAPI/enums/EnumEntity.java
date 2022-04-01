package com.github.ipecter.rtu.langAPI.enums;

import com.github.ipecter.rtu.langAPI.manager.RTULangManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

import java.lang.reflect.InvocationTargetException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum EnumEntity {
    AREA_EFFECT_CLOUD(EntityType.AREA_EFFECT_CLOUD , "entity.minecraft.area_effect_cloud"),
    ARMOR_STAND(EntityType.ARMOR_STAND , "entity.minecraft.armor_stand"),
    ARROW(EntityType.ARROW , "entity.minecraft.arrow"),
    AXOLOTL(EntityType.AXOLOTL , "entity.minecraft.axolotl"),
    BAT(EntityType.BAT , "entity.minecraft.bat"),
    BEE(EntityType.BEE , "entity.minecraft.bee"),
    BLAZE(EntityType.BLAZE , "entity.minecraft.blaze"),
    BOAT(EntityType.BOAT , "entity.minecraft.boat"),
    CAT(EntityType.CAT , "entity.minecraft.cat"),
    CAVE_SPIDER(EntityType.CAVE_SPIDER , "entity.minecraft.cave_spider"),
    MINECART_WITH_CHEST(EntityType.MINECART_WITH_CHEST , "entity.minecraft.chest_minecart"),
    CHICKEN(EntityType.CHICKEN , "entity.minecraft.chicken"),
    MINECART_WITH_COMMAND_BLOCK(EntityType.MINECART_WITH_COMMAND_BLOCK , "entity.minecraft.command_block_minecart"),
    COD(EntityType.COD , "entity.minecraft.cod"),
    COW(EntityType.COW , "entity.minecraft.cow"),
    CREEPER(EntityType.CREEPER , "entity.minecraft.creeper"),
    DOLPHIN(EntityType.DOLPHIN , "entity.minecraft.dolphin"),
    DONKEY(EntityType.DONKEY , "entity.minecraft.donkey"),
    DROWNED(EntityType.DROWNED , "entity.minecraft.drowned"),
    DRAGON_FIREBALL(EntityType.DRAGON_FIREBALL , "entity.minecraft.dragon_fireball"),
    THROWN_EGG(EntityType.THROWN_EGG , "entity.minecraft.egg"),
    ELDER_GUARDIAN(EntityType.ELDER_GUARDIAN , "entity.minecraft.elder_guardian"),
    END_CRYSTAL(EntityType.END_CRYSTAL , "entity.minecraft.end_crystal"),
    ENDER_DRAGON(EntityType.ENDER_DRAGON , "entity.minecraft.ender_dragon"),
    THROWN_ENDER_PEARL(EntityType.THROWN_ENDER_PEARL , "entity.minecraft.ender_pearl"),
    ENDERMAN(EntityType.ENDERMAN , "entity.minecraft.enderman"),
    ENDERMITE(EntityType.ENDERMITE , "entity.minecraft.endermite"),
    EVOKER_FANGS(EntityType.EVOKER_FANGS , "entity.minecraft.evoker_fangs"),
    EVOKER(EntityType.EVOKER , "entity.minecraft.evoker"),
    EYE_OF_ENDER(EntityType.EYE_OF_ENDER , "entity.minecraft.eye_of_ender"),
    FALLING_BLOCK(EntityType.FALLING_BLOCK , "entity.minecraft.falling_block"),
    FIREBALL(EntityType.FIREBALL , "entity.minecraft.fireball"),
    FIREWORK_ROCKET(EntityType.FIREWORK_ROCKET , "entity.minecraft.firework_rocket"),
    FISHING_BOBBER(EntityType.FISHING_BOBBER , "entity.minecraft.fishing_bobber"),
    FOX(EntityType.FOX , "entity.minecraft.fox"),
    MINECART_WITH_FURNACE(EntityType.MINECART_WITH_FURNACE , "entity.minecraft.furnace_minecart"),
    GHAST(EntityType.GHAST , "entity.minecraft.ghast"),
    GIANT(EntityType.GIANT , "entity.minecraft.giant"),
    GLOW_ITEM_FRAME(EntityType.GLOW_ITEM_FRAME , "entity.minecraft.glow_item_frame"),
    GLOW_SQUID(EntityType.GLOW_SQUID , "entity.minecraft.glow_squid"),
    GOAT(EntityType.GOAT , "entity.minecraft.goat"),
    GUARDIAN(EntityType.GUARDIAN , "entity.minecraft.guardian"),
    HOGLIN(EntityType.HOGLIN , "entity.minecraft.hoglin"),
    MINECART_WITH_HOPPER(EntityType.MINECART_WITH_HOPPER , "entity.minecraft.hopper_minecart"),
    HORSE(EntityType.HORSE , "entity.minecraft.horse"),
    HUSK(EntityType.HUSK , "entity.minecraft.husk"),
    RAVAGER(EntityType.RAVAGER , "entity.minecraft.ravager"),
    ILLUSIONER(EntityType.ILLUSIONER , "entity.minecraft.illusioner"),
    ITEM(EntityType.ITEM , "entity.minecraft.item"),
    ITEM_FRAME(EntityType.ITEM_FRAME , "entity.minecraft.item_frame"),
    THE_KILLER_BUNNY(EntityType.THE_KILLER_BUNNY , "entity.minecraft.killer_bunny"),
    LEASH_KNOT(EntityType.LEASH_KNOT , "entity.minecraft.leash_knot"),
    LIGHTNING_BOLT(EntityType.LIGHTNING_BOLT , "entity.minecraft.lightning_bolt"),
    LLAMA(EntityType.LLAMA , "entity.minecraft.llama"),
    LLAMA_SPIT(EntityType.LLAMA_SPIT , "entity.minecraft.llama_spit"),
    MAGMA_CUBE(EntityType.MAGMA_CUBE , "entity.minecraft.magma_cube"),
    MARKER(EntityType.MARKER , "entity.minecraft.marker"),
    MINECART(EntityType.MINECART , "entity.minecraft.minecart"),
    MOOSHROOM(EntityType.MOOSHROOM , "entity.minecraft.mooshroom"),
    MULE(EntityType.MULE , "entity.minecraft.mule"),
    OCELOT(EntityType.OCELOT , "entity.minecraft.ocelot"),
    PAINTING(EntityType.PAINTING , "entity.minecraft.painting"),
    PANDA(EntityType.PANDA , "entity.minecraft.panda"),
    PARROT(EntityType.PARROT , "entity.minecraft.parrot"),
    PHANTOM(EntityType.PHANTOM , "entity.minecraft.phantom"),
    PIG(EntityType.PIG , "entity.minecraft.pig"),
    PIGLIN(EntityType.PIGLIN , "entity.minecraft.piglin"),
    PIGLIN_BRUTE(EntityType.PIGLIN_BRUTE , "entity.minecraft.piglin_brute"),
    PILLAGER(EntityType.PILLAGER , "entity.minecraft.pillager"),
    PLAYER(EntityType.PLAYER , "entity.minecraft.player"),
    POLAR_BEAR(EntityType.POLAR_BEAR , "entity.minecraft.polar_bear"),
    POTION(EntityType.POTION , "entity.minecraft.potion"),
    PUFFERFISH(EntityType.PUFFERFISH , "entity.minecraft.pufferfish"),
    RABBIT(EntityType.RABBIT , "entity.minecraft.rabbit"),
    SALMON(EntityType.SALMON , "entity.minecraft.salmon"),
    SHEEP(EntityType.SHEEP , "entity.minecraft.sheep"),
    SHULKER(EntityType.SHULKER , "entity.minecraft.shulker"),
    SHULKER_BULLET(EntityType.SHULKER_BULLET , "entity.minecraft.shulker_bullet"),
    SILVERFISH(EntityType.SILVERFISH , "entity.minecraft.silverfish"),
    SKELETON(EntityType.SKELETON , "entity.minecraft.skeleton"),
    SKELETON_HORSE(EntityType.SKELETON_HORSE , "entity.minecraft.skeleton_horse"),
    SLIME(EntityType.SLIME , "entity.minecraft.slime"),
    SMALL_FIREBALL(EntityType.SMALL_FIREBALL , "entity.minecraft.small_fireball"),
    SNOWBALL(EntityType.SNOWBALL , "entity.minecraft.snowball"),
    SNOW_GOLEM(EntityType.SNOW_GOLEM , "entity.minecraft.snow_golem"),
    MINECART_WITH_SPAWNER(EntityType.MINECART_WITH_SPAWNER , "entity.minecraft.spawner_minecart"),
    SPECTRAL_ARROW(EntityType.SPECTRAL_ARROW , "entity.minecraft.spectral_arrow"),
    SPIDER(EntityType.SPIDER , "entity.minecraft.spider"),
    SQUID(EntityType.SQUID , "entity.minecraft.squid"),
    STRAY(EntityType.STRAY , "entity.minecraft.stray"),
    STRIDER(EntityType.STRIDER , "entity.minecraft.strider"),
    PRIMED_TNT(EntityType.PRIMED_TNT , "entity.minecraft.tnt"),
    MINECART_WITH_TNT(EntityType.MINECART_WITH_TNT , "entity.minecraft.tnt_minecart"),
    TRADER_LLAMA(EntityType.TRADER_LLAMA , "entity.minecraft.trader_llama"),
    TRIDENT(EntityType.TRIDENT , "entity.minecraft.trident"),
    TROPICAL_FISH(EntityType.TROPICAL_FISH , "entity.minecraft.tropical_fish"),
    ANEMONE(EntityType.ANEMONE , "entity.minecraft.tropical_fish.predefined.0"),
    BLACK_TANG(EntityType.BLACK_TANG , "entity.minecraft.tropical_fish.predefined.1"),
    BLUE_TANG(EntityType.BLUE_TANG , "entity.minecraft.tropical_fish.predefined.2"),
    BUTTERFLYFISH(EntityType.BUTTERFLYFISH , "entity.minecraft.tropical_fish.predefined.3"),
    CICHLID(EntityType.CICHLID , "entity.minecraft.tropical_fish.predefined.4"),
    CLOWNFISH(EntityType.CLOWNFISH , "entity.minecraft.tropical_fish.predefined.5"),
    COTTON_CANDY_BETTA(EntityType.COTTON_CANDY_BETTA , "entity.minecraft.tropical_fish.predefined.6"),
    DOTTYBACK(EntityType.DOTTYBACK , "entity.minecraft.tropical_fish.predefined.7"),
    EMPEROR_RED_SNAPPER(EntityType.EMPEROR_RED_SNAPPER , "entity.minecraft.tropical_fish.predefined.8"),
    GOATFISH(EntityType.GOATFISH , "entity.minecraft.tropical_fish.predefined.9"),
    MOORISH_IDOL(EntityType.MOORISH_IDOL , "entity.minecraft.tropical_fish.predefined.10"),
    ORNATE_BUTTERFLYFISH(EntityType.ORNATE_BUTTERFLYFISH , "entity.minecraft.tropical_fish.predefined.11"),
    PARROTFISH(EntityType.PARROTFISH , "entity.minecraft.tropical_fish.predefined.12"),
    QUEEN_ANGELFISH(EntityType.QUEEN_ANGELFISH , "entity.minecraft.tropical_fish.predefined.13"),
    RED_CICHLID(EntityType.RED_CICHLID , "entity.minecraft.tropical_fish.predefined.14"),
    RED_LIPPED_BLENNY(EntityType.RED_LIPPED_BLENNY , "entity.minecraft.tropical_fish.predefined.15"),
    RED_SNAPPER(EntityType.RED_SNAPPER , "entity.minecraft.tropical_fish.predefined.16"),
    THREADFIN(EntityType.THREADFIN , "entity.minecraft.tropical_fish.predefined.17"),
    TOMATO_CLOWNFISH(EntityType.TOMATO_CLOWNFISH , "entity.minecraft.tropical_fish.predefined.18"),
    TRIGGERFISH(EntityType.TRIGGERFISH , "entity.minecraft.tropical_fish.predefined.19"),
    YELLOWTAIL_PARROTFISH(EntityType.YELLOWTAIL_PARROTFISH , "entity.minecraft.tropical_fish.predefined.20"),
    YELLOW_TANG(EntityType.YELLOW_TANG , "entity.minecraft.tropical_fish.predefined.21"),
    FLOPPER(EntityType.FLOPPER , "entity.minecraft.tropical_fish.type.flopper"),
    STRIPEY(EntityType.STRIPEY , "entity.minecraft.tropical_fish.type.stripey"),
    GLITTER(EntityType.GLITTER , "entity.minecraft.tropical_fish.type.glitter"),
    BLOCKFISH(EntityType.BLOCKFISH , "entity.minecraft.tropical_fish.type.blockfish"),
    BETTY(EntityType.BETTY , "entity.minecraft.tropical_fish.type.betty"),
    CLAYFISH(EntityType.CLAYFISH , "entity.minecraft.tropical_fish.type.clayfish"),
    KOB(EntityType.KOB , "entity.minecraft.tropical_fish.type.kob"),
    SUNSTREAK(EntityType.SUNSTREAK , "entity.minecraft.tropical_fish.type.sunstreak"),
    SNOOPER(EntityType.SNOOPER , "entity.minecraft.tropical_fish.type.snooper"),
    DASHER(EntityType.DASHER , "entity.minecraft.tropical_fish.type.dasher"),
    BRINELY(EntityType.BRINELY , "entity.minecraft.tropical_fish.type.brinely"),
    SPOTTY(EntityType.SPOTTY , "entity.minecraft.tropical_fish.type.spotty"),
    TURTLE(EntityType.TURTLE , "entity.minecraft.turtle"),
    VEX(EntityType.VEX , "entity.minecraft.vex"),
    ARMORER(EntityType.ARMORER , "entity.minecraft.villager.armorer"),
    BUTCHER(EntityType.BUTCHER , "entity.minecraft.villager.butcher"),
    CARTOGRAPHER(EntityType.CARTOGRAPHER , "entity.minecraft.villager.cartographer"),
    CLERIC(EntityType.CLERIC , "entity.minecraft.villager.cleric"),
    FARMER(EntityType.FARMER , "entity.minecraft.villager.farmer"),
    FISHERMAN(EntityType.FISHERMAN , "entity.minecraft.villager.fisherman"),
    FLETCHER(EntityType.FLETCHER , "entity.minecraft.villager.fletcher"),
    LEATHERWORKER(EntityType.LEATHERWORKER , "entity.minecraft.villager.leatherworker"),
    LIBRARIAN(EntityType.LIBRARIAN , "entity.minecraft.villager.librarian"),
    MASON(EntityType.MASON , "entity.minecraft.villager.mason"),
    VILLAGER(EntityType.VILLAGER , "entity.minecraft.villager.none"),
    NITWIT(EntityType.NITWIT , "entity.minecraft.villager.nitwit"),
    SHEPHERD(EntityType.SHEPHERD , "entity.minecraft.villager.shepherd"),
    TOOLSMITH(EntityType.TOOLSMITH , "entity.minecraft.villager.toolsmith"),
    WEAPONSMITH(EntityType.WEAPONSMITH , "entity.minecraft.villager.weaponsmith"),
    VILLAGER(EntityType.VILLAGER , "entity.minecraft.villager"),
    WANDERING_TRADER(EntityType.WANDERING_TRADER , "entity.minecraft.wandering_trader"),
    IRON_GOLEM(EntityType.IRON_GOLEM , "entity.minecraft.iron_golem"),
    VINDICATOR(EntityType.VINDICATOR , "entity.minecraft.vindicator"),
    WITCH(EntityType.WITCH , "entity.minecraft.witch"),
    WITHER(EntityType.WITHER , "entity.minecraft.wither"),
    WITHER_SKELETON(EntityType.WITHER_SKELETON , "entity.minecraft.wither_skeleton"),
    WITHER_SKULL(EntityType.WITHER_SKULL , "entity.minecraft.wither_skull"),
    WOLF(EntityType.WOLF , "entity.minecraft.wolf"),
    THROWN_BOTTLE_O'_ENCHANTING(EntityType.THROWN_BOTTLE_O'_ENCHANTING , "entity.minecraft.experience_bottle"),
    EXPERIENCE_ORB(EntityType.EXPERIENCE_ORB , "entity.minecraft.experience_orb"),
    ZOGLIN(EntityType.ZOGLIN , "entity.minecraft.zoglin"),
    ZOMBIE(EntityType.ZOMBIE , "entity.minecraft.zombie"),
    ZOMBIE_HORSE(EntityType.ZOMBIE_HORSE , "entity.minecraft.zombie_horse"),
    ZOMBIFIED_PIGLIN(EntityType.ZOMBIFIED_PIGLIN , "entity.minecraft.zombified_piglin"),
    ZOMBIE_VILLAGER(EntityType.ZOMBIE_VILLAGER , "entity.minecraft.zombie_villager");

    private static final Map<EntityType, EnumEntity> lookup = new HashMap<>();

    static {
        for (EnumEntity entity : EnumSet.allOf(EnumEntity.class))
            lookup.put(entity.getType(), entity);
    }

    private EntityType type;
    private String unlocalizedName;

    EnumEntity(EntityType type, String unlocalizedName) {
        this.type = type;
        this.unlocalizedName = unlocalizedName;
    }


    public static EnumEntity get(EntityType entityType) {
        return lookup.get(entityType);
    }


    public static String getSpawnEggName(ItemStack egg, String locale) {
        EntityType type = null;
        try {
            type = getEntityType(egg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        EnumEntity entity = get(type);
        return entity != null ?
                RTULangManager.translateToLocal("item.monsterPlacer.name", locale) + " "
                        + RTULangManager.translateToLocal(entity.getUnlocalizedName(), locale)
                : RTULangManager.translateToLocal("item.monsterPlacer.name", locale);
    }

    public static EntityType getEntityType(ItemStack egg) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Object nmsStack = Class.forName("org.bukkit.craftbukkit." + Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3] + "." + "inventory.CraftItemStack").getMethod("asNMSCopy", ItemStack.class).invoke(null, egg);
        Object tag = nmsStack.getClass().getMethod("getTag").invoke(nmsStack);
        Object entityTag = tag.getClass().getMethod("getCompound", String.class).invoke(tag, "EntityTag");
        String id = (String) entityTag.getClass().getMethod("getString", String.class).invoke(entityTag, "id");

        return EntityType.fromName(id.replace("minecraft:", ""));
    }

    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    public EntityType getType() {
        return type;
    }
}
