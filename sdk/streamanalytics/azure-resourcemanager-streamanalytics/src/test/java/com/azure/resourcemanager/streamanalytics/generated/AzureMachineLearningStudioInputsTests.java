// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.AzureMachineLearningStudioInputColumn;
import com.azure.resourcemanager.streamanalytics.models.AzureMachineLearningStudioInputs;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureMachineLearningStudioInputsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMachineLearningStudioInputs model = BinaryData.fromString(
            "{\"name\":\"ewwwfbkrvrnsv\",\"columnNames\":[{\"name\":\"ohxcrsbfova\",\"dataType\":\"ruvw\",\"mapTo\":1393923794}]}")
            .toObject(AzureMachineLearningStudioInputs.class);
        Assertions.assertEquals("ewwwfbkrvrnsv", model.name());
        Assertions.assertEquals("ohxcrsbfova", model.columnNames().get(0).name());
        Assertions.assertEquals("ruvw", model.columnNames().get(0).dataType());
        Assertions.assertEquals(1393923794, model.columnNames().get(0).mapTo());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMachineLearningStudioInputs model = new AzureMachineLearningStudioInputs().withName("ewwwfbkrvrnsv")
            .withColumnNames(Arrays.asList(new AzureMachineLearningStudioInputColumn().withName("ohxcrsbfova")
                .withDataType("ruvw")
                .withMapTo(1393923794)));
        model = BinaryData.fromObject(model).toObject(AzureMachineLearningStudioInputs.class);
        Assertions.assertEquals("ewwwfbkrvrnsv", model.name());
        Assertions.assertEquals("ohxcrsbfova", model.columnNames().get(0).name());
        Assertions.assertEquals("ruvw", model.columnNames().get(0).dataType());
        Assertions.assertEquals(1393923794, model.columnNames().get(0).mapTo());
    }
}
