// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.VirtualMachineVolumeParameters;
import org.junit.jupiter.api.Assertions;

public final class VirtualMachineVolumeParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualMachineVolumeParameters model =
            BinaryData.fromString("{\"volumeId\":\"hhtklnvnafvvkyfe\"}").toObject(VirtualMachineVolumeParameters.class);
        Assertions.assertEquals("hhtklnvnafvvkyfe", model.volumeId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualMachineVolumeParameters model = new VirtualMachineVolumeParameters().withVolumeId("hhtklnvnafvvkyfe");
        model = BinaryData.fromObject(model).toObject(VirtualMachineVolumeParameters.class);
        Assertions.assertEquals("hhtklnvnafvvkyfe", model.volumeId());
    }
}