// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.StorageApplianceCommandSpecification;
import com.azure.resourcemanager.networkcloud.models.StorageApplianceRunReadCommandsParameters;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class StorageApplianceRunReadCommandsParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageApplianceRunReadCommandsParameters model =
            BinaryData
                .fromString(
                    "{\"commands\":[{\"arguments\":[\"uuuybnchrsziz\",\"yuel\",\"etndnbfqyggagf\"],\"command\":\"nlgmtrwahzjmu\"}],\"limitTimeSeconds\":521923206412713182}")
                .toObject(StorageApplianceRunReadCommandsParameters.class);
        Assertions.assertEquals("uuuybnchrsziz", model.commands().get(0).arguments().get(0));
        Assertions.assertEquals("nlgmtrwahzjmu", model.commands().get(0).command());
        Assertions.assertEquals(521923206412713182L, model.limitTimeSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageApplianceRunReadCommandsParameters model =
            new StorageApplianceRunReadCommandsParameters()
                .withCommands(
                    Arrays
                        .asList(
                            new StorageApplianceCommandSpecification()
                                .withArguments(Arrays.asList("uuuybnchrsziz", "yuel", "etndnbfqyggagf"))
                                .withCommand("nlgmtrwahzjmu")))
                .withLimitTimeSeconds(521923206412713182L);
        model = BinaryData.fromObject(model).toObject(StorageApplianceRunReadCommandsParameters.class);
        Assertions.assertEquals("uuuybnchrsziz", model.commands().get(0).arguments().get(0));
        Assertions.assertEquals("nlgmtrwahzjmu", model.commands().get(0).command());
        Assertions.assertEquals(521923206412713182L, model.limitTimeSeconds());
    }
}