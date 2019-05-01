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
package org.spongepowered.api.data.manipulator.immutable;

import org.spongepowered.api.data.manipulator.ImmutableDataManipulator;
import org.spongepowered.api.data.manipulator.mutable.MappedData;
import org.spongepowered.api.data.value.MapValue;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface ImmutableMappedData<K, V, I extends ImmutableMappedData<K, V, I, M>, M extends MappedData<K, V, M, I>>
    extends ImmutableDataManipulator<I, M> {

    /**
     * Gets the {@code value} for the provided {@code key}, if available.
     *
     * @param key The key
     * @return The value, if available
     * @see Map#get(Object)
     */
    Optional<V> get(K key);

    /**
     * Gets a {@link Set} of {@code keys} available in this manipulator.
     *
     * @return The key set
     * @see Map#keySet()
     */
    Set<K> getMapKeys();

    /**
     * Gets the {@link java.util.Map.Entry} {@link Set} of values.
     *
     * @return The entry set
     * @see Map#entrySet()
     */
    default Set<Map.Entry<K, V>> getMapValues() {
        return asMap().entrySet();
    }

    /**
     * Gets the {@link MapValue.Immutable} of this manipulator.
     *
     * @return The map value of this manipulator
     */
    MapValue.Immutable<K, V> getMapValue();

    /**
     * Gets this manipulator as a {@link Map}.
     *
     * @return The map
     */
    default Map<K, V> asMap() {
        return getMapValue().get();
    }

}
