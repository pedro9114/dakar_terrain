package com.dakar.terrain;

import com.mojang.serialization.MapCodec;
import net.minecraft.data.worldgen.SurfaceRuleData;
import net.minecraft.util.KeyDispatchDataCodec;
import net.minecraft.world.level.levelgen.SurfaceRules;

public record VanillaOverworldRule() implements SurfaceRules.RuleSource {
    public static final KeyDispatchDataCodec<VanillaOverworldRule> CODEC =
            KeyDispatchDataCodec.of(MapCodec.unit(new VanillaOverworldRule()));

    private static class Holder {
        static final SurfaceRules.RuleSource RULE = SurfaceRuleData.overworld();
    }

    @Override
    public KeyDispatchDataCodec<? extends SurfaceRules.RuleSource> codec() {
        return CODEC;
    }

    @Override
    public SurfaceRules.SurfaceRule apply(SurfaceRules.Context context) {
        return Holder.RULE.apply(context);
    }
}
