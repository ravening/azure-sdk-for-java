// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.ManagedResourceGroupConfiguration;
import org.junit.jupiter.api.Assertions;

public final class ManagedResourceGroupConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedResourceGroupConfiguration model =
            BinaryData
                .fromString("{\"location\":\"rbirphxe\",\"name\":\"yva\"}")
                .toObject(ManagedResourceGroupConfiguration.class);
        Assertions.assertEquals("rbirphxe", model.location());
        Assertions.assertEquals("yva", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedResourceGroupConfiguration model =
            new ManagedResourceGroupConfiguration().withLocation("rbirphxe").withName("yva");
        model = BinaryData.fromObject(model).toObject(ManagedResourceGroupConfiguration.class);
        Assertions.assertEquals("rbirphxe", model.location());
        Assertions.assertEquals("yva", model.name());
    }
}