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
    AREA_EFFECT_CLOUD(EntityType. , "entity.minecraft.area_effect_cloud"),
    ARMOR_STAND(EntityType. , "entity.minecraft.armor_stand"),
    ARROW(EntityType. , "entity.minecraft.arrow"),
    AXOLOTL(EntityType. , "entity.minecraft.axolotl"),
    BAT(EntityType. , "entity.minecraft.bat"),
    BEE(EntityType. , "entity.minecraft.bee"),
    BLAZE(EntityType. , "entity.minecraft.blaze"),
    BOAT(EntityType. , "entity.minecraft.boat"),
    CAT(EntityType. , "entity.minecraft.cat"),
    CAVE_SPIDER(EntityType. , "entity.minecraft.cave_spider"),
    MINECART_WITH_CHEST(EntityType. , "entity.minecraft.chest_minecart"),
    CHICKEN(EntityType. , "entity.minecraft.chicken"),
    MINECART_WITH_COMMAND_BLOCK(EntityType. , "entity.minecraft.command_block_minecart"),
    COD(EntityType. , "entity.minecraft.cod"),
    COW(EntityType. , "entity.minecraft.cow"),
    CREEPER(EntityType. , "entity.minecraft.creeper"),
    DOLPHIN(EntityType. , "entity.minecraft.dolphin"),
    DONKEY(EntityType. , "entity.minecraft.donkey"),
    DROWNED(EntityType. , "entity.minecraft.drowned"),
    DRAGON_FIREBALL(EntityType. , "entity.minecraft.dragon_fireball"),
    THROWN_EGG(EntityType. , "entity.minecraft.egg"),
    ELDER_GUARDIAN(EntityType. , "entity.minecraft.elder_guardian"),
    END_CRYSTAL(EntityType. , "entity.minecraft.end_crystal"),
    ENDER_DRAGON(EntityType. , "entity.minecraft.ender_dragon"),
    THROWN_ENDER_PEARL(EntityType. , "entity.minecraft.ender_pearl"),
    ENDERMAN(EntityType. , "entity.minecraft.enderman"),
    ENDERMITE(EntityType. , "entity.minecraft.endermite"),
    EVOKER_FANGS(EntityType. , "entity.minecraft.evoker_fangs"),
    EVOKER(EntityType. , "entity.minecraft.evoker"),
    EYE_OF_ENDER(EntityType. , "entity.minecraft.eye_of_ender"),
    FALLING_BLOCK(EntityType. , "entity.minecraft.falling_block"),
    FIREBALL(EntityType. , "entity.minecraft.fireball"),
    FIREWORK_ROCKET(EntityType. , "entity.minecraft.firework_rocket"),
    FISHING_BOBBER(EntityType. , "entity.minecraft.fishing_bobber"),
    FOX(EntityType. , "entity.minecraft.fox"),
    MINECART_WITH_FURNACE(EntityType. , "entity.minecraft.furnace_minecart"),
    GHAST(EntityType. , "entity.minecraft.ghast"),
    GIANT(EntityType. , "entity.minecraft.giant"),
    GLOW_ITEM_FRAME(EntityType. , "entity.minecraft.glow_item_frame"),
    GLOW_SQUID(EntityType. , "entity.minecraft.glow_squid"),
    GOAT(EntityType. , "entity.minecraft.goat"),
    GUARDIAN(EntityType. , "entity.minecraft.guardian"),
    HOGLIN(EntityType. , "entity.minecraft.hoglin"),
    MINECART_WITH_HOPPER(EntityType. , "entity.minecraft.hopper_minecart"),
    HORSE(EntityType. , "entity.minecraft.horse"),
    HUSK(EntityType. , "entity.minecraft.husk"),
    RAVAGER(EntityType. , "entity.minecraft.ravager"),
    ILLUSIONER(EntityType. , "entity.minecraft.illusioner"),
    ITEM(EntityType. , "entity.minecraft.item"),
    ITEM_FRAME(EntityType. , "entity.minecraft.item_frame"),
    THE_KILLER_BUNNY(EntityType. , "entity.minecraft.killer_bunny"),
    LEASH_KNOT(EntityType. , "entity.minecraft.leash_knot"),
    LIGHTNING_BOLT(EntityType. , "entity.minecraft.lightning_bolt"),
    LLAMA(EntityType. , "entity.minecraft.llama"),
    LLAMA_SPIT(EntityType. , "entity.minecraft.llama_spit"),
    MAGMA_CUBE(EntityType. , "entity.minecraft.magma_cube"),
    MARKER(EntityType. , "entity.minecraft.marker"),
    MINECART(EntityType. , "entity.minecraft.minecart"),
    MOOSHROOM(EntityType. , "entity.minecraft.mooshroom"),
    MULE(EntityType. , "entity.minecraft.mule"),
    OCELOT(EntityType. , "entity.minecraft.ocelot"),
    PAINTING(EntityType. , "entity.minecraft.painting"),
    PANDA(EntityType. , "entity.minecraft.panda"),
    PARROT(EntityType. , "entity.minecraft.parrot"),
    PHANTOM(EntityType. , "entity.minecraft.phantom"),
    PIG(EntityType. , "entity.minecraft.pig"),
    PIGLIN(EntityType. , "entity.minecraft.piglin"),
    PIGLIN_BRUTE(EntityType. , "entity.minecraft.piglin_brute"),
    PILLAGER(EntityType. , "entity.minecraft.pillager"),
    PLAYER(EntityType. , "entity.minecraft.player"),
    POLAR_BEAR(EntityType. , "entity.minecraft.polar_bear"),
    POTION(EntityType. , "entity.minecraft.potion"),
    PUFFERFISH(EntityType. , "entity.minecraft.pufferfish"),
    RABBIT(EntityType. , "entity.minecraft.rabbit"),
    SALMON(EntityType. , "entity.minecraft.salmon"),
    SHEEP(EntityType. , "entity.minecraft.sheep"),
    SHULKER(EntityType. , "entity.minecraft.shulker"),
    SHULKER_BULLET(EntityType. , "entity.minecraft.shulker_bullet"),
    SILVERFISH(EntityType. , "entity.minecraft.silverfish"),
    SKELETON(EntityType. , "entity.minecraft.skeleton"),
    SKELETON_HORSE(EntityType. , "entity.minecraft.skeleton_horse"),
    SLIME(EntityType. , "entity.minecraft.slime"),
    SMALL_FIREBALL(EntityType. , "entity.minecraft.small_fireball"),
    SNOWBALL(EntityType. , "entity.minecraft.snowball"),
    SNOW_GOLEM(EntityType. , "entity.minecraft.snow_golem"),
    MINECART_WITH_SPAWNER(EntityType. , "entity.minecraft.spawner_minecart"),
    SPECTRAL_ARROW(EntityType. , "entity.minecraft.spectral_arrow"),
    SPIDER(EntityType. , "entity.minecraft.spider"),
    SQUID(EntityType. , "entity.minecraft.squid"),
    STRAY(EntityType. , "entity.minecraft.stray"),
    STRIDER(EntityType. , "entity.minecraft.strider"),
    PRIMED_TNT(EntityType. , "entity.minecraft.tnt"),
    MINECART_WITH_TNT(EntityType. , "entity.minecraft.tnt_minecart"),
    TRADER_LLAMA(EntityType. , "entity.minecraft.trader_llama"),
    TRIDENT(EntityType. , "entity.minecraft.trident"),
    TROPICAL_FISH(EntityType. , "entity.minecraft.tropical_fish"),
    ANEMONE(EntityType. , "entity.minecraft.tropical_fish.predefined.0"),
    BLACK_TANG(EntityType. , "entity.minecraft.tropical_fish.predefined.1"),
    BLUE_TANG(EntityType. , "entity.minecraft.tropical_fish.predefined.2"),
    BUTTERFLYFISH(EntityType. , "entity.minecraft.tropical_fish.predefined.3"),
    CICHLID(EntityType. , "entity.minecraft.tropical_fish.predefined.4"),
    CLOWNFISH(EntityType. , "entity.minecraft.tropical_fish.predefined.5"),
    COTTON_CANDY_BETTA(EntityType. , "entity.minecraft.tropical_fish.predefined.6"),
    DOTTYBACK(EntityType. , "entity.minecraft.tropical_fish.predefined.7"),
    EMPEROR_RED_SNAPPER(EntityType. , "entity.minecraft.tropical_fish.predefined.8"),
    GOATFISH(EntityType. , "entity.minecraft.tropical_fish.predefined.9"),
    MOORISH_IDOL(EntityType. , "entity.minecraft.tropical_fish.predefined.10"),
    ORNATE_BUTTERFLYFISH(EntityType. , "entity.minecraft.tropical_fish.predefined.11"),
    PARROTFISH(EntityType. , "entity.minecraft.tropical_fish.predefined.12"),
    QUEEN_ANGELFISH(EntityType. , "entity.minecraft.tropical_fish.predefined.13"),
    RED_CICHLID(EntityType. , "entity.minecraft.tropical_fish.predefined.14"),
    RED_LIPPED_BLENNY(EntityType. , "entity.minecraft.tropical_fish.predefined.15"),
    RED_SNAPPER(EntityType. , "entity.minecraft.tropical_fish.predefined.16"),
    THREADFIN(EntityType. , "entity.minecraft.tropical_fish.predefined.17"),
    TOMATO_CLOWNFISH(EntityType. , "entity.minecraft.tropical_fish.predefined.18"),
    TRIGGERFISH(EntityType. , "entity.minecraft.tropical_fish.predefined.19"),
    YELLOWTAIL_PARROTFISH(EntityType. , "entity.minecraft.tropical_fish.predefined.20"),
    YELLOW_TANG(EntityType. , "entity.minecraft.tropical_fish.predefined.21"),
    FLOPPER(EntityType. , "entity.minecraft.tropical_fish.type.flopper"),
    STRIPEY(EntityType. , "entity.minecraft.tropical_fish.type.stripey"),
    GLITTER(EntityType. , "entity.minecraft.tropical_fish.type.glitter"),
    BLOCKFISH(EntityType. , "entity.minecraft.tropical_fish.type.blockfish"),
    BETTY(EntityType. , "entity.minecraft.tropical_fish.type.betty"),
    CLAYFISH(EntityType. , "entity.minecraft.tropical_fish.type.clayfish"),
    KOB(EntityType. , "entity.minecraft.tropical_fish.type.kob"),
    SUNSTREAK(EntityType. , "entity.minecraft.tropical_fish.type.sunstreak"),
    SNOOPER(EntityType. , "entity.minecraft.tropical_fish.type.snooper"),
    DASHER(EntityType. , "entity.minecraft.tropical_fish.type.dasher"),
    BRINELY(EntityType. , "entity.minecraft.tropical_fish.type.brinely"),
    SPOTTY(EntityType. , "entity.minecraft.tropical_fish.type.spotty"),
    TURTLE(EntityType. , "entity.minecraft.turtle"),
    VEX(EntityType. , "entity.minecraft.vex"),
    ARMORER(EntityType. , "entity.minecraft.villager.armorer"),
    BUTCHER(EntityType. , "entity.minecraft.villager.butcher"),
    CARTOGRAPHER(EntityType. , "entity.minecraft.villager.cartographer"),
    CLERIC(EntityType. , "entity.minecraft.villager.cleric"),
    FARMER(EntityType. , "entity.minecraft.villager.farmer"),
    FISHERMAN(EntityType. , "entity.minecraft.villager.fisherman"),
    FLETCHER(EntityType. , "entity.minecraft.villager.fletcher"),
    LEATHERWORKER(EntityType. , "entity.minecraft.villager.leatherworker"),
    LIBRARIAN(EntityType. , "entity.minecraft.villager.librarian"),
    MASON(EntityType. , "entity.minecraft.villager.mason"),
    VILLAGER(EntityType. , "entity.minecraft.villager.none"),
    NITWIT(EntityType. , "entity.minecraft.villager.nitwit"),
    SHEPHERD(EntityType. , "entity.minecraft.villager.shepherd"),
    TOOLSMITH(EntityType. , "entity.minecraft.villager.toolsmith"),
    WEAPONSMITH(EntityType. , "entity.minecraft.villager.weaponsmith"),
    VILLAGER(EntityType. , "entity.minecraft.villager"),
    WANDERING_TRADER(EntityType. , "entity.minecraft.wandering_trader"),
    IRON_GOLEM(EntityType. , "entity.minecraft.iron_golem"),
    VINDICATOR(EntityType. , "entity.minecraft.vindicator"),
    WITCH(EntityType. , "entity.minecraft.witch"),
    WITHER(EntityType. , "entity.minecraft.wither"),
    WITHER_SKELETON(EntityType. , "entity.minecraft.wither_skeleton"),
    WITHER_SKULL(EntityType. , "entity.minecraft.wither_skull"),
    WOLF(EntityType. , "entity.minecraft.wolf"),
    THROWN_BOTTLE_O'_ENCHANTING(EntityType. , "entity.minecraft.experience_bottle"),
    EXPERIENCE_ORB(EntityType. , "entity.minecraft.experience_orb"),
    ZOGLIN(EntityType. , "entity.minecraft.zoglin"),
    ZOMBIE(EntityType. , "entity.minecraft.zombie"),
    ZOMBIE_HORSE(EntityType. , "entity.minecraft.zombie_horse"),
    ZOMBIFIED_PIGLIN(EntityType. , "entity.minecraft.zombified_piglin"),
    ZOMBIE_VILLAGER(EntityType. , "entity.minecraft.zombie_villager");
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
