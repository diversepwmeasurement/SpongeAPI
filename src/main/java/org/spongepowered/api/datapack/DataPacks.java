/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.datapack;

import org.spongepowered.api.advancement.AdvancementTemplate;
import org.spongepowered.api.block.BlockType;
import org.spongepowered.api.entity.EntityType;
import org.spongepowered.api.fluid.FluidType;
import org.spongepowered.api.item.ItemType;
import org.spongepowered.api.item.recipe.RecipeRegistration;
import org.spongepowered.api.tag.TagTemplate;
import org.spongepowered.api.world.WorldTypeTemplate;
import org.spongepowered.api.world.biome.BiomeTemplate;
import org.spongepowered.api.world.generation.carver.CarverTemplate;
import org.spongepowered.api.world.generation.feature.FeatureTemplate;
import org.spongepowered.api.world.generation.feature.PlacedFeatureTemplate;
import org.spongepowered.api.world.server.WorldTemplate;

/**
 * Sponge provided default data packs for plugins. When building a {@link DataPackEntry} these packs are set by default.
 */
public final class DataPacks {

    public static final DataPack<AdvancementTemplate> ADVANCEMENT = DataPackTypes.ADVANCEMENT.pack("plugin_advancements", "Sponge plugin provided advancements");

    public static final DataPack<RecipeRegistration> RECIPE = DataPackTypes.RECIPE.pack("plugin_recipes", "Sponge plugin provided recipes");

    public static final DataPack<TagTemplate<BlockType>> BLOCK_TAG = DataPackTypes.BLOCK_TAG.pack("plugin_tags", "Sponge plugin provided tags");

    public static final DataPack<TagTemplate<FluidType>> FLUID_TAG = DataPackTypes.FLUID_TAG.pack("plugin_tags", "Sponge plugin provided tags");

    public static final DataPack<TagTemplate<ItemType>> ITEM_TAG = DataPackTypes.ITEM_TAG.pack("plugin_tags", "Sponge plugin provided tags");

    public static final DataPack<TagTemplate<EntityType<?>>> ENTITY_TAG = DataPackTypes.ENTITY_TAG.pack("plugin_tags", "Sponge plugin provided tags");

    public static final DataPack<BiomeTemplate> BIOME = DataPackTypes.BIOME.pack("plugin_biomes", "Sponge plugin provided biomes");

    public static final DataPack<CarverTemplate> CARVER = DataPackTypes.CARVER.pack("plugin_carvers", "Sponge plugin provided carvers");

    public static final DataPack<FeatureTemplate> FEATURE = DataPackTypes.FEATURE.pack("plugin_features", "Sponge plugin provided features");

    public static final DataPack<PlacedFeatureTemplate> PLACED_FEATURE = DataPackTypes.PLACED_FEATURE.pack("plugin_features", "Sponge plugin provided placed features");

    public static final DataPack<WorldTypeTemplate> WORLD_TYPE = DataPackTypes.WORLD_TYPE.pack("plugin_world_types", "Sponge plugin provided world types");

    public static final DataPack<WorldTemplate> WORLD = DataPackTypes.WORLD.pack("plugin_worlds", "Sponge plugin provided worlds");


    private DataPacks() {
    }
}
