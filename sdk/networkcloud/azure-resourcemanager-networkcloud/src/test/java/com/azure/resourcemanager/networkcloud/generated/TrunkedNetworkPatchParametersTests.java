// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.TrunkedNetworkPatchParameters;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TrunkedNetworkPatchParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TrunkedNetworkPatchParameters model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"py\":\"qtanarfdlpuk\",\"gkhnmgbrouxddbh\":\"neizjcpe\",\"ulontacnpqwteht\":\"hpfpazjzoywjxhp\",\"ljyoogwx\":\"evrh\"}}")
                .toObject(TrunkedNetworkPatchParameters.class);
        Assertions.assertEquals("qtanarfdlpuk", model.tags().get("py"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TrunkedNetworkPatchParameters model =
            new TrunkedNetworkPatchParameters()
                .withTags(
                    mapOf(
                        "py",
                        "qtanarfdlpuk",
                        "gkhnmgbrouxddbh",
                        "neizjcpe",
                        "ulontacnpqwteht",
                        "hpfpazjzoywjxhp",
                        "ljyoogwx",
                        "evrh"));
        model = BinaryData.fromObject(model).toObject(TrunkedNetworkPatchParameters.class);
        Assertions.assertEquals("qtanarfdlpuk", model.tags().get("py"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}