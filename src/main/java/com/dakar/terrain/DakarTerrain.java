package com.dakar.terrain;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(DakarTerrain.MODID)
public class DakarTerrain {
    public static final String MODID = "dakar_terrain";

    public static final DeferredRegister<MapCodec<? extends SurfaceRules.RuleSource>> RULES =
            DeferredRegister.create(Registries.MATERIAL_RULE, MODID);

    static {
        // Regla de superficie "dakar_terrain:vanilla_overworld": reutiliza las superficies
        // vanilla (arena en desierto, terracota en badlands, hierba, deepslate, bedrock...).
        RULES.register("vanilla_overworld", () -> VanillaOverworldRule.CODEC.codec());
    }

    public DakarTerrain(IEventBus modEventBus) {
        RULES.register(modEventBus);
    }
}
